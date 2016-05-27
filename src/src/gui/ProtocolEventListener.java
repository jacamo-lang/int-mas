package gui;

import lib.State;

public interface ProtocolEventListener {
	public void notifyProtocoloStarted();
	
	public void notifyProtocoloStopped();
	
	public void notifyProtocoloFinished();
	
	public void notifyProtocoloRunning();
	
	public void notifyTransitionFired(String textTransition);
	
	public void notifyStateAchieved(State s);
}
