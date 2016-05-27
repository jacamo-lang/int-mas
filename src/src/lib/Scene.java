package lib;

/*
 * TODO [OK] implementar mecanismos básicos de controle do protocolo
 * TODO [OK] implementar validador de artefato
 * TODO [OK] implementar validador de agente
 * TODO [OK] implementar o validador do jason
 * TODO [OK] implementar as propriedades observaveis no scene
 * TODO [OK] vincular que metas aquela scene está querendo atingir
 * TODO [OK] permitir informar o endereço do arquivo
 * TODO [OK] implementar propriedades observaveis para mostrar a relação entre metas e protocolos (provavelmente no artefato que armazena os protocolos)
 * TODO [OK] implementar para o agente informar os eventos/mensagens via operação
 * TODO [OK] tentar tirar o sleep da thread do Scene
 * TODO [OK] tratar quando no max tem "all", para pegar a formação que existe na organização
 * TODO [OK] composição de protocolos
 * TODO [OK] tratar cardinalidade nas transições. Ex: tenho 4 agentes num player, mas apenas 1 eh necessário enviar uma mensagem (produtor, consumidor)
 * TODO [OK] não permitir estados finais com transições
 * TODO [OK] validar o arquivo da linguagem para ver se está correto
 * TODO [OK] - cardinalidades
 * TODO [OK] - cardinalidade da transicao com a cardinalidade dos participantes
 * TODO [OK] - estado final com transicao
 * TODO [OK] - sem estado inicial
 * TODO [OK] - sem estado final
 * TODO [OK] - transicoes com estados invalidos (nao existem)
 * TODO [OK] - transicoes com participantes invalidos (nao existem)
 * TODO [OK] - falta de campos obrigatorios
 * TODO [OK] permitir all no min de participantes, na cardinalidade
 *      - quando tem all no max, já é desconsiderado o min, pois nao faz sentido ter um valor maximo com all, jah que nao dah pra por outros agentes a não ser os corretos.
 *      - nao faz sentido por nas transicoes esse tratamento tambem, pois se omitir vai valer o que esta nos participantes
 * TODO [OK] atingir a meta direto sem agente informar quais devem ser atingidas
 * TODO [OK] permitir agentes e artefatos saírem do protocolo caso não tenham mais nada para fazer nele ou se o protocolo continua OK sem eles. Isso é util no contract net, onde candidatos são eliminados.
 * TODO [OK] implementar o timeout
 * TODO [OK] Ajustar comportamento quando vários agentes tentam disparar a mesma transicao que é desnecessária, basta apenas considerar um, o restante deve resultar em NO
 * TODO [OK] tratar concorrencia, quando dois agentes executam ações simultâneas, medir usando a variável STEP.
 * TODO [OK] tentar ao inves de usar no1.no2.no3 usar no3[no2[no1]], vai existir um prefixo e um sufixo.
 * TODO [OK] resolver todo's espalhados pelo código
 * TODO [OK] criar o triggervalidation com uma unica funcao passando o validador do conteudo, o validador do padrao e o conteudo da mensagem do agente
 * TODO [OK] Criar uma forma visual de acompanhar o protocolo, participantes e etc
 * TODO [OK] implementar alguns exemplos de protocolo, ver arquivo de cenários em Material/exemplos
 *      - um exemplo pode ser 3 agentes que precisam enviar msg para 4 agentes, mas nao eh necessario todos os 3 enviarem para todos os 4. basta os 4 receberem.
 *      - usar performativas askHow, askAll, askOne, etc...
 * TODO [OK] criar linguagem parecida com mas2j
 * TODO [OK] permitir import na transicao, assim permitindo transicoes entre estados mesmo com import
 * TODO [OK] permitir definir timeout na transicao e nao no estado
 * 		- nao permitir mais de um timeout no mesmo estado de origem
 * TODO [OK] testar transicao com mais de um import
 * TODO [OK] permitir artefatos de Nodes diferentes, remote workspaces
 * TODO [OK] criar um tempo de vida para mensagens somente quando for uma mensagem de "eco", estilo askOne ou askAll e etc... as demais mensagens não deveriam ter tempo de vida, colocar na arquitetura do agente, onde é o receive da mensagem.
 * TODO tirar o triggerValidation durante o parse, ele jah eh adicionado qndo configura o protocolo
 * TODO tratar para que suma a obrigacao quando um agente tiver todas as triggers para ele aceitas, deixar apenas dos agentes que ainda não fizeram
 * TODO criar uma forma de poder adicionar/alterar participantes no meio da execução do protocolo, através da linguagem
 *      - um exemplo eh na eleicao, quando o participante eleito ganhou, ele deve ser incluido no protocolo para assumir determinado papel
 *      - eh possivel hj representar isso pela cardinalidade, mas talvez nao ideal
 *      - a ideia eh permitir protocolos bem mais dinamicos, onde apos cada transicao pudesse ser executado alguma coisa. estilo um "execute after fired".
 * TODO [NAO] tratar "grupo.papel"  
 *      -futuro
 * TODO [NAO] tratar "workspace.artifact"
 *      -futuro   
 * TODO [NAO] criar um projeto no sourceforge
 * 		- futuro
 * TODO [NAO] criar um artefato para armazenar todos os protocolos abertos e que o agente pudesse ler pela arquitetura
 * 		- futuro
 * TODO [NAO] persistência
 *      - futuro
 * TODO [NAO] trocar a validação do XML por XSD
 * 		- futuro
 * TODO [NAO] artefato para agente construir protocolo
 *      - agente pode criar protocolo falso para atingir meta 
 * TODO [NAO] verificar como fazer agentes seguirem outro protocolo a partir de um certo passo, como criar um novo protocolo e usar
 *      - eh usada a composicao
 * TODO [NAO] overhearing (interceptar mensagens entre agentes)
 *      - futuro
 * TODO [NAO] subscribe (assinar lista de assuntos, pode incluir agentes que deseja subscribe
 *      - futuro
 * TODO [NAO] overseeing (interceptar ações realizadas pelos agentes, supervisionar, pode adicionar ações específicas, agentes, e artefatos)
 *      -futuro
 * 
 * Alteracoes CArtAgO:
 * * Classe: WorkspaceArtifact
 *   @LINK void getArtifactList(OpFeedbackParam<ArtifactId[]> artifacts)
 * * Classe: JavaLibrary
 *   public Collection<Object> getAllCurrentObjects()
 * * Classe: NodeArtifact
 *   @LINK void lookupWorkspace(String wspName, OpFeedbackParam<ArtifactId> aid)
 *   
 * Alteracoes MOISE:
 * * Classe: SchemeBoard
 *   @LINK public void interactionCommand(String cmd)
 */

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.logging.Logger;
import aux.LoggerManager;

/**
 * Multiton pattern 
 * @author xsplyter
 */
public class Scene implements TimeoutListener, InputConsumer {
	public static final int NOTSTARTED = 0;
	public static final int RUNNING = 1;
	public static final int STOPPED = 2;
	public static final int FINISHED = 3;
	public static final int NOTIFIED_FINISHED = 4;
	
	private int status = NOTSTARTED;
	
	private Logger logger = Logger.getLogger(LoggerManager.class.getName());
	private Collection<ProtocolListener> protocolListeners = new ArrayList<ProtocolListener>();
	private TriggerValidator triggerValidator = null;
	
	//Protocol structures
	private Protocol protocol;
	private String id;
	
	//Players
	private Map<Entity, HashSet<Participant>> player2Participant = new HashMap<Entity, HashSet<Participant>>();
	private Map<Participant, HashSet<Entity>> participant2Player = new HashMap<Participant, HashSet<Entity>>();
	private Map<Participant, Boolean> formation = new HashMap<Participant, Boolean>();
	
	private CurrentState current = new CurrentState(this);
	private boolean executingPendingOccurrences = false;
	private TimeoutManager timeoutManager = null;
	
	//private int count = 0;
	//private int limit = 5;
	
	public TriggerValidator getTriggerValidator() {
		return triggerValidator;
	}
	
	public void setSceneId(String id) {
		this.id = id;
	}
	
	public void setProtocol(Protocol p) {
		protocol = p;
		for (Participant e : protocol.getParticipants().values()) {
			participant2Player.put(e, new HashSet<Entity>());
			formation.put(e, false);
		}
		prepare();
	}
	
	public Protocol getProtocol() {
		return protocol;
	}
	
	private boolean prepare() {
		for (State s : protocol.getStates().values()) {
			if (s.isInitialState()) {
				current.setCurrentState(s, true);
				return true;
			}
		}
		return false;
	}
	
	public void setTimeoutManager(TimeoutManager timeoutManager) {
		this.timeoutManager = timeoutManager;
	}
	
	public CurrentState getCurrentState() {
		return current;
	}
	
	public boolean start() {
		if (isReadyToRun()) {
			status = RUNNING;
			current.updateNewObligations();
			for (ProtocolListener l : protocolListeners) {
				l.updateObligations(current.getObls());
			}
			logger.info("Protocol motor running...");
			activeTimeoutTransition();
			return true;
		}
		return false;
	}
	
	public boolean stop() {
		if (status == RUNNING && (current.getCurrentState().getTimeoutTransition() == null || (current.getCurrentState().getTimeoutTransition() != null && timeoutManager == null))) {
			current.clearObligations();
			status = STOPPED;
			for (ProtocolListener l : protocolListeners) {
				l.updateObligations(current.getObls());
			}
			return true;
		}
		return false;
	}
	
	public boolean goOn() {
		if (status == STOPPED) {
			status = RUNNING;
			current.updateNewObligations();
			for (ProtocolListener l : protocolListeners) {
				l.updateObligations(current.getObls());
			}
			return true;
		}
		return false;
	}
	
	private boolean isReadyToRun() {
		for (Participant e : protocol.getParticipants().values()) {
			if (!isParticipantOk(e)) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isReadyToRunLast() {
		for (Participant e : protocol.getParticipants().values()) {
			if (!isLastParticipantOk(e)) {
				return false;
			}
		}
		
		return true;
	}

	public boolean processOccurrence(Occurrence occurrence) {
		//lock.lock();
		try {
			logger.info("Occurrence arrived at " + id + ": " + occurrence);
			
			boolean processed = false;
			boolean newState = false;
			if (status == RUNNING) {
				
				List<Transition> possibleTransitions = validateOccurrence(occurrence);
				
				if (possibleTransitions != null) {
					Transition readyTransition = current.fireTransitions(occurrence, possibleTransitions);
					processed = true;
					if (readyTransition != null) {
						breakTimeout();
						current.addFiredTransition(readyTransition);
						current.setCurrentState(readyTransition.getNextState());
						
						if (current.getCurrentState().isFinalState()) {
							status = FINISHED;
						}
						
						notifyListeners(current.getCurrentState());
						newState = true;
					}
				}
			}
	
			if (processed) {
				logger.info("YES -> Occurrence arrived at " + id + ": " + occurrence);
				occurrence.setValid();
			} else {
				logger.info("NO -> Occurrence arrived at " + id + ": " + occurrence);
			}
			
			if (newState && !executingPendingOccurrences) { //Test the possible occurrences failed in the state before this one
				testPossibleNextOccurrences();
				activeTimeoutTransition();
			}
			return processed;
		} finally {
			//lock.unlock();
		}
	}
	
	private void testPossibleNextOccurrences() {
		executingPendingOccurrences = true;
		Queue<Occurrence> list = current.getPossibleNextOccurrences();
		current.resetPossibleNewOccurrences();
		
		logger.info("Processing pending events " + list.size());
		
		int step = current.getStep();
		
		for (Occurrence t : list) {
			processOccurrence(t);
			if (current.getStep() != step) {
				logger.info("Breaking because some transition was faired");
				break;
			}
		}
		logger.info("End of pending events");
		executingPendingOccurrences = false;
	}
	
	private List<Transition> validateOccurrence(Occurrence occurrence) {
		if (triggerValidator == null || current.checkClone(occurrence))
			return null;
		
		List<Transition> result = new ArrayList<Transition>();
		
		if (occurrence instanceof ActionOccurrence) {
			ActionOccurrence action = (ActionOccurrence) occurrence;

			//Verify if these entities are playing the protocol
			if (!player2Participant.containsKey(action.getAgentId()) || !player2Participant.containsKey(action.getArtifactId())) {
				return null;
			}
			
			//Verify if the state has transitions
			if (current.getEnabledTransitions().size() == 0) {
				return null;
			}
			
			for (Transition t : current.getEnabledTransitions()) {
				Participant source = t.getSource();
				Participant destination = t.getDestination();
				
				if (t.getType() == Transition.ACTION 
						&& isPlayer(source, action.getAgentId()) && triggerValidator.validateAgent(source.getRoleOrType(), action.getAgentId().toString())
						&& isPlayer(destination, action.getArtifactId()) && triggerValidator.validateArtifact(destination.getRoleOrType(), action.getArtifactId().toString()) 
					    && validateOccurrence(t, action.getAction())) {
					
					logger.info("Transition fired by action " + action);
					//yes, pode disparar
					result.add(t);
				}
			}
			
			if (result.size() == 0 && action.getLife() <= action.getLifeLimit()) { //Add trigger to be tested in the next step
				action.inc();
				current.addPossibleNextOccurrence(action);
			}
		} else if (occurrence instanceof MessageOccurrence) {
			MessageOccurrence message = (MessageOccurrence) occurrence;
			
			//Verify if these entities are playing the protocol
			if (!player2Participant.containsKey(message.getSourceId()) || !player2Participant.containsKey(message.getDestinationId())) {
				return null;
			}
			
			//Verify if the state has transitions
			if (current.getEnabledTransitions().size() == 0) {
				return null;
			}
			
			for (Transition t : current.getEnabledTransitions()) {
				Participant source = t.getSource();
				Participant destination = t.getDestination();
				
				if (t.getType() == Transition.MESSAGE
						&& isPlayer(source, message.getSourceId()) && triggerValidator.validateAgent(source.getRoleOrType(), message.getSourceId().toString())
						&& isPlayer(destination, message.getDestinationId()) && triggerValidator.validateAgent(destination.getRoleOrType(), message.getDestinationId().toString())
						&& t.getPerformative().equals(message.getPerformative())
						&& validateOccurrence(t, message.getContent())) {
					
					logger.info("Transition fired by message " + message);
					//yes, pode disparar
					result.add(t);
					
				}
			}
			
			if (result.size() == 0 && message.getLife() <= message.getLifeLimit()) { //Add trigger to be tested in the next step
				message.inc();
				current.addPossibleNextOccurrence(message);
			}
		} else {
			EventOccurrence event = (EventOccurrence) occurrence;
			
			//Verify if these entities are playing the protocol
			if (!player2Participant.containsKey(event.getArtifactId())) {
				return null;
			}
			if (!event.getDestinationId().equals("+") && !player2Participant.containsKey(event.getDestinationId())) {
				return null;
			}
			
			//Verify if the state has transitions
			if (current.getEnabledTransitions().size() == 0) {
				return null;
			}
			
			for (Transition t : current.getEnabledTransitions()) {
				Participant source = t.getSource();
				Participant destination = t.getDestination();
				
				if (t.getType() == Transition.EVENT 
						&& isPlayer(source, event.getArtifactId()) && triggerValidator.validateArtifact(source.getRoleOrType(), event.getArtifactId().toString())
						&& (event.getDestinationId().equals("+") || (!event.getDestinationId().equals("+") && isPlayer(destination, event.getDestinationId()) && triggerValidator.validateAgent(destination.getRoleOrType(), event.getDestinationId().toString())))
						&& validateOccurrence(t, event.getSignal())) {
					
					logger.info("Transition fired by event " + event);
					//yes, pode disparar
					result.add(t);
					
				}
			}
			
			if (result.size() == 0 && event.getLife() <= event.getLifeLimit()) { //Add trigger to be tested in the next step
				event.inc();
				current.addPossibleNextOccurrence(event);
			}
		}
		if (result.size() == 0) 
			return null;
		return result;
	}
	
	private boolean validateOccurrence(Transition t, String content) {
		for (Trigger trigger : t.getTransitionTriggers()) {
			if (triggerValidator.validateTrigger(trigger.getPattern(), trigger.getContent(), content)) {
				return true;
			}
		}
		return false;
	}
	
	public void setTriggerValidator(TriggerValidator triggerValidator) {
		this.triggerValidator = triggerValidator;
	}
	
	public void addProtocolListener(ProtocolListener listener) {
		if (!protocolListeners.contains(listener))
			protocolListeners.add(listener);
	}
	
	public void removeProtocolListener(ProtocolListener listener) {
		protocolListeners.remove(listener);
	}
	
	private void notifyListeners(State s) {
		for (ProtocolListener l : protocolListeners) {
			l.newState(s);
			l.updateObligations(current.getObls());
			
			if (status == FINISHED) {
				l.protocolFinished();
				status = NOTIFIED_FINISHED;
			}
		}
	}
	
	public boolean join(String participantName, Entity agentName) {
		Participant participant = protocol.getParticipants().get(participantName);
		
		if (participant != null && !isParticipantFull(participant) && !isPlayer(participant, agentName)) { //if the participant isn't filled out
			if (triggerValidator.validateAgent(participant.getRoleOrType(), agentName.toString())) {
				addPlayer(participant, agentName); //add the agent as a player from the participant
				HashSet<Participant> playingEntitiesByAgent = player2Participant.get(agentName);
				if (playingEntitiesByAgent == null) {
					playingEntitiesByAgent = new HashSet<Participant>();
					player2Participant.put(agentName, playingEntitiesByAgent);
				}
				playingEntitiesByAgent.add(participant); //add the participant as a playing participant by the agent
				return true;
			} else {
				logger.info("triggerValidator.validateAgent(participant.getRoleOrType(), agentName))");
			}
		} else {
			logger.info("!participant.isOk()");
		}
		
		return false;
	}
	
	public boolean leave(String participantName, Entity agentName) {
		Participant participant = protocol.getParticipants().get(participantName);
		
		if (status == RUNNING || status == STOPPED) {
			if (participant != null && isPlayer(participant, agentName) && isParticipantOkWithoutOne(participant)) {
				removePlayer(participant, agentName);
				HashSet<Participant> playingEntitiesByAgent = player2Participant.get(agentName);
				playingEntitiesByAgent.remove(participant);
				return true;
			}
		} else {
			if (participant != null && isPlayer(participant, agentName)) {
				removePlayer(participant, agentName);
				HashSet<Participant> playingEntitiesByAgent = player2Participant.get(agentName);
				playingEntitiesByAgent.remove(participant);
				return true;
			}
		}
		return false;
	}
	
	public boolean addArtifact(String participantName, Entity artifactName) {
		Participant participant = protocol.getParticipants().get(participantName);
		
		
		if (participant != null && !isParticipantFull(participant) && !isPlayer(participant, artifactName)) { //if the participant isn't filled out
			if (triggerValidator.validateArtifact(participant.getRoleOrType(), artifactName.toString())) {
				addPlayer(participant, artifactName); //add the artifact as a player from the participant
				HashSet<Participant> playingEntitiesByArtifact = player2Participant.get(artifactName);
				if (playingEntitiesByArtifact == null) {
					playingEntitiesByArtifact = new HashSet<Participant>();
					player2Participant.put(artifactName, playingEntitiesByArtifact);
				}
				playingEntitiesByArtifact.add(participant); //add the participant as a playing participant by the artifact
				
				return true;
			} else {
				logger.info("triggerValidator.validateArtifact(participant.getRoleOrType(), artifactName))");
			}
		} else {
			logger.info("!participant.isOk()");
		}
		
		return false;		
	}
	
	public boolean removeArtifact(String participantName, Entity artifactName) {
		Participant participant = protocol.getParticipants().get(participantName);
		
		if (status == RUNNING || status == STOPPED) {
			if (participant != null && isPlayer(participant, artifactName) && isParticipantOkWithoutOne(participant)) {
				removePlayer(participant, artifactName);
				HashSet<Participant> playingEntitiesByArtifact = player2Participant.get(artifactName);
				playingEntitiesByArtifact.remove(participant);
				return true;
			}
		} else {
			if (participant != null && isPlayer(participant, artifactName)) {
				removePlayer(participant, artifactName);
				HashSet<Participant> playingEntitiesByArtifact = player2Participant.get(artifactName);
				playingEntitiesByArtifact.remove(participant);
				return true;
			}
		}
		return false;
	}
	
	private void activeTimeoutTransition() {
		if (current.getCurrentState().getTimeoutTransition() != null && timeoutManager != null) {
			logger.info(" Activing timeout... at state: " + current.getCurrentState().getId() + " timeout: " + current.getCurrentState().getTimeout());
			timeoutManager.setTimeout(current.getCurrentState().getTimeout());
			timeoutManager.setListener(this);
			timeoutManager.startTimeout();
		}
	}
	
	private void breakTimeout() {
		if (timeoutManager != null) {
			timeoutManager.breakTimeout();
		}
	}
	
	public void timeoutExpired() {
		logger.info("TIMEOUT occurred " + id + " state " + current.getCurrentState().getId());
		
		current.addFiredTransition(current.getCurrentState().getTimeoutTransition());
		current.setCurrentState(current.getCurrentState().getGotoStateOnTimeout());
		
		if (current.getCurrentState().isFinalState()) {
			status = FINISHED;
		}
		
		notifyListeners(current.getCurrentState());
		
		//Test the possible triggers failed in the state before this one
		testPossibleNextOccurrences();
		activeTimeoutTransition();
	}
	
	public int getStatus() {
		return status;
	}
	
	public String getSceneId() {
		return id;
	}
	
	/*
	 * Participant evaluations
	 */
	
	/**
	 * Check if more agents may play
	 * @return
	 */
	public boolean isParticipantFull(Participant p) {
		if (p.getqMax() != null) {
			if (p.getqMax().equals("+")) {
				return false;
			} else {
				return triggerValidator.validateAllCardinality(p);			
			}
		} else {
			if (participant2Player.get(p).size() < p.getMax()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isLastParticipantOk(Participant p) {
		return formation.get(p);
	}
	
	/**
	 * Check if the participant is ready to run the protocol
	 * @return
	 */
	public boolean isParticipantOkWithoutOne(Participant p) {
		if (p.getqMax() != null) {
			if (p.getqMax().equals("+")) {
				if (participant2Player.get(p).size() -1 >= p.getMin()) {
					return true;
				}				
			} else {
				if (participant2Player.get(p).size() -1 >= p.getMin()) {
					return true;
				}
			}
		} else {
			if (participant2Player.get(p).size() -1 >= p.getMin() && participant2Player.get(p).size() -1 <= p.getMax()) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Check if the participant is ready to run the protocol
	 * @return
	 */
	public boolean isParticipantOk(Participant p) {
		if (p.getqMax() != null) {
			if (p.getqMax().equals("+")) {
				if (participant2Player.get(p).size() >= p.getMin()) {
					return true;
				}
			} else {
				if (triggerValidator.validateAllCardinality(p)) {
					return true;
				}
			}
		} else {
			if (participant2Player.get(p).size() >= p.getMin() && participant2Player.get(p).size() <= p.getMax()) {
				return true;
			}
		}
		
		return false;
	}
	
	
	private void addPlayer(Participant p, Entity player) {
		if (!participant2Player.get(p).contains(player)) {
			participant2Player.get(p).add(player);
			formation.put(p, isParticipantOk(p));
		}
	}
	
	private void removePlayer(Participant p, Entity player) {
		participant2Player.get(p).remove(player);
		formation.put(p, isParticipantOk(p));
	}
	
	public boolean isPlayer(Participant p, Entity player) {
		return participant2Player.get(p).contains(player);
	}
	
	public Set<Entity> getPlayers(Participant p) {
		return participant2Player.get(p);
	}
}
