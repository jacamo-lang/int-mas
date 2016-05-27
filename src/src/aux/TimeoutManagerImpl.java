package aux;

import lib.TimeoutListener;
import lib.TimeoutManager;

public class TimeoutManagerImpl implements TimeoutManager, TimeoutListener {
	private long timeout;
	private TimeoutListener listener;
	private Timeout timeoutMechanism = null;
	
	public TimeoutManagerImpl() {

	}
	
	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}
	
	public void setListener(TimeoutListener listener) {
		this.listener = listener;
	}
	
	public void startTimeout() {
		timeoutMechanism = new Timeout(timeout, listener);
	}
	
	public void breakTimeout() {
		if (timeoutMechanism != null) {
			timeoutMechanism.breakTimeout();
			timeoutMechanism = null;
		}
	}

	public void timeoutExpired() {
		listener.timeoutExpired();
	}
}
