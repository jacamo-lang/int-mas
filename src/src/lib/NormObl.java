package lib;

public class NormObl {
	private String sceneName;
	private String stateId;
	private String role;
	
	public NormObl(String sceneName, String stateId, String role) {
		this.sceneName = sceneName;
		this.stateId = stateId;
		this.role = role;
	}
	
	public String getSceneName() {
		return sceneName;
	}
	
	public String getStateId() {
		return stateId;
	}
	
	public String getRole() {
		return role;
	}
}