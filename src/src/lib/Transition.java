package lib;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import aux.LoggerManager;

public class Transition {
	public static final int MESSAGE = 0;
	public static final int ACTION = 1;
	public static final int EVENT = 2;
	public static final int TIMEOUT = 3;
	
	private Logger logger = Logger.getLogger(LoggerManager.class.getName());
	
	private State nextState;
	private State currentState;
	private Participant source = null;
	private Participant destination = null;
	
	private int type;
	private String duty = null;
	private String performative = null;
	
	private int cardSource = Integer.MAX_VALUE; //It's necessary because one source may notify all destinations
	private int cardDestination = Integer.MAX_VALUE; //It's necessary because one destination is able to solve the protocol 
	
	private List<Trigger> transitionTriggers = new ArrayList<Trigger>();
	
	public Transition(State currentState, State nextState, Participant source, Participant destination,
			String type, String duty) {
		this.currentState = currentState;
		this.nextState = nextState;
		this.source = source;
		this.destination = destination;
		if (type.equals("message")) {
			this.type = MESSAGE;
		} else if (type.equals("action")) {
			this.type = ACTION;
		} else {
			this.type = EVENT;
		}
		this.duty = duty;
	}
	
	public Transition(State currentState, State nextState, Participant source, Participant destination,
			String type, String performative, String duty) {
		this.currentState = currentState;
		this.nextState = nextState;
		this.source = source;
		this.destination = destination;
		if (type.equals("message")) {
			this.type = MESSAGE;
		} else if (type.equals("action")) {
			this.type = ACTION;
		} else {
			this.type = EVENT;
		}
		this.duty = duty;
		this.performative = performative;
	}

	public Transition(State currentState, State nextState) {
		this.currentState = currentState;
		this.nextState = nextState;
		this.type = TIMEOUT;
	}
	
	public Transition() {
		
	}
	
	public void setNextState(State nextState) {
		this.nextState = nextState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public void setSource(Participant source) {
		this.source = source;
	}

	public void setDestination(Participant destination) {
		this.destination = destination;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public void setPerformative(String performative) {
		this.performative = performative;
	}

	public State getNextState() {
		return nextState;
	}

	public Participant getSource() {
		return source;
	}

	public Participant getDestination() {
		return destination;
	}

	public int getType() {
		return type;
	}

	public String getDuty() {
		return duty;
	}

	public List<Trigger> getTransitionTriggers() {
		return transitionTriggers;
	}

	public void addTransitionTrigger(Trigger transitionTrigger) { 
		if (transitionTrigger.getPattern().equals("")) {
			transitionTrigger.setPattern(duty);
		}
		transitionTriggers.add(transitionTrigger);
	}

	public String getPerformative() {
		return performative;
	}
	
	public State getCurrentState() {
		return currentState;
	}
	
	public int getCardSource() {
		return cardSource;
	}

	public void setCardSource(int cardSource) {
		this.cardSource = cardSource;
	}

	public int getCardDestination() {
		return cardDestination;
	}

	public void setCardDestination(int cardDestination) {
		this.cardDestination = cardDestination;
	}
}
