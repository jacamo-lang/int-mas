package int4mas;

import jason.asSemantics.*;
import jason.asSyntax.*;
import jason.asSyntax.Trigger.*;

import java.util.*;
import java.util.logging.Logger;

import aux.LoggerManager;

import c4jason.CAgentArch;
import c4jason.PendingAction;
import cartago.*;
import cartago.events.*;

public class XCAgentArch extends CAgentArch {
	private static Map<String, ArtifactId> scenes = new HashMap<String, ArtifactId>();
	private Logger logger = Logger.getLogger(LoggerManager.class.getName());
	private Map<String, String> msgWaiting = new HashMap<String, String>(); 
	
	/*
	public static void addScene(ArtifactId aid) {
		scenes.put(aid.getName(), aid);
	}*/
	
	private void interceptAction(String agentId, String artifactId, String action, String protocolId) {
		Op op = createOp("processAction", agentId, artifactId, action, protocolId);
		
		ArtifactId aid = searchScene(protocolId);
		
		IAlignmentTest test = null;
		long timeout = Long.MAX_VALUE;
		
		try {
			long actId = envSession.doAction(aid,op,test,timeout);
		} catch (CartagoException e) {
			e.printStackTrace();
		}
	}
	
	private void interceptMessage(String sourceId, String destinationId, String performative, String content, String protocolId) {
		Op op = createOp("processMessage", sourceId, destinationId, performative, content, protocolId);
		
		ArtifactId aid = searchScene(protocolId);
		
		IAlignmentTest test = null;
		long timeout = Long.MAX_VALUE;
		
		try {
			long actId = envSession.doAction(aid,op,test,timeout);
		} catch (CartagoException e) {
			e.printStackTrace();
		}
	}
	
	private void interceptEvent(String artifactId, String signal, String destinationId) {
		Op op = createOp("processEvent", artifactId, signal, destinationId);
		
		searchScene(null);
		
		for (ArtifactId aid : scenes.values()) {
			IAlignmentTest test = null;
			long timeout = Long.MAX_VALUE;
			
			try {
				//System.out.println("Enviando event....... " + op);
				long actId = envSession.doAction(aid,op,test,timeout);
				
				//System.out.println("Enviando event FOI....... " + op);
			} catch (CartagoException e) {
				e.printStackTrace();
			}
		}
	}
	
	private Op createOp(String op, Object... params) {
		return new Op(op, params);
	}
	
	private void printAllArtifacts() {
		Collection<Object> objects = getJavaLib().getAllCurrentObjects(); //TODO criada getAllCurrentObjects no cartago
		
		for (Object o : objects) {
			if (o instanceof ArtifactId) {
				System.out.println("Artefato: " + ((ArtifactId) o).getName());
			}
			
		}
	}
	
	private ArtifactId searchScene(String protocolId) {
		Collection<Object> objects = getJavaLib().getAllCurrentObjects(); //TODO criada getAllCurrentObjects no cartago
		if (protocolId == null) {
			for (Object o : objects) {
				if (o instanceof ArtifactId) {
					ArtifactId aid = (ArtifactId) o;
					
					if (aid.getArtifactType().equals("int4mas.SceneArtifact") && !scenes.containsKey(aid.getName())) {
						scenes.put(aid.getName(), aid);
						
						logger.info("Added scene " + aid.getName());
						return aid;
					}
				}
			}			
		} else {
			if (scenes.containsKey(protocolId)) {
				return scenes.get(protocolId);
			}
			
			for (Object o : objects) {
				if (o instanceof ArtifactId) {
					ArtifactId aid = (ArtifactId) o;
					
					if (aid.getArtifactType().equals("int4mas.SceneArtifact") && aid.getName().equals(protocolId)) {
						scenes.put(protocolId, aid);
						
						logger.info("Added scene " + aid.getName());
						return aid;
					}
				}
			}
		}
		return null;
	}
	
	public void act(ActionExec actionExec, List<ActionExec> feedback) {

		Structure action = actionExec.getActionTerm();
		
		ArtifactId aid = null;
		WorkspaceId wspId = null;
		String artName = null;
		String protocolId = null;
		boolean failed = false;
		ListTerm lt =  action.getAnnots();
		
		if (lt != null){
			Iterator<Term> it = lt.iterator();
			while (it.hasNext()){
				Term annot = it.next();
				if (annot.isStructure()){
					
					Structure st = (Structure)annot;
					if (st.getFunctor().equals("artifact_name")){
						artName = ((StringTerm)(st.getTerm(0))).getString();
					} else if (st.getFunctor().equals("artifact_id")){
						Object obj = getObject(st.getTerm(0));
						if (obj != null && obj instanceof ArtifactId){
							aid = (ArtifactId) obj;
						}
					} else if (st.getFunctor().equals("wsp_id")){
						Object obj = getObject(st.getTerm(0));
						if (obj != null && obj instanceof WorkspaceId){
							wspId = (WorkspaceId) obj;
						}
					} else if (st.getFunctor().equals("protocol_id")){ //FIXME Create to tell how protocol the agent is playing 
						protocolId = ((StringTerm)(st.getTerm(0))).getString();
						lt.remove(annot);
					} else {
						logger.warning("Use failed: unknown annotation "+annot);
						Term reason = Literal.parseLiteral("action_failed("+action+",unknown_annotation)");
						String msg = "Use  error - unknown annotation "+annot;
						notifyActionFailure(actionExec,reason,msg);
						failed = true;
						break;
					}
				}
			}
		}
		
		if (protocolId != null && !failed && aid != null && !scenes.containsKey(aid.getName())) {
			Op op = parseOp(action);
		  
			logger.info("Interceptado acao: " + op + " # " + op.getName() + " Artefato: " + aid.getName() + " Protocol: " + protocolId + " agente " + getAgName() + " ## " + action.toString());
			
			Structure actionClone = (Structure) action.clone();
			actionClone.clearAnnots();
			interceptAction(getAgName(), aid.getName(), actionClone.toString(), protocolId);
		}
		super.act(actionExec, feedback);
	}
	
	public List<Literal> perceive() {
		try {
			CartagoEvent evt = envSession.fetchNextPercept();
			
			if (evt != null){
				Literal l = null;

				if (evt instanceof ActionSucceededEvent){
					ActionSucceededEvent ev = (ActionSucceededEvent) evt;
					PendingAction action = pendingActions.remove(ev.getActionId());
					// logger.info("Processing action succeeded: "+action.getAction());
					if (action != null) {
						Op op = ev.getOp();
						
						notifyActionSuccess(op, action.getAction(), action.getActionExec());
						if (ev instanceof FocusSucceededEvent){
							FocusSucceededEvent ev1 = (FocusSucceededEvent) ev;
							addObsPropertiesBel(ev1.getTargetArtifact(), ev1.getObsProperties());
						} else if (ev instanceof StopFocusSucceededEvent){
							StopFocusSucceededEvent ev1 = (StopFocusSucceededEvent) ev;
							removeObsPropertiesBel(ev1.getTargetArtifact(), ev1.getObsProperties());
						} else if (ev instanceof JoinWSPSucceededEvent){
							JoinWSPSucceededEvent ev1 = (JoinWSPSucceededEvent)	ev;
							//System.out.println("JOIN OK "+ev1.getWorkspaceId().getName() + " " + ev.getArtifactId());
							
							/*
							 * THIS MUST BE DISCUSSED: do we switch the current wsp automatically to the new one?
							 */
							this.setCurrentWsp(ev1.getWorkspaceId());
						} else if (ev instanceof ConsultManualSucceededEvent) {
							ConsultManualSucceededEvent ev1 = (ConsultManualSucceededEvent) ev;
							this.consultManual(ev1.getManual());
						}
					}
				
				} else if (evt instanceof ActionFailedEvent){
					ActionFailedEvent ev = (ActionFailedEvent)evt;
					PendingAction action = pendingActions.remove(ev.getActionId());
					if (action != null) {
						try {
							Term reason = null;
							Tuple failureInfo = ev.getFailureDescr();
							try {
								if (failureInfo != null){
									reason = lib.tupleToTerm(failureInfo);
								}
							} catch (Exception ex){
								ex.printStackTrace();
							}	
							notifyActionFailure(action.getActionExec(), reason, ev.getFailureMsg());
						} catch (Exception ex){
							ex.printStackTrace();
						}	
					}
				} else if (evt instanceof FocussedArtifactDisposedEvent){
					//logger.info("FOCUSSED ARTIFACT DISPOSED...");
					FocussedArtifactDisposedEvent ev = (FocussedArtifactDisposedEvent)evt;
					removeObsPropertiesBel(ev.getArtifactId(), ev.getObsProperties());
				} else if (evt instanceof ArtifactObsEvent){
					ArtifactObsEvent ev = (ArtifactObsEvent)evt;
					//logger.warning("NEW OBS EVENT: "+evt);

					Tuple signal = ev.getSignal();
					if (signal != null){
						//System.out.println("signal: "+signal);
						l = obsEventToLiteral(ev,lib);
						Trigger te = new Trigger(TEOperator.add, TEType.belief, l);
						getTS().updateEvents(new Event(te, Intention.EmptyInt));
						
						
						if (!scenes.containsKey(ev.getArtifactId().getName())) {
							logger.info("Intercepta signal/event: " + ev.getId() + " # " + signal + " artefato: " + ev.getArtifactId().getName() + " agente " + getAgName());
							interceptEvent(ev.getArtifactId().getName(), signal.toString(), getAgName());
							//intercepter.addTrigger(new lib.EventTrigger(ev.getArtifactId().getName(), signal.toString(), getAgName()));
						}
					}
					
					ArtifactObsProperty[] props = ev.getChangedProperties();
					if (props!=null){
						for (ArtifactObsProperty prop: props){
							String propName = prop.getName();
							String propId = prop.getFullId();
							
							// logger.warning("UPDATE OBS PROP: "+propName+" "+prop);
							// logger.warning("prop to change "+propName+" "+propId);
							try {
								/* finding the belief */
								Iterator<Literal> it = this.getObsPropBeliefs(prop);
								boolean found = false;
								Literal lold = null;
								ListTerm annots = null;
								while (!found && it.hasNext()){
									lold = it.next();
									// logger.warning("FOUND BELIEF TO UPDATE "+lold+" "+lold.getAnnots());
									annots = lold.getAnnots("obs_prop_id");
									if (! annots.isEmpty()){
										for (Term annot: annots){
											StringTerm st = (StringTerm)((((Structure)annot).getTerm(0)));
											if (st.getString().equals(propId)){
												//logger.warning("FOUND THE OBS ID "+st);
												found = true;
												break;
											}
										}
									}
								}
								if (found){
									//Literal removedLit = lold.copy().forceFullLiteralImpl();
									if (annots.size() == 1){ 
										// it was the only one
										//logger.warning("REMOVING BEL: "+lold);
										if (!belBase.remove(lold)){
											logger.warning("obs prop not found during bel update: "+propName+" "+ev.getArtifactId().getName());
										}
									} else {
										// removedLit.clearAnnots();
										//logger.warning("MULTIPLE OBS PROP IN THE SAME BELIEF "+lold+" "+lold.getAnnots());
										ArtifactId source = ev.getArtifactId();
										//long propId = ev.getProperty().getId();
										Iterator<Term> it2 = lold.getAnnots().iterator();
										while (it2.hasNext()){
											Term t = it2.next();
											if (t.isStructure()){
												Structure st = (Structure)t;
												//logger.warning("CHECKING ANNOT "+st);
												if (st.getFunctor().equals("obs_prop_id")){
													StringTerm sst = (StringTerm)((((Structure)st).getTerm(0)));
													if (sst.getString().equals(propId)){
														it2.remove();
														//logger.warning("--> REMOVING IT since it is "+propId);
														//removedLit.addAnnot(t);
													}
												} else if (st.getArity() > 0){
													Object artId = lib.termToObject(st.getTerm(0));
													if (artId != null && artId.equals(source)){
														//logger.warning("--> REMOVING ANNOT since it is of "+source);
														it2.remove();
														//removedLit.addAnnot(t);
													}
												}
											}
										}
									}
									/*
									Trigger te = new Trigger(TEOperator.del, TEType.belief, removedLit);
									getTS().updateEvents(new Event(te, Intention.EmptyInt));
									*/
								} else {
									logger.warning("!! obs prop not found during bel update: "+propName+" "+ev.getArtifactId().getName()+" "+annots);
								}

								l = obsPropToLiteral(propId, ev.getArtifactId(), propName, prop.getValues(), lib);
								if (belBase.add(l)) {
									// logger.warning("AGENT: "+getTS().getUserAgArch().getAgName()+" UPDATED BELIEF: "+l);
									Trigger te = new Trigger(TEOperator.add, TEType.belief, l.copy());
									getTS().updateEvents(new Event(te, Intention.EmptyInt));
									// logger.warning("AGENT: "+getTS().getUserAgArch().getAgName()+" NEW EVENT TRIGGERED.");
									
									if (!scenes.containsKey(ev.getArtifactId().getName())) {
										logger.info("Intercepta propriedade observavel: " + prop + " # " + prop.getFullId() + " "  + propName + " " + prop.getValue() + " artefato: " + ev.getArtifactId().getName() + " agente " + getAgName());
										interceptEvent(ev.getArtifactId().getName(), prop.toString(), getAgName());
										//intercepter.addTrigger(new lib.EventTrigger(ev.getArtifactId().getName(), prop.toString(), getAgName()));
									}
								} else {
									logger.warning("AGENT: "+getTS().getUserAgArch().getAgName()+" CANNOT UPDATE THE BELIEF: "+l);
								}
							} catch (Exception ex){
								ex.printStackTrace();
								logger.warning("EXCEPTION - processing update obs prop "+ev+" for agent "+getTS().getUserAgArch().getAgName());
							}
						}
					}
				
					props = ev.getAddedProperties();
					if (props!=null){
						for (ArtifactObsProperty prop: props){
							String propName = prop.getName();
							String propId = prop.getFullId();
							try {
								Iterator<Literal> it = getObsPropBeliefs(prop);
									//a.getBB().getCandidateBeliefs(new PredicateIndicator(propName,prop.getValues().length));
								boolean found = false;
								if (it != null){
									Literal lold = null;
									while (!found && it.hasNext()){
										lold = it.next();
										ListTerm annots = lold.getAnnots("obs_prop_id");
										if (! annots.isEmpty()){
											for (Term annot: annots){
												/*
												Object artId = lib.termToObject(((Structure)annot).getTerm(0),lib);
												if (artId != null && artId.equals(ev.getArtifactId())){
													found = true;
													break;
												}
												*/
												StringTerm st = (StringTerm)((((Structure)annot).getTerm(0)));
												if (st.getString().equals(propId)){
													found = true;
													break;
												}
											}
										}
									}
								}
								if (!found){
									l = obsPropToLiteral(propId, ev.getArtifactId(), propName, prop.getValues(), lib);
									if (belBase.add(l)){
										Literal l1 = l.copy();
										Trigger te = new Trigger(TEOperator.add, TEType.belief, l1);
										getTS().updateEvents(new Event(te, Intention.EmptyInt));
										//logger.info("AGENT: "+getTS().getUserAgArch().getAgName()+" NEW BELIEF FOR OBS PROP: "+l1);
										
										if (!scenes.containsKey(ev.getArtifactId().getName())) {
											logger.info("Intercepta propriedade observavel: " + prop + " # " + prop.getFullId() + " "  + propName + " " + prop.getValue() + " artefato: " + ev.getArtifactId().getName() + " agente " + getAgName());
											interceptEvent(ev.getArtifactId().getName(), prop.toString(), getAgName());
											//intercepter.addTrigger(new lib.EventTrigger(ev.getArtifactId().getName(), prop.toString(), getAgName()));
										}
									}
								}
							} catch (Exception ex){
								ex.printStackTrace();
								logger.warning("EXCEPTION - processing event "+ev+" for agent "+getTS().getUserAgArch().getAgName());
							}
						}
					}
				
					props = ev.getRemovedProperties(); //TODO tratar propriedades removidas
					if (props!=null){
						//logger.info("OBS EV PROPS TO REMOVE "+props.length);
						for (ArtifactObsProperty prop: props){
							String propName = prop.getName();
							String propId = prop.getFullId();
							// logger.info("REMOVING "+propName+" "+propId);
							
							Iterator<Literal> it = getObsPropBeliefs(prop);
							//a.getBB().getCandidateBeliefs(new PredicateIndicator(propName,prop.getValues().length));
							boolean found = false;
							ListTerm annots = null;
							Literal toBeRemoved = null;
							if (it != null){
								while (!found && it.hasNext()){
									toBeRemoved = it.next();
									annots = toBeRemoved.getAnnots("obs_prop_id");
									if (! annots.isEmpty()){
										for (Term annot: annots){
											StringTerm st = (StringTerm)((((Structure)annot).getTerm(0)));
											if (st.getString().equals(propId)){
												found = true;
												break;
											}
										}
									}
								}
							}
							if (found){
								try {
									boolean removed = true;
									if (annots.size() == 1){ 
										// it was the only one
										removed = belBase.remove(toBeRemoved);
									} else {
										ArtifactId source = ev.getArtifactId();
										Iterator<Term> it2 = toBeRemoved.getAnnots().iterator();
										while (it2.hasNext()){
											Term t = it2.next();
											if (t.isStructure()){
												Structure st = (Structure)t;
												if (st.getFunctor().equals("obs_prop_id")){
													/*
													Object artId = lib.termToObject(st.getTerm(0),lib);
													if (artId != null && artId.equals(source)){
														it2.remove();
													}*/
													StringTerm sst = (StringTerm)((((Structure)st).getTerm(0)));
													if (sst.getString().equals(propId)){
														it2.remove();
													}
												} else if (st.getArity() > 0){
													Object artId = lib.termToObject(((Structure)st).getTerm(0));
													if (artId != null && artId.equals(source)){
														it2.remove();
													}
												}  
											}
										}
									}
									if (removed){
										Literal l1 = toBeRemoved.copy();
										Trigger te = new Trigger(TEOperator.del, TEType.belief, l1);
										getTS().updateEvents(new Event(te, Intention.EmptyInt));
										// logger.info("AGENT: "+getTS().getUserAgArch().getAgName()+" REMOVED BELIEF FOR OBS PROP: "+l1);
									} else {
										logger.warning("AGENT: "+getTS().getUserAgArch().getAgName()+" OBS PROP NOT FOUND when removing: "+propName);
									}
								} catch (Exception ex){
									logger.warning("EXCEPTION - processing remove obs prop "+ev+" for agent "+getTS().getUserAgArch().getAgName());
								}
							}
						}
					}
				} else if (evt instanceof QuitWSPSucceededEvent){
					//QuitWSPSucceededEvent ev1 = (QuitWSPSucceededEvent)	ev;
					//System.out.println("Leaving from " + ev1.getWorkspaceId().getName() + " to " + envSession.getCurrentWorkspace().getName());
					this.setCurrentWsp(envSession.getCurrentWorkspace());
				}
			}		
		} catch (Exception ex){
			ex.printStackTrace();
			logger.severe("Exception in fetching events from the context.");
		}
		
		return null;
	}
	
	public void sendMsg(Message m, String protocolId) throws Exception {		
		logger.info("Interceptado mensagem: " + m.getSender() + " -> " + m.getReceiver() + " " + m.getIlForce() + " " + m.getPropCont() + " Protocol: " + protocolId + " " + m.getMsgId());
		
		interceptMessage(m.getSender(), m.getReceiver(), m.getIlForce(), m.getPropCont().toString(), protocolId);
		//intercepter.addTrigger(new lib.MessageTrigger(m.getSender(), m.getReceiver(), m.getIlForce(), m.getPropCont().toString(), protocolId));
		
		if (m.getIlForce().equals("askOne") || m.getIlForce().equals("askAll") || m.getIlForce().equals("askHow")) {
			msgWaiting.put(m.getMsgId(), protocolId);
		}
		
		super.sendMsg(m);
	}
	
	public void sendMsg(Message m) throws Exception {		
		logger.info("Interceptado mensagem: " + m.getSender() + " -> " + m.getReceiver() + " " + m.getIlForce() + " " + m.getPropCont());
		
		if (m.getPropCont().toString().equals("teste")) {
			System.out.println("PRINTING....");
			printAllArtifacts();
		}
		
		//interceptMessage(m.getSender(), m.getReceiver(), m.getIlForce(), m.getPropCont().toString(), protocolId);
		//intercepter.addTrigger(new lib.MessageTrigger(m.getSender(), m.getReceiver(), m.getIlForce(), m.getPropCont().toString(), protocolId));
		
		super.sendMsg(m);
	}
	
    @Override
    public void checkMail() {
    	super.checkMail(); 
    	Queue<Message> mbox = getTS().getC().getMailBox();
    	Iterator<Message> i = mbox.iterator();
    	
    	while (i.hasNext()) {
    		Message m = i.next();
    		
    		if (m.getInReplyTo() != null) {
    			String protocolId = msgWaiting.remove(m.getInReplyTo());
    			if (protocolId != null) {
    				interceptMessage(m.getSender(), m.getReceiver(), m.getIlForce(), m.getPropCont().toString(), protocolId);
    			}
    		}
    	}
    }
}
