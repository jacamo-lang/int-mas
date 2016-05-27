package lib;

import java.util.List;


public interface ProtocolListener {
	public void newState(State s);
	public void updateObligations(List<Obligation> obls);
	public void protocolFinished();
}

