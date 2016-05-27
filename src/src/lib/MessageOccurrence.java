package lib;

public class MessageOccurrence implements Occurrence {
	private Entity sourceId;
	private Entity destinationId;
	private String performative;
	private String content;
	private String protocolId;
	private boolean valid = false;
	private int life = 0;
	private int lifeLimit = 0;
	
	public MessageOccurrence(Entity sourceId, Entity destinationId, String performative, String content, String protocolId) {
		this.protocolId = protocolId;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.performative = performative;
		this.content = content;
	}
	
	public String toString() {
		return "(" + sourceId + "," + destinationId + "," + performative + "," + content + ")";
	}
	
	public String getProtocolId() {
		return protocolId;
	}

	public Entity getSourceId() {
		return sourceId;
	}

	public Entity getDestinationId() {
		return destinationId;
	}

	public String getPerformative() {
		return performative;
	}

	public String getContent() {
		return content;
	}
	
	public boolean checkClone(Occurrence obj) {
		if (obj instanceof MessageOccurrence) {
			MessageOccurrence t = (MessageOccurrence) obj;
			return sourceId.equals(t.getSourceId()) && destinationId.equals(t.getDestinationId()) && performative.equals(t.getPerformative());
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
