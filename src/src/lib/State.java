package lib;

import java.util.HashSet;
import java.util.Set;

public class State {
	private String id;
	private boolean initialState = false;
	private boolean finalState = false;
	private State gotoStateOnTimeout = null;
	private long timeout = Long.MAX_VALUE;
	private Set<Transition> transitions = new HashSet<Transition>();
	private Transition timeoutTransition = null;
	
	public State(String id) {
		this.id = id;
	}

	public State(String id, boolean initialState, boolean finalState) {
		this.id = id;
		this.initialState = initialState;
		this.finalState = finalState;
	}

	public State getGotoStateOnTimeout() {
		return gotoStateOnTimeout;
	}

	public void setGotoStateOnTimeout(State gotoStateOnTimeout) {
		this.gotoStateOnTimeout = gotoStateOnTimeout;
	}
	
	public void setTimeoutTransition(Transition t) {
		this.timeoutTransition = t;
	}
	
	public Transition getTimeoutTransition() {
		return timeoutTransition;
	}
	
	public long getTimeout() {
		return timeout;
	}

	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}

	public String getId() {
		return id;
	}

	public boolean isInitialState() {
		return initialState;
	}

	public boolean isFinalState() {
		return finalState;
	}
	
	public void addTransition(Transition transition) {
		transitions.add(transition);
	}
	
	public Set<Transition> getTransitions() {
		return transitions;
	}
	/*
	public boolean isSinkState() {
		//return isFinalState();
		return isFinalState() && transitions.size() == 0 && timeout == Long.MAX_VALUE;
	}*/
}	
