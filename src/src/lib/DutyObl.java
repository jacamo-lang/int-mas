package lib;

import java.util.List;

public class DutyObl {
	private String stateId;
	private String gotoStateId;
	private int dutyType;
	private String performative;
	private String duty;
	private List<String> destinationPlayers;
	
	public DutyObl(String stateId, String gotoStateId, int dutyType,
			String performative, String duty, List<String> destinationPlayers) {
		this.stateId = stateId;
		this.gotoStateId = gotoStateId;
		this.dutyType = dutyType;
		this.performative = performative;
		this.duty = duty;
		this.destinationPlayers = destinationPlayers;
	}

	public String getPerformative() {
		return performative;
	}

	public String getStateId() {
		return stateId;
	}
	
	public String getGotoStateId() {
		return gotoStateId;
	}
	
	public int getDutyType() {
		return dutyType;
	}
	
	public String getDuty() {
		return duty;
	}
	
	public List<String> getDestinationPlayers() {
		return destinationPlayers;
	}
}