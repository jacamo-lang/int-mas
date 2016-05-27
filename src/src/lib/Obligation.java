package lib;

import java.util.List;

public class Obligation {
	private String responsibleAgent;
	private NormObl normObl;
	private DutyObl dutyObl;
	private long timeout;
	
	public Obligation(String responsibleAgent, NormObl normObl,
			DutyObl dutyObl, long timeout) {
		this.responsibleAgent = responsibleAgent;
		this.normObl = normObl;
		this.dutyObl = dutyObl;
		this.timeout = timeout;
	}

	public String getResponsibleAgent() {
		return responsibleAgent;
	}

	public NormObl getNormObl() {
		return normObl;
	}

	public DutyObl getDutyObl() {
		return dutyObl;
	}

	public long getTimeout() {
		return timeout;
	}
}
