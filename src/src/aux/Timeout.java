package aux;

import lib.TimeoutListener;

public class Timeout extends Thread {
	private long timeout;
	private TimeoutListener listener;
	private boolean breaked = false;
	
	public Timeout(long timeout, TimeoutListener listener) {
		setDaemon(true);
		this.timeout = timeout;
		this.listener = listener;
		start();
	}

	public void run() {
		try {
			sleep(timeout);
			listener.timeoutExpired();
		} catch (InterruptedException e) {
			if (!breaked) {
				e.printStackTrace();
			}
		}
	}
	
	public void breakTimeout() {
		breaked = true;
		interrupt();
	}
}
