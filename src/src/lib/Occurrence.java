package lib;

public interface Occurrence {
	public boolean checkClone(Occurrence t);
	public boolean isValid();
	public void setValid();
	public void inc();
	public int getLife();
	public int getLifeLimit();
	public void setLifeLimit(int lifeLimit);
}
