package lib;

public interface TimeoutManager {
	public void setTimeout(long timeout);
	public void setListener(TimeoutListener listener);
	public void startTimeout();
	public void breakTimeout();
}
