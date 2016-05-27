package lib;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import aux.LoggerManager;

/**
 * @author xsplyter
 */
public class Protocol {
	private Logger logger = Logger.getLogger(LoggerManager.class.getName());
	
	//Protocol structures
	private Set<Goal> achieveGoals = new HashSet<Goal>();
	private Map<String, Participant> participants = new HashMap<String, Participant>();
	private Map<String, State> states = new HashMap<String, State>();
	private Set<Transition> transitions = new HashSet<Transition>();
	private String name;
	private String description = "";
	private String specification;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void addAchieveGoal(Goal goal) {
		achieveGoals.add(goal);
	}
	
	public Collection<Goal> getAchieveGoals() {
		return achieveGoals;
	}
	
	public void addParticipant(Participant participant) {
		participants.put(participant.getId(), participant);
	}
	
	public void addState(State state) {
		states.put(state.getId(), state);
	}
	
	public void addTransition(Transition transition) {
		transitions.add(transition);
	}
	
	public State getStateByName(String name) {
		return states.get(name);
	}
	
	public Participant getParticipantByName(String name) {
		return participants.get(name);
	}
	
	public Map<String, Participant> getParticipants() {
		return participants;
	}
	
	public Map<String, State> getStates() {
		return states;
	}
	
	public Set<Transition> getTransitions() {
		return transitions;
	}
	
	public String getSpecification() {
		return specification;
	}
	
	
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	public void printProtocol() {
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Goals: ");
		for (Goal g : achieveGoals) {
			System.out.println(g);
		}
		System.out.println("Entities:");
		for (Participant e : participants.values()) {
			String max;
			if (e.getqMax() != null)
				max = e.getqMax();
			else
				max = String.valueOf(e.getMax());
			String min = String.valueOf(e.getMin());
			System.out.println("Id: " + e.getId() + " Kind: " + e.getKind() + " Role/Type: " + e.getRoleOrType() + " Min: " + min + " Max: " + max); 
		}
		System.out.println("States:");
		for (State s : states.values()) {
			String type;
			if (s.isInitialState()) 
				type = "initial";
			else
				type = "";
			
			if (s.isFinalState()) {
				if (type.equals(""))
					type = "final";
				else
					type += ", final";
			}
			String timeout;
			if (s.getTimeout() != Long.MAX_VALUE) 
				timeout = String.valueOf(s.getTimeout()) + " ms";
			else
				timeout = "infinite";
			
			State st = s.getGotoStateOnTimeout();
			String gotoTimeout;
			if (st!= null) 
				gotoTimeout = st.getId();
			else
				gotoTimeout = "";
			
			System.out.println("Id: " + s.getId() + " Type: " + type + " Timeout: " + timeout + " GotoOnTimeout: " + gotoTimeout);
			System.out.println("Transitions state " + s.getId());
			for (Transition t : s.getTransitions()) {

				String cs = t.getCurrentState().getId();
				String ds = t.getNextState().getId();
				String from = "";
				if (t.getSource() != null) {
					from = t.getSource().getId();
				}
				String to = "";
				if (t.getDestination() != null) {
					to = t.getDestination().getId();
				}
				int cardSource = t.getCardSource();
				int cardDestination = t.getCardDestination();
				String typeT;
				if (t.getType() == Transition.ACTION) {
					typeT = "action";
				} else if (t.getType() == Transition.EVENT) {
					typeT = "event";
				} else if (t.getType() == Transition.MESSAGE) {
					typeT = "message";
				} else {
					typeT = "timeout";
				}
				String duty = t.getDuty();
				String performative = t.getPerformative();
				String pattern = "";
				String content = "";
				
				
				System.out.println("Current state: " + cs +
								   " Next state: " + ds +
								   " From: " + from +
								   " To: " + to +
								   " CardSource: " + cardSource + 
								   " CardDestination: " + cardDestination + 
								   " Type: " + typeT +
								   " Duty: " + duty +
								   " Performative: " + performative +
								   " Pattern: " + pattern +
								   " Content: " + content);
				
			}
			if (s.getTimeoutTransition() != null) {
				System.out.println("Transition timeout: " + s.getTimeoutTransition().getCurrentState().getId() + " -> " + s.getTimeoutTransition().getNextState().getId());
			}
			System.out.println("End transitions state " + s.getId());
		}
		System.out.println("Transitions:");
		for (Transition t : transitions) {
			String cs = t.getCurrentState().getId();
			String ds = t.getNextState().getId();
			String from = "";
			if (t.getSource() != null) {
				from = t.getSource().getId();
			}
			String to = "";
			if (t.getDestination() != null) {
				to = t.getDestination().getId();
			}
			int cardSource = t.getCardSource();
			int cardDestination = t.getCardDestination();
			String type;
			if (t.getType() == Transition.ACTION) {
				type = "action";
			} else if (t.getType() == Transition.EVENT) {
				type = "event";
			} else if (t.getType() == Transition.MESSAGE) {
				type = "message";
			} else {
				type = "timeout";
			}
			String duty = t.getDuty();
			String performative = t.getPerformative();
			String pattern = "";
			String content = "";
			
			
			System.out.println("Current state: " + cs +
							   " Next state: " + ds +
							   " From: " + from +
							   " To: " + to +
							   " CardSource: " + cardSource + 
							   " CardDestination: " + cardDestination + 
							   " Type: " + type +
							   " Duty: " + duty +
							   " Performative: " + performative +
							   " Pattern: " + pattern +
							   " Content: " + content);
		}
	}
}
