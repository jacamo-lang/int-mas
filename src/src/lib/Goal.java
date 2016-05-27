package lib;

public class Goal {
	private String name;
	
	public Goal(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o) {
		return  o.toString().equals(name);
	}
	
	public String toString() {
		return name;
	}
	
	public int hashCode() {
		return name.hashCode();
	}
}
