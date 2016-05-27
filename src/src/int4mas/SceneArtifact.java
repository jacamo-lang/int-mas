package int4mas;

import gui.ObserverScene;
import gui.ProtocolEventListener;
import jason.asSyntax.Atom;
import jason.asSyntax.ListTerm;
import jason.asSyntax.ListTermImpl;
import jason.asSyntax.Literal;
import jason.asSyntax.LiteralImpl;
import jason.asSyntax.NumberTermImpl;
import jason.asSyntax.StringTermImpl;
import jason.asSyntax.Term;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import aux.LoggerManager;

import cartago.ArtifactConfig;
import cartago.ArtifactId;
import cartago.GUARD;
import cartago.INTERNAL_OPERATION;
import cartago.LINK;
import cartago.OPERATION;
import cartago.ObsProperty;
import cartago.Artifact;
import cartago.OpFeedbackParam;
import cartago.OperationException;

import ora4mas.nopl.JasonTermWrapper;
import ora4mas.nopl.oe.Player;
import ptlparser.PtlParser;

import lib.ActionOccurrence;
import lib.Entity;
import lib.EventOccurrence;
import lib.Goal;
import lib.MessageOccurrence;
import lib.Obligation;
import lib.Occurrence;
import lib.Participant;
import lib.Node;
import lib.Protocol;
import lib.Scene;
import lib.ProtocolListener;
import lib.State;
import lib.TimeoutListener;
import lib.TimeoutManager;
import lib.Transition;

public class SceneArtifact extends Artifact implements ProtocolListener, TimeoutManager, TimeoutListener {
	private Logger logger = Logger.getLogger(LoggerManager.class
			.getName());
	private Scene scene;
	private Set<ArtifactId> groupsBoards = new HashSet<ArtifactId>();
	private Map<String, ArtifactId> workspaces = new HashMap<String, ArtifactId>();
	private Map<String, Collection<Player>> roles = new HashMap<String, Collection<Player>>();
	
	private List<ObsProperty> obligationTransitionsProperties = new ArrayList<ObsProperty>();
	
	private ObsProperty currentStateProperties = null;
	private Map<String, ObsProperty> entityProperties = new HashMap<String, ObsProperty>();
	
	private ObsProperty sceneDescritionProperties = null;
	private ObsProperty protocolSpecificationProperties = null;
	private ObsProperty workspaceProperty = null;
	private ObsProperty groupboardProperty = null;
	
	private String ownerArt = null;
	private String scheme = null;
	private ArtifactId timeoutArtifact = null;
	//private final ReentrantLock lock = new ReentrantLock();
	private volatile boolean busy = false;
	private volatile int counter = 0;
	private ObserverScene gui;
	private Set<ArtifactId> listenerArtifacts = new HashSet<ArtifactId>();
	private Set<ProtocolEventListener> listenerObjects = new HashSet<ProtocolEventListener>();
	
	private boolean busyJoin = false;
	private boolean busySet = false;
	
	void init(String fileProtocol) {
		try {
			Protocol protocol = PtlParser.loadProtocol(fileProtocol);
			
			scene = new Scene();
			scene.setProtocol(protocol);
			scene.setSceneId(getId().getName());
			scene.setTriggerValidator(new TriggerValidatorImpl(this));
			scene.addProtocolListener(this);
			scene.setTimeoutManager(this);
			//scene.prepare();
			//protocol.loadXml(fileProtocol);
			//protocol.setTimeoutManager(new TimeoutManagerImpl());
			//protocol.printProtocol();
			
			logger.info("Created scene " + getId().getName());

			generateObservableProperties();
			
			gui = new ObserverScene(this);
			listenerObjects.add(gui);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@OPERATION
	void setOwner(String owner) {
		this.ownerArt = owner;
		generateInformationProperties();
		updateGUI();
	}
	
	@OPERATION
	void setScheme(String scheme) {
		this.scheme = scheme;
		updateGUI();
	}
	
	@OPERATION @LINK void addListener(String artId) {
        try {
        	listenerArtifacts.add(lookupArtifact(artId));
        } catch (Exception e) {
            failed(e.toString());
        }   
    }
	
	@OPERATION @LINK void removeListener(String artId) {
        try {
        	listenerArtifacts.remove(lookupArtifact(artId));
        } catch (Exception e) {
            failed(e.toString());
        }   
    }
	
	private void generateObservableProperties() {
		entitiesToObservableProperties();
		generateInformationProperties();
		generateSpecificationProperties();
		generateAchievesProperties();
		workspacesToObservableProperty();
		groupboardToObservableProperty();
	}
	
	private void generateSpecificationProperties() {
		if (protocolSpecificationProperties != null) {
			removeObsPropertyByTemplate(protocolSpecificationProperties.getName(), protocolSpecificationProperties.getValues());
		}
		
		//General
		Term protocolName = new StringTermImpl(scene.getProtocol().getName());
		Term protocolDescription = new StringTermImpl(scene.getProtocol().getDescription());
		
		//Goals
		ListTerm listGoal = new ListTermImpl();
		ListTerm tailGoal = listGoal;
		for (Goal g : scene.getProtocol().getAchieveGoals()) {
			tailGoal = tailGoal.append(new Atom(g.toString()));
		}
		Literal goals = new LiteralImpl("goals");
		goals.addTerm(listGoal);
		
		//Participants
		ListTerm listParticipant = new ListTermImpl();
		ListTerm tailParticipant = listParticipant;
		for (Participant p : scene.getProtocol().getParticipants().values()) {
			Term typeParticipant = new Atom(p.getKind());
			Term nameParticipant = new Atom(p.getId());
			Term roleORtypeParticipant;
			if (p.getKind().equals("agent")) {
				roleORtypeParticipant = new Atom(p.getRoleOrType());
			} else {
				roleORtypeParticipant = new StringTermImpl(p.getRoleOrType());
			}
			Term maxParticipant;
			if (p.getqMax() != null && p.getqMax().equals("+")) {
				maxParticipant = new StringTermImpl(p.getqMax());
			} else if (p.getqMax() != null && p.getqMax().equals("all")) {
				maxParticipant = new Atom(p.getqMax());
			} else {
				maxParticipant = new NumberTermImpl(p.getMax());
			}
			Term minParticipant = new NumberTermImpl(p.getMin());
			
			Literal participant = new LiteralImpl("participant");
			if (p.getqMax() != null) {
				participant.addTerms(nameParticipant, typeParticipant, roleORtypeParticipant, maxParticipant);
			} else {
				participant.addTerms(nameParticipant, typeParticipant, roleORtypeParticipant, minParticipant, maxParticipant);
			}
			
			tailParticipant = tailParticipant.append(participant);
		}
		Literal participants = new LiteralImpl("participants");
		participants.addTerm(listParticipant);
		
		//States
		ListTerm listState = new ListTermImpl();
		ListTerm tailState = listState;
		for (State s : scene.getProtocol().getStates().values()) {
			Term nameState = new Atom(s.getId());
			
			String typeStateStr;
			if (s.isFinalState()) {
				typeStateStr = "final";
			} else if (s.isInitialState()) {
				typeStateStr = "initial";
			} else {
				typeStateStr = "normal";
			}
			Term typeState= new Atom(typeStateStr);

			Literal state = new LiteralImpl("state");
			state.addTerms(nameState, typeState);
			tailState = tailState.append(state);
		}
		Literal states = new LiteralImpl("states");
		states.addTerm(listState);
		
		//Transitions
		ListTerm listTransition = new ListTermImpl();
		ListTerm tailTransition = listTransition;
		for (Transition t : scene.getProtocol().getTransitions()) {
			Term nameSourceState = new Atom(t.getCurrentState().getId());
			Term nameDestinationState = new Atom(t.getNextState().getId());
			Term nameSourceParticipant = new Atom(t.getSource().getId());
			Term cardSourceParticipant = new NumberTermImpl(t.getCardSource());
			Term nameDestinationParticipant = new Atom(t.getDestination().getId());
			Term cardDestinationParticipant = new NumberTermImpl(t.getCardDestination());
			
			Term duty = Literal.parseLiteral(t.getDuty());
			Literal typeTransition;
			if (t.getType() == Transition.ACTION) {
				typeTransition = new Atom("action");
			} else if (t.getType() == Transition.EVENT) {
				typeTransition = new Atom("event");
			} else {
				typeTransition = new LiteralImpl("message");
				Term performative;
				if (t.getPerformative() != null && !t.getPerformative().equals("")) {
					performative = new Atom(t.getPerformative());
				} else {
					performative = new Atom("none");
				}
				typeTransition.addTerm(performative);
			}
			
			Term timeoutTransition = new NumberTermImpl(t.getCurrentState().getTimeout());
			Term gotoStateName;
			if (t.getCurrentState().getGotoStateOnTimeout() != null) {
				gotoStateName = new Atom(t.getCurrentState().getGotoStateOnTimeout().getId());
			} else {
				gotoStateName = new Atom("none");
			}
			
			Literal transition = new LiteralImpl("transition");
			transition.addTerms(nameSourceState, nameDestinationState, nameSourceParticipant, cardSourceParticipant, nameDestinationParticipant, cardDestinationParticipant, duty, timeoutTransition, gotoStateName);
			tailTransition = tailTransition.append(transition);			
		}
		Literal transitions = new LiteralImpl("transitions");
		transitions.addTerm(listTransition);
		
		Object[] o = getTermsAsProlog(protocolName, protocolDescription, goals, participants, states, transitions);
		defineObsProperty("protocol", o);
		protocolSpecificationProperties = getObsPropertyByTemplate("protocol", o);		
	}
	
	private void generateAchievesProperties() {
		Collection<Goal> achievesList = scene.getProtocol().getAchieveGoals();
		
		Term sceneName = new StringTermImpl(getId().getName());
		Term name = new StringTermImpl(scene.getProtocol().getName());
		Term scheme = new StringTermImpl(this.scheme);
		for (Goal g : achievesList) {
			Term goal = new Atom(g.toString());
			
			Object[] o = getTermsAsProlog(sceneName, name, scheme, goal);
			defineObsProperty("achieveGoal", o);
		}
	}
	
	private void generateInformationProperties() {
		if (sceneDescritionProperties != null) {
			removeObsPropertyByTemplate(sceneDescritionProperties.getName(), sceneDescritionProperties.getValues());
		}
		
		Term name = new StringTermImpl(scene.getProtocol().getName());
		Term sceneName = new StringTermImpl(getId().getName());
		Term owner = null;
		if (ownerArt == null) {
			owner = new Atom("none");
		} else {
			owner = new Atom(ownerArt);
		}
		
		Object[] o = getTermsAsProlog(sceneName, name, owner);
		defineObsProperty("sceneId", o);
		sceneDescritionProperties = getObsPropertyByTemplate("sceneId", o);
	}
	
	private void obligationToObservableProperty(Obligation ob) {
		ListTerm listPlayersDestination = new ListTermImpl();
		ListTerm tailDestination = listPlayersDestination;
		for (String s : ob.getDutyObl().getDestinationPlayers()) {
			tailDestination = tailDestination.append(new Atom(s));
		}
		Term currentState = new Atom(ob.getDutyObl().getStateId());
		Term gotoStateName = new Atom(ob.getDutyObl().getGotoStateId());
		
		Term duty = Literal.parseLiteral(ob.getDutyObl().getDuty());
		Literal type;
		if (ob.getDutyObl().getDutyType() == Transition.ACTION) {
			type = new Atom("action");
		} else if (ob.getDutyObl().getDutyType() == Transition.EVENT) {
			type = new Atom("event");
		} else {
			type = new LiteralImpl("message");
			Term performative;
			if (ob.getDutyObl().getPerformative() != null && !ob.getDutyObl().getPerformative().equals("")) {
				performative = new Atom(ob.getDutyObl().getPerformative());
			} else {
				performative = new Atom("none");
			}
			type.addTerm(performative);
		}
		Term sceneName = new StringTermImpl(ob.getNormObl().getSceneName());
		
		Literal transition = new LiteralImpl("transition");
		transition.addTerms(currentState, gotoStateName, type, listPlayersDestination, duty);
		
		Term role = new Atom(ob.getNormObl().getRole());
		Literal norm = new LiteralImpl("nProtocol");
		norm.addTerms(sceneName, currentState, role);
		
		Term timeout = new NumberTermImpl(ob.getTimeout());
		Term termE = new Atom(ob.getResponsibleAgent());
		
		Object[] o = getTermsAsProlog(termE, norm, transition, timeout);
		defineObsProperty("obligation", o);
		obligationTransitionsProperties.add(getObsPropertyByTemplate("obligation", o));
		
		logger.info(getObsPropertyByTemplate("obligation", o).toString());
	}

	private void transitionToObservableProperty(Transition t) {		
		ListTerm listPlayersDestination = new ListTermImpl();
		ListTerm tailDestination = listPlayersDestination;
		for (Entity s : scene.getPlayers(t.getDestination())) {
			tailDestination = tailDestination.append(new Atom(s.toString()));
		}
		Term currentState = new Atom(t.getCurrentState().getId());
		Term gotoStateName = new Atom(t.getNextState().getId());
		
		Term duty = Literal.parseLiteral(t.getDuty());
		Literal type;
		if (t.getType() == Transition.ACTION) {
			type = new Atom("action");
		} else if (t.getType() == Transition.EVENT) {
			type = new Atom("event");
		} else {
			type = new LiteralImpl("message");
			Term performative;
			if (t.getPerformative() != null && !t.getPerformative().equals("")) {
				performative = new Atom(t.getPerformative());
			} else {
				performative = new Atom("none");
			}
			type.addTerm(performative);
		}
		Term sceneName = new StringTermImpl(getId().getName());
		
		if (scene.getStatus() != Scene.NOTSTARTED && t.getCurrentState().getId().equals(scene.getCurrentState().getCurrentState().getId())) {
			if (t.getSource().getKind().equals("agent") && scene.getStatus() == Scene.RUNNING) {
				Literal transition = new LiteralImpl("transition");
				transition.addTerms(currentState, gotoStateName, type, listPlayersDestination, duty);
				
				Term role = new Atom(t.getSource().getId());
				Literal norm = new LiteralImpl("nProtocol");
				norm.addTerms(sceneName, currentState, role);
				
				Term timeout = new NumberTermImpl(t.getCurrentState().getTimeout());
				
		    	for (Entity e : scene.getPlayers(t.getSource())) {
		    		Term termE = new Atom(e.toString());
		    		
		    		Object[] o = getTermsAsProlog(termE, norm, transition, timeout);
		    		defineObsProperty("obligation", o);
		    		obligationTransitionsProperties.add(getObsPropertyByTemplate("obligation", o));
		    		
		    		logger.info(getObsPropertyByTemplate("obligation", o).toString());
		    	}
			}
		}
	}

	private void stateToObservableProperty(State s) {
		Term name = new Atom(s.getId());
		Term gotoStateName;
		if (s.getGotoStateOnTimeout() != null) {
			gotoStateName = new Atom(s.getGotoStateOnTimeout().getId());
		} else {
			gotoStateName = new Atom("none");
		}
		Term timeout = new NumberTermImpl(s.getTimeout());

		String typeStateStr;
		if (s.isFinalState()) {
			typeStateStr = "final";
		} else if (s.isInitialState()) {
			typeStateStr = "initial";
		} else {
			typeStateStr = "normal";
		}
		Term typeState= new Atom(typeStateStr);
		Term sceneName = new StringTermImpl(getId().getName());
		
		Object[] o = getTermsAsProlog(sceneName, name, typeState, timeout, gotoStateName);
		defineObsProperty("currentState", o);
		currentStateProperties = getObsPropertyByTemplate("currentState", o);
	}

	private void entitiesToObservableProperties() {
		Map<String, Participant> entities = scene.getProtocol().getParticipants();

		for (Participant e : entities.values()) {
			entityToObservableProperty(e);
		}
	}
	
	private void entityToObservableProperty(Participant e) {
		Term type = new Atom(e.getKind());
		Term name = new Atom(e.getId());
		Term roleORtype;
		if (e.getKind().equals("agent")) {
			roleORtype = new Atom(e.getRoleOrType());
		} else {
			roleORtype = new StringTermImpl(e.getRoleOrType());
		}
		Term max;
		if (e.getqMax() != null && e.getqMax().equals("+")) {
			max = new StringTermImpl(e.getqMax());
		} else if (e.getqMax() != null && e.getqMax().equals("all")) {
			max = new Atom(e.getqMax());
		} else {
			max = new NumberTermImpl(e.getMax());
		}
		Term min = new NumberTermImpl(e.getMin());
		ListTerm listPlayers = new ListTermImpl();
		ListTerm tail = listPlayers;

		for (Entity s : scene.getPlayers(e)) {
			tail = tail.append(new Atom(s.toString()));
		}

		Term sceneName = new StringTermImpl(getId().getName());
		Object[] o = getTermsAsProlog(sceneName, type, roleORtype, name, max, min, listPlayers); 
		defineObsProperty("entity", o);
		entityProperties.put(e.getId(), getObsPropertyByTemplate("entity", o));		
	}

	private void updateEntityProperties(Participant e) {
		ObsProperty ob = entityProperties.get(e.getId());
		removeObsPropertyByTemplate(ob.getName(), ob.getValues());
		entityToObservableProperty(e);
	}
	
	private void updateNewStateProperties() {
        State last = scene.getCurrentState().getPreviousState();
        State s = scene.getCurrentState().getCurrentState();
        
        if (last == null) {
	        stateToObservableProperty(s);
        } else if (!last.getId().equals(s.getId())) {
	        removeObsPropertyByTemplate(currentStateProperties.getName(), currentStateProperties.getValues());
	        
	        stateToObservableProperty(s);
        }
        
        /*for (Transition t : s.getTransitions()) {
        	transitionToObservableProperty(t);
        }*/
        
        updateGUI();
	}
	
	private void workspacesToObservableProperty() {
		ListTerm listWorkspaces = new ListTermImpl();
		ListTerm tail = listWorkspaces;

		for (String s : workspaces.keySet()) {
			tail = tail.append(new Atom(s));
		}

		Term sceneName = new StringTermImpl(getId().getName());
		Object[] o = getTermsAsProlog(sceneName, listWorkspaces);
		if (workspaceProperty != null)
			removeObsPropertyByTemplate(workspaceProperty.getName(), workspaceProperty.getValues());
		defineObsProperty("workspaceScene", o);
		workspaceProperty = getObsPropertyByTemplate("workspaceScene", o);
	}
	
	private void groupboardToObservableProperty() {
		ListTerm listGroupboard = new ListTermImpl();
		ListTerm tail = listGroupboard;

		for (ArtifactId a : groupsBoards) {
			tail = tail.append(new Atom(a.getName()));
		}

		Term sceneName = new StringTermImpl(getId().getName());
		Object[] o = getTermsAsProlog(sceneName, listGroupboard);
		if (groupboardProperty != null)
			removeObsPropertyByTemplate(groupboardProperty.getName(), groupboardProperty.getValues());
		defineObsProperty("groupboardScene", o);
		groupboardProperty = getObsPropertyByTemplate("groupboardScene", o);
	}

	private Object[] getTermsAsProlog(Term... o) {
		Object[] terms = new Object[o.length];
		int i = 0;
		for (Term t : o)
			terms[i++] = new JasonTermWrapper(t);

		return terms;
	}

	public Map<String, Collection<Player>> getRoles() {
		return roles;
	}

	@LINK
	void updateRolePlayers(String grId, Collection<Player> rp) {
		roles.put(grId, rp);
		logger.info("Received new players from " + grId);
	}

	@OPERATION
	void addGroupBoard(String groupBoard) {
		try {
			ArtifactId grBoardArt = lookupArtifact(groupBoard);

			if (grBoardArt != null && !groupsBoards.contains(grBoardArt)) {
				execLinkedOp(grBoardArt, "addListener", getId().getName());
				groupsBoards.add(grBoardArt);
				groupboardToObservableProperty();
				logger.info("Groupboard " + groupBoard + " was added");
				updateGUI();
			} else if (groupsBoards.contains(grBoardArt)) {
				failed("Groupboard " + groupBoard + " already added");
				logger.info("Groupboard " + groupBoard + " not added");
			} else {
				failed("Groupboard " + groupBoard + " not found");
				logger.info("Groupboard " + groupBoard + " not added");
			}
		} catch (OperationException e) {
			failed("Groupboard " + groupBoard + " not found");
			logger.info("Groupboard " + groupBoard + " not added");
		}
	}
	
	@OPERATION
	void addWorkspace(String workspace) {
		try {
			ArtifactId nodeArt = lookupArtifact("node");
			
			if (nodeArt != null) {
				OpFeedbackParam<ArtifactId> workArtParam = new OpFeedbackParam<ArtifactId>();
				execLinkedOp(nodeArt, "lookupWorkspace", workspace, workArtParam);
				
				ArtifactId workArt = workArtParam.get();
				if (workArt != null && !workspaces.containsKey(workspace)) {
					workspaces.put(workspace, workArt);
					workspacesToObservableProperty();
					logger.info("Workspace " + workspace + " was added");
					updateGUI();
				} else if (workspaces.containsKey(workspace)) {
					failed("Workspace " + workspace + " already added");
					logger.info("Workspace " + workspace + " not added");
				} else {
					failed("Workspace " + workspace + " not found");
					logger.info("Workspace " + workspace + " not added");					
				}
			}
		} catch (OperationException e) {
			failed("Workspace " + workspace + " not found");
			logger.info("Workspace " + workspace + " not added");
		}
	}
	
	@OPERATION
	void addRemoteWorkspace(String workspace, ArtifactId workArt) {
		if (workArt != null && !workspaces.containsKey(workspace)) {
			workspaces.put(workspace, workArt);
			workspacesToObservableProperty();
			logger.info("Workspace " + workspace + " was added");
			updateGUI();
		} else if (workspaces.containsKey(workspace)) {
			failed("Workspace " + workspace + " already added");
			logger.info("Workspace " + workspace + " not added");
		} else {
			failed("Workspace " + workspace + " not found");
			logger.info("Workspace " + workspace + " not added");					
		}
	}
	
	@GUARD
	boolean notBusyJoinLeave(String participantName){
		return !busyJoin;
	}
	
	@GUARD
	boolean notBusyJoinLeaveForce(String participantName, String agentName){
		return !busyJoin;
	}

	@OPERATION(guard="notBusyJoinLeave")
	void joinScene(String participantName) {
		busyJoin = true;
		logger.info("Agent " + getOpUserName()
				+ " trying to join into the scene by playing "
				+ participantName);
		if (scene.join(participantName, new Entity(getOpUserName()))) {
			updateEntityProperties(scene.getProtocol().getParticipantByName(participantName));
			logger.info("Agent " + getOpUserName() + " can play "
					+ participantName);
			updateGUI();
		} else {
			logger.info("Agent " + getOpUserName() + " cannot play "
					+ participantName);
			failed("Agent " + getOpUserName() + " cannot play "
					+ participantName);
		}
		busyJoin = false;
	}

	@OPERATION(guard="notBusyJoinLeave")
	void leaveScene(String participantName) {
		busyJoin = true;
		logger.info("Agent " + getOpUserName()
				+ " trying to leave from the scene by playing "
				+ participantName);
		
		if (scene.leave(participantName, new Entity(getOpUserName()))) {
			updateEntityProperties(scene.getProtocol().getParticipantByName(participantName));
			logger.info("Agent " + getOpUserName() + " can leave "
					+ participantName);
			updateGUI();
		} else {
			logger.info("Agent " + getOpUserName() + " cannot leave "
					+ participantName);
			failed("Agent " + getOpUserName() + " cannot leave "
					+ participantName);
		}
		busyJoin = false;
	}
	
	@OPERATION(guard="notBusyJoinLeaveForce")
	void leaveScene(String participantName, String agentName) {
		busyJoin = true;
		logger.info("Agent " + getOpUserName()
				+ " trying to leave the agent " + agentName + " from the scene by playing "
				+ participantName);
		
		if (ownerArt != null && ownerArt.equals(getOpUserName()) && scene.leave(participantName, new Entity(agentName))) {
			updateEntityProperties(scene.getProtocol().getParticipantByName(participantName));
			logger.info("Agent " + agentName + " can leave "
					+ participantName);
			updateGUI();
		} else {
			logger.info("Agent " + agentName + " cannot leave "
					+ participantName);
			failed("Agent " + agentName + " cannot leave "
					+ participantName);
		}
		busyJoin = false;
	}

	@GUARD
	boolean notBusySet(String participantName, String artifactName){
		return !busySet;
	}
	
	@OPERATION
	void addArtifact(String participantName, String artifactName) {
		busySet = true;
		logger.info("Agent " + getOpUserName() + " trying to set the artifact "
				+ artifactName + " into the scene by playing "
				+ participantName);
		if (scene.addArtifact(participantName, new Entity(artifactName))) {
			updateEntityProperties(scene.getProtocol().getParticipantByName(participantName));
			logger.info("Artifact " + artifactName + " can play "
					+ participantName);
			updateGUI();
		} else {
			logger.info("Artifact " + artifactName + " cannot play "
					+ participantName);
			failed("Artifact " + artifactName + " cannot play "
					+ participantName);
		}
		busySet = false;
	}
	
	@OPERATION
	void removeArtifact(String participantName, String artifactName) {
		busySet = true;
		logger.info("Agent " + getOpUserName()
				+ " trying to unset the artifact " + artifactName
				+ " from the scene by playing " + participantName);
		
		if (scene.removeArtifact(participantName, new Entity(artifactName))) {
			updateEntityProperties(scene.getProtocol().getParticipantByName(participantName));
			logger.info("Artifact " + artifactName + " can unset "
					+ participantName);
			updateGUI();
		} else {
			logger.info("Artifact " + artifactName + " cannot unset "
					+ participantName);
			failed("Artifact " + artifactName + " cannot unset "
					+ participantName);
		}
		busySet = false;
	}
	
	@INTERNAL_OPERATION
	void createTimeoutArtifact() {
		if (timeoutArtifact == null) {
			//Create timeout artifact
			try {
				timeoutArtifact = makeArtifact("timeoutArt"+getId().getName(), 
						"int4mas.TimeoutArtifact", 
						ArtifactConfig.DEFAULT_CONFIG);
				
				//execLinkedOp(timeoutArtifact, "start", getId().getName(), 10000);
			} catch (OperationException e) {
				failed("There was problem to create a timeout artifact");
			}
		}
	}

	@OPERATION
	void start() {
		if (ownerArt != null && scene.start()) {
			if (timeoutArtifact == null)
				createTimeoutArtifact();
			
			logger.info("Protocol started");
			updateNewStateProperties();
			
			for (ProtocolEventListener pel : listenerObjects) {
				pel.notifyProtocoloStarted();
			}
			notifyListeners("started");
		} else {
			logger.info("Protocol cannot start yet");
			failed("Protocol cannot start yet");
		}
	}

	@OPERATION
	void stop() {
		if (scene.stop()) {
			
			//Delete obligations when the protocol is stopped
			breakTimeout();
			/*
			if (obligationTransitionsProperties.size() > 0) {
		        for (ObsProperty ob : obligationTransitionsProperties) {
		        	removeObsPropertyByTemplate(ob.getName(), ob.getValues());
		        }
			}*/
			
			logger.info("Protocol stopped");
			updateGUI();
			for (ProtocolEventListener pel : listenerObjects) {
				pel.notifyProtocoloStopped();
			}
			notifyListeners("stopped");
		} else {
			logger.info("Protocol cannot stop yet");
			failed("Protocol cannot stop yet");
		}
	}
	
	@OPERATION
	void goOn() {
		if (scene.goOn()) {
			
			//Reactivate obligations when the protocol is continued
			/*
			if (obligationTransitionsProperties.size() > 0) {
		        for (ObsProperty ob : obligationTransitionsProperties) {
		        	defineObsProperty(ob.getName(), ob.getValues());
		        }
			}*/
			if (scene.getCurrentState().getCurrentState().getTimeoutTransition() != null) {
				startTimeout();
			}
			
			logger.info("Protocol running...");
			updateGUI();
			for (ProtocolEventListener pel : listenerObjects) {
				pel.notifyProtocoloRunning();
			}
			notifyListeners("running");
		} else {
			logger.info("Protocol cannot run yet");
			failed("Protocol cannot run yet");
		}
	}

	public void protocolFinished() {
		try {
			logger.info("Protocol finished");
			for (ProtocolEventListener pel : listenerObjects) {
				pel.notifyProtocoloFinished();
			}
			notifyListeners("finished");
			updateGUI();
			
			Collection<Goal> achievesList = scene.getProtocol().getAchieveGoals();
			
			for (Goal g : achievesList) {
				execLinkedOp(lookupArtifact(scheme), "interactionCommand",
						"goalAchieved("+ownerArt+", "+g.toString()+")");				
			}
			
			/*
			if (timeoutArtifact != null) {
				dispose(timeoutArtifact);
			}*/
		} catch (OperationException e) {
			e.printStackTrace();
		}
	}

	public boolean validateArtifact(String artifactType, String artifactId) {
		try {
			ArtifactId aid = lookupArtifact(artifactId);
			if (aid != null) {
				return aid.getArtifactType().equals(artifactType);
			}
		} catch (OperationException e) {
			for (ArtifactId wspArt : workspaces.values()) {
				OpFeedbackParam<ArtifactId> artParam = new OpFeedbackParam<ArtifactId>();
				try {
					execLinkedOp(wspArt, "lookupArtifact", artifactId, artParam);
					
					ArtifactId aid = artParam.get();
					if (aid != null) {
						return aid.getArtifactType().equals(artifactType);
					}
				} catch (OperationException e1) {}
			}
		}
		return false;
	}
	
	public Collection<ArtifactId> getAllArtifactsByType(String type) {
		Collection<ArtifactId> artifactsType = new ArrayList<ArtifactId>();
		
		for (ArtifactId workArt : workspaces.values()) {
			try {
				OpFeedbackParam<ArtifactId[]> artifacts = new OpFeedbackParam<ArtifactId[]>();
				execLinkedOp(workArt, "getArtifactList", artifacts);
				
				for (ArtifactId artId : artifacts.get()) {
					//System.out.println("Artifact: " + artId.getName() + "/" + artId.getArtifactType());
					
					if (artId.getArtifactType().equals(type)) {
						artifactsType.add(artId);
					}
				}
			} catch (OperationException e) {
				e.printStackTrace();
			}
		}
		
		return artifactsType;
	}
	
	public void updateObligations(List<Obligation> obls) {
        for (ObsProperty ob : obligationTransitionsProperties) {
        	removeObsPropertyByTemplate(ob.getName(), ob.getValues());
        }
        obligationTransitionsProperties.clear();
        
        for (Obligation o : scene.getCurrentState().getObls()) {
        	obligationToObservableProperty(o);
        }
	}

	public void newState(State sNew) {
		updateNewStateProperties();
		if (listenerObjects.size() > 0 || listenerArtifacts.size() > 0) {
			
			Node n = scene.getCurrentState().getFiredTransitionNode();
			String textTransition; 
			if (n.getFiredTransition().getType() != Transition.TIMEOUT) {
				
				textTransition = n.getFiredTransition().getCurrentState().getId() + " -> " + n.getFiredTransition().getNextState().getId() + ": ";
				
				StringBuffer buf = new StringBuffer();
				buf.append("[");
				for (Occurrence occurrence: n.getOccurrences()) {
					if (buf.length() > 1) {
						buf.append("; ");
					}
					if (occurrence instanceof EventOccurrence) {
						EventOccurrence tt = (EventOccurrence) occurrence;
						buf.append("(event," + tt.getArtifactId() + "," + tt.getDestinationId()+","+tt.getSignal()+")");
					} else if (occurrence instanceof ActionOccurrence) {
						ActionOccurrence tt = (ActionOccurrence) occurrence;
						buf.append("(action," + tt.getAgentId() + "," + tt.getArtifactId()+","+tt.getAction()+")");
					} else {
						MessageOccurrence tt = (MessageOccurrence) occurrence;
						buf.append("(message," + tt.getSourceId() + "," + tt.getDestinationId()+","+tt.getPerformative()+","+tt.getContent()+")");
					}
				}
				buf.append("]");
				textTransition += buf.toString();
			} else {
				textTransition = n.getFiredTransition().getCurrentState().getId() + " -> " + n.getFiredTransition().getNextState().getId() + ": timeout";
			}
			
			for (ProtocolEventListener pel : listenerObjects) {
				pel.notifyTransitionFired(textTransition);
				pel.notifyStateAchieved(scene.getCurrentState().getCurrentState());
			}
			notifyListeners("fired: " + textTransition);
		}
	}
	
	@GUARD boolean isFree() {
		return !busy;
	}
	
	@INTERNAL_OPERATION
	void processOccurrence(Occurrence occurrence) {
		await("isFree");
		counter++;
		if (counter > 1) {
			logger.info("@@@@@@@@@@@ COUNTER ACCESS PROBLEM @@@@@@@@@@@@: " + counter);
		}
		busy = true;
		scene.processOccurrence(occurrence);
		counter--;
		busy = false;
		logger.info("Processed occurrence: " + occurrence + ": " + occurrence.isValid());
		if (occurrence.isValid())
			updateGUI();
	}
	
	@OPERATION
	void processAction(String agentId, String artifactId, String action, String protocolId) {
		Occurrence occurrence = new ActionOccurrence(new Entity(agentId), new Entity(artifactId), action, protocolId);

		logger.info("Delivery action: " + occurrence);
		
		execInternalOp("processOccurrence", occurrence);
	}
	
	@OPERATION
	void processMessage(String sourceId, String destinationId, String performative, String content, String protocolId) {
		Occurrence occurrence = new MessageOccurrence(new Entity(sourceId), new Entity(destinationId), performative, content, protocolId);
		if (!sourceId.equals(getOpUserName())) {
			occurrence.setLifeLimit(1); //It is a echo message
		}
		
		logger.info("Delivery message: " + occurrence);
		
		execInternalOp("processOccurrence", occurrence);
	}
	
	@OPERATION
	void processEvent(String artifactId, String signal, String destinationId) {
		Occurrence occurrence = new EventOccurrence(new Entity(artifactId), signal, new Entity(destinationId));
		occurrence.setLifeLimit(1); //It is a echo event
		
		logger.info("Delivery event: " + occurrence);
		
		execInternalOp("processOccurrence", occurrence);
	}
	
	/*
	@GUARD boolean isFree(Trigger trigger) {
		return !busy;
	}
	
	//@INTERNAL_OPERATION(guard="isFree")
	//@INTERNAL_OPERATION
	private void processTrigger(Trigger trigger) {
		//await("isFree");
		//busy = true;
		protocol.processTrigger(trigger);
		//counter--;
		logger.info("Processed trigger: " + trigger + ": " + trigger.isValid());
		if (trigger.isValid())
			updateGUI();
		//busy = false;
	}
	
	@GUARD boolean isFreeAction(String agentId, String artifactId, String action, String protocolId) {
		return !busy;
	}
	
	@OPERATION(guard="isFreeAction")
	void processAction(String agentId, String artifactId, String action, String protocolId) {
		busy = true;
		Trigger trigger = new ActionTrigger(agentId, artifactId, action, protocolId);

		logger.info("Delivery action: " + trigger);
		
		processTrigger(trigger);
		//execInternalOp("processTrigger", trigger);
		busy = false;
	}

	@GUARD boolean isFreeMessage(String sourceId, String destinationId, String performative, String content, String protocolId) {
		return !busy;
	}
	
	@OPERATION(guard="isFreeMessage")
	void processMessage(String sourceId, String destinationId, String performative, String content, String protocolId) {
		busy = true;
		Trigger trigger = new MessageTrigger(sourceId, destinationId, performative, content, protocolId);
		if (!sourceId.equals(getOpUserName())) {
			trigger.setLifeLimit(1); //It is a echo message
		}
		
		logger.info("Delivery message: " + trigger);
		
		processTrigger(trigger);
		//execInternalOp("processTrigger", trigger);
		busy = false;
	}

	@GUARD boolean isFreeEvent(String artifactId, String signal, String destinationId) {
		return !busy;
	}
	
	@OPERATION(guard="processEvent")
	void processEvent(String artifactId, String signal, String destinationId) {
		busy = true;
		Trigger trigger = new EventTrigger(artifactId, signal, destinationId);
		trigger.setLifeLimit(1); //It is a echo event
		
		logger.info("Delivery event: " + trigger);
		
		processTrigger(trigger);
		//execInternalOp("processTrigger", trigger);
		busy = false;
	}*/
	
	/*
	@OPERATION
	void desinstallProtocol() {
		try {
			if (timeoutArtifact != null) {
				dispose(timeoutArtifact);
				timeoutArtifact = null;
			}
			dispose(getId());
		} catch (OperationException e) { }
	}*/
	
	public void setTimeout(long timeout) {
		try {
			if (timeoutArtifact == null)
				createTimeoutArtifact();
			
			execLinkedOp(timeoutArtifact, "setTimeout", timeout);
		} catch (OperationException e) {
			e.printStackTrace();
		}
	}

	public void setListener(TimeoutListener listener) {
		//Unnecessary
	}

	public void startTimeout() {
		try {
			if (timeoutArtifact == null)
				createTimeoutArtifact();
			
			execLinkedOp(timeoutArtifact, "start", getId().getName());
		} catch (OperationException e) {
			e.printStackTrace();
		}
	}

	public void breakTimeout() {
		try {
			if (timeoutArtifact == null)
				createTimeoutArtifact();
			
			execLinkedOp(timeoutArtifact, "stop");
		} catch (OperationException e) {
			e.printStackTrace();
		}		
	}
	
	@LINK
	public void timeoutExpired() {
		scene.timeoutExpired();
	}
	
	public Scene getScene() {
		return scene;
	}
	
	public String getOwner() {
		return ownerArt;
	}
	
	public String getScheme() {
		return scheme;
	}
	
	public Collection<String> getWorkspaces() {
		return workspaces.keySet();
	}
	
	public Collection<ArtifactId> getGroupboards() {
		return groupsBoards;
	}
	
	private void updateGUI() {
		if (gui != null)
			gui.setRepaint();
	}
	
    private void notifyListeners(String event) {
    	try {
	        for (ArtifactId l: listenerArtifacts) {
					execLinkedOp(l, "updateEventOccurred", getId().getName(), event);
	        }
		} catch (OperationException e) {
			e.printStackTrace();
		}
    }
}
