package lib;

public class ActionOccurrence implements Occurrence {
	private String action;
	private Entity agentId;
	private Entity artifactId;
	private String protocolId;
	private boolean valid = false;
	private int life = 0;
	private int lifeLimit = 0;

	public ActionOccurrence(Entity agentId, Entity artifactId, String action, String protocolId) {
		this.protocolId = protocolId;
		this.action = action;
		this.agentId = agentId;
		this.artifactId = artifactId;
	}
	
	public String toString() {
		return "(" + agentId + "," + artifactId + "," + action + ")";
	}
	
	public String getProtocolId() {
		return protocolId;
	}

	public String getAction() {
		return action;
	}

	public Entity getAgentId() {
		return agentId;
	}

	public Entity getArtifactId() {
		return artifactId;
	}

	public boolean checkClone(Occurrence obj) {
		if (obj instanceof ActionOccurrence) {
			ActionOccurrence t = (ActionOccurrence) obj;	
			return agentId.equals(t.getAgentId()) && artifactId.equals(t.getArtifactId());
		} 
		return false;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid() {
		valid = true;
	}
	
	public void inc() {
		life++;
	}
	
	public int getLife() {
		return life;
	}
	
	public int getLifeLimit() {
		return lifeLimit;
	}
	
	public void setLifeLimit(int lifeLimit) {
		this.lifeLimit = lifeLimit; 
	}
}
