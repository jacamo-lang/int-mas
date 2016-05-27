package lib;

public class EventOccurrence implements Occurrence {
	private Entity artifactId;
	private String signal;
	private Entity destinationId;
	private boolean valid = false;
	private int life = 0;
	private int lifeLimit = 0;
	
	public EventOccurrence(Entity artifactId, String signal, Entity destinationId) {
		this.artifactId = artifactId;
		this.signal = signal;
		this.destinationId = destinationId;
	}
	
	public String toString() {
		return "(" + artifactId + "," + destinationId + "," + signal + ")";
	}

	public Entity getArtifactId() {
		return artifactId;
	}

	public String getSignal() {
		return signal;
	}

	public Entity getDestinationId() {
		return destinationId;
	}
	
	public boolean checkClone(Occurrence obj) {
		if (obj instanceof EventOccurrence) {
			EventOccurrence t = (EventOccurrence) obj;
			return artifactId.equals(t.getArtifactId()) && destinationId.equals(t.getDestinationId());
		}
		return false;
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
	
	public boolean isValid() {
		return valid;
	}

	public void setValid() {
		valid = true;
	}
}
