// CArtAgO artifact code for project dissertacaoInteracao

package int4mas;

import cartago.*;

public class TimeoutArtifact extends Artifact {
	private long timeout;
	private boolean breaked = false;
	private long interval = 50;
	private long total = 0;
	private String artifactListener = null;
	
	void init() {
		//System.out.println("Timeout artifact created " + getId().getName());
	}
	
	@INTERNAL_OPERATION
	public void run() {
		
		//System.out.println("Initialized timeout!!");
		total = 0;
		while (total < timeout && breaked == false) {
			await_time(interval);
			total += interval;
		}
		
		if (!breaked) {
			try {
				//System.out.println("###### TIMEOUT OCURRED!");
				ArtifactId aid = lookupArtifact(artifactListener);
				execLinkedOp(aid, "timeoutExpired");
			} catch (OperationException e) {
				e.printStackTrace();
			}
		}
	}

	@LINK
	void setTimeout(long timeout) {
		this.timeout = timeout;
		//System.out.println("Setting timeout!!");
	}
	
	@LINK
	void start(String artifactListener) {
		breaked = false;
		//System.out.println("###### STARTED!" + timeout);
		this.artifactListener = artifactListener;
		execInternalOp("run");
	}
	
	@LINK
	void stop() {
		//System.out.println("###### STOPPED!");
		breaked = true;
		this.timeout = 0;
	}
	
	protected void dispose() {}
}

