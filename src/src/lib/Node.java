package lib;

import java.util.List;

public class Node {
	private List<Occurrence> occurrences = null;
	private State state;
	private Transition firedTransition = null;
	private int step;
	
	public Node(List<Occurrence> occurrences, State state,
			Transition firedTransition, int step) {
		this.occurrences = occurrences;
		this.state = state;
		this.firedTransition = firedTransition;
		this.step = step;
	}
	
	public Node(State state,
			Transition firedTransition, int step) {
		this.state = state;
		this.firedTransition = firedTransition;
		this.step = step;
	}

	public List<Occurrence> getOccurrences() {
		return occurrences;
	}

	public State getState() {
		return state;
	}

	public Transition getFiredTransition() {
		return firedTransition;
	}

	public int getStep() {
		return step;
	}
}
