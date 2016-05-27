package artifacts;

import jason.asSyntax.Atom;
import jason.asSyntax.Term;

import java.util.HashMap;

import java.util.Map.Entry;

import ora4mas.nopl.JasonTermWrapper;

import cartago.*;

public class BallotBox extends Artifact {
	private HashMap<String, Integer> votes = new HashMap<String, Integer>();
	private boolean initialized = false;
	private ArtifactId timeoutArtifact = null;
	private ObsProperty agentWinnerProp = null;
	private boolean busy = false;
	
	void init() {
		
	}
	
	@GUARD
	boolean notBusy(String agent){
		return !busy;
	}

	@OPERATION(guard="notBusy")
	void vote(String agent) {
		busy = true;
		if (!initialized) {
			initialized = true;
			votes.clear();
			createTimeoutArtifact();
			setTimeout(60000);
			startTimeout();
			
			if (agentWinnerProp != null) {
				removeObsPropertyByTemplate(agentWinnerProp.getName(), agentWinnerProp.getValues());
			}
		}
		
		System.out.println("Agent " + getOpUserName() + " votes in " + agent);
		
		if (!votes.containsKey(agent)) {
			votes.put(agent, 1);
		} else {
			votes.put(agent, votes.get(agent)+1);
		}
		busy = false;
	}
	
	private void setTimeout(long timeout) {
		try {
			if (timeoutArtifact == null)
				createTimeoutArtifact();
			
			execLinkedOp(timeoutArtifact, "setTimeout", timeout);
		} catch (OperationException e) {
			e.printStackTrace();
		}
	}
	
	private void startTimeout() {
		try {
			if (timeoutArtifact == null)
				createTimeoutArtifact();
			
			execLinkedOp(timeoutArtifact, "start", getId().getName());
		} catch (OperationException e) {
			e.printStackTrace();
		}
	}
	
	@LINK
	void timeoutExpired() {
		System.out.println("Election finished!");
		String agentWinner = "";
		int votesWinner = -1;
		
		for (Entry<String, Integer> cAgent : votes.entrySet()) {
			if (cAgent.getValue() > votesWinner) {
				agentWinner = cAgent.getKey();
				votesWinner = cAgent.getValue();
			}
		}
		
		Term winner = new Atom(agentWinner);
		Object[] o = getTermsAsProlog(winner);
		defineObsProperty("winner", o);
		agentWinnerProp = getObsPropertyByTemplate("winner", o);
		System.out.println("The winner is " + agentWinner);
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
	

	private Object[] getTermsAsProlog(Term... o) {
		Object[] terms = new Object[o.length];
		int i = 0;
		for (Term t : o)
			terms[i++] = new JasonTermWrapper(t);

		return terms;
	}
}

