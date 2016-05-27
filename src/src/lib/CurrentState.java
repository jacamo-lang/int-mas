package lib;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.Queue;

import aux.LoggerManager;

public class CurrentState {
	private Logger logger = Logger.getLogger(LoggerManager.class.getName());
	private State currentState;
	private Set<Occurrence> computedOccurrences = new HashSet<Occurrence>();
	private Map<Transition, List<Occurrence>> notifiedTransitions = new HashMap<Transition, List<Occurrence>>();
	private List<Transition> firedTransitions = new LinkedList<Transition>(); //Set some transition as fired
	private Queue<Occurrence> possibleNextOccurrences = new LinkedList<Occurrence>();
	private List<Obligation> obls = new ArrayList<Obligation>();
	private int step = 0;
	private List<Node> track = new ArrayList<Node>();
	private Scene scene;
	
	public CurrentState(Scene scene) {
		this.scene = scene;
	}

	public State getPreviousState() {
		if (track.size() == 0) {
			return null;
		} else {
			return track.get(track.size()-1).getState();
		}
	}
	
	public void clearObligations() {
		this.obls.clear();
	}
	
	public void updateNewObligations() {
		clearObligations();
		
		if (scene.getStatus() == Scene.RUNNING) {
			for (Transition t : currentState.getTransitions()) {
				
				if (t.getSource().getKind().equals("agent")) {
					List<String> listPlayersSource = new LinkedList<String>();
					for (Entity s : scene.getPlayers(t.getSource())) {
						listPlayersSource.add(s.toString());
					}
					
					List<String> listPlayersDestination = new LinkedList<String>();
					for (Entity s : scene.getPlayers(t.getDestination())) {
						listPlayersDestination.add(s.toString());
					}
				
					DutyObl dutyObl = new DutyObl(currentState.getId(), t.getNextState().getId(), t.getType(), t.getPerformative(), t.getDuty(), listPlayersDestination);
					NormObl normObl = new NormObl(scene.getSceneId(), currentState.getId(), t.getSource().getId());
					long timeout = t.getCurrentState().getTimeout();
					
			    	for (Entity e : scene.getPlayers(t.getSource())) {
			    		Obligation o = new Obligation(e.toString(), normObl, dutyObl, timeout);
			    		obls.add(o);
			    	}
				}
			}
		}
	}
	
	public List<Occurrence> getOccurrencesTransition(Transition t) {
		return notifiedTransitions.get(t);
	}
	
	public Transition getFiredTransition() {
		if (firedTransitions.size() == 0) {
			return null;
		} else {
			return firedTransitions.get(firedTransitions.size()-1);
		}
	}
	
	public Node getFiredTransitionNode() {
		if (track.size() == 0) {
			return null;
		} else {
			return track.get(track.size()-1);
		}
	}
	
	public State getCurrentState() {
		return currentState;
	}
	
	public List<Obligation> getObls() {
		return obls;
	}

	public void addFiredTransition(Transition t) {
		if (t.getType() != Transition.TIMEOUT) {
			track.add(new Node(notifiedTransitions.get(t), currentState, t, step));
		} else {
			track.add(new Node(currentState, t, step));
		}
		firedTransitions.add(t);
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		this.notifiedTransitions.clear();
		this.computedOccurrences.clear();
		updateNewObligations();
		this.step++;
		
		logger.info("Protocol at state " + currentState.getId());
	} 
	
	public void setCurrentState(State currentState, boolean reset) {
		this.currentState = currentState;
		this.notifiedTransitions.clear();
		this.computedOccurrences.clear();
		updateNewObligations();
		if (reset)
			this.step = 0;
		else
			this.step++;
		
		logger.info("Protocol at state " + currentState.getId());
	} 
	
	public Collection<Transition> getEnabledTransitions() {
		return currentState.getTransitions();
	}
	
	public Transition fireTransitions(Occurrence occurrence, List<Transition> transitions) {
		computedOccurrences.add(occurrence);
		
		for (Transition t : transitions) {
			List<Occurrence> triggersTransition = notifiedTransitions.get(t);
			
			if (triggersTransition == null) {
				triggersTransition = new ArrayList<Occurrence>();
				notifiedTransitions.put(t, triggersTransition);
			}
			
			triggersTransition.add(occurrence);
		}
		
		Transition readyTransition = thereAreTransitionsReady();
		
		return readyTransition;
	}
	
	public Transition thereAreTransitionsReady() {
		
		for (Map.Entry<Transition, List<Occurrence>> transitions : notifiedTransitions.entrySet()) {
			Transition t = transitions.getKey();
			List<Occurrence> occurrences = transitions.getValue();
			
			if (checkReadyTransition(t, occurrences)) {
				return t;
			}
		}
		
		return null;
	}
	
	public boolean checkClone(Occurrence occurrence) {
		
		for (Occurrence t : computedOccurrences) {
			if (t.checkClone(occurrence))
				return true;
		}
		
		return false;
	}
	
	public void addPossibleNextOccurrence(Occurrence occurrence) {
		possibleNextOccurrences.offer(occurrence);
	}
	
	public void resetPossibleNewOccurrences() {
		possibleNextOccurrences = new LinkedList<Occurrence>(); 
	}
	
	public Queue<Occurrence> getPossibleNextOccurrences() {
		return possibleNextOccurrences;
	}
	
	public int getStep() {
		return step;
	}
	
	public List<Node> getTrack() {
		return track;
	}
	
	/**
	 * Check if the transition is ready to go to other state
	 * @param triggers
	 * @return
	 */
	public boolean checkReadyTransition(Transition transition, List<Occurrence> occurrences) {
		Set<Entity> playersSource = scene.getPlayers(transition.getSource());
		Set<Entity> playersDestination = scene.getPlayers(transition.getDestination());
		
		Set<Entity> notifiedSources = new HashSet<Entity>();
		Set<Entity> notifiedDestinations = new HashSet<Entity>();
		
		for (Occurrence t : occurrences) {
			if (transition.getType() == Transition.ACTION) {
				notifiedSources.add(((ActionOccurrence)t).getAgentId());
				notifiedDestinations.add(((ActionOccurrence)t).getArtifactId());				
			} else if (transition.getType() == Transition.MESSAGE) {
				notifiedSources.add(((MessageOccurrence)t).getSourceId());
				notifiedDestinations.add(((MessageOccurrence)t).getDestinationId());				
			} else {
				notifiedSources.add(((EventOccurrence)t).getArtifactId());
				if (((EventOccurrence)t).getDestinationId().equals("+")) {
					notifiedDestinations = playersDestination;
				} else {
					notifiedDestinations.add(((EventOccurrence)t).getDestinationId());
				}
			}
		}
		
		logger.info("CHECKING... Source: " + notifiedSources.size() + "/" + playersSource.size() + " -- Destination: " + notifiedDestinations.size() + "/" + playersDestination.size() + " OR Source: " + notifiedSources.size() + "/" + transition.getCardSource() + " -- Destination: " + notifiedDestinations.size() + "/" + transition.getCardDestination());
		
		return (notifiedSources.size() == playersSource.size() || notifiedSources.size() >= transition.getCardSource()) && (notifiedDestinations.size() == playersDestination.size() || notifiedDestinations.size() >= transition.getCardDestination());
	}
}