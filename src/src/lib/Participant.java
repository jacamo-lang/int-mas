package lib;

public class Participant {
	private String id;
	private String roleORtype;
	private String kind;
	private int min = 1;
	private int max = 1;
	private String qMax = null;
	
	public Participant(String id, String roleORtype, String kind) {
		this.id = id;
		this.roleORtype = roleORtype;
		this.kind = kind;
	}

	public Participant(String id, String roleORtype, String kind, int min, int max) {
		this.id = id;
		this.roleORtype = roleORtype;
		this.kind = kind;
		this.min = min;
		this.max = max;
	}

	public Participant(String id, String roleORtype, String kind, int min, String qMax) {
		this.id = id;
		this.roleORtype = roleORtype;
		this.kind = kind;
		this.min = min;
		this.qMax = qMax;
		this.max = Integer.MAX_VALUE;
	}
	
	public String getId() {
		return id;
	}

	public String getRoleOrType() {
		return roleORtype;
	}

	public String getKind() {
		return kind;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public String getqMax() {
		return qMax;
	}
}
