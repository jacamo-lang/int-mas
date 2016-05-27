package lib;

public interface TriggerValidator {
	public abstract boolean validateTrigger(String validationPattern, String validationContent, String content);
	public abstract boolean validateAgent(String role, String agentId);
	public abstract boolean validateArtifact(String artifactType, String artifactId);
	public abstract boolean validateAllCardinality(Participant entity);
}
