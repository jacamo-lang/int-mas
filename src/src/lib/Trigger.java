package lib;

public class Trigger {
	private String pattern = "";
	private String content = "";
	
	public Trigger(String pattern, String content) {
		this.pattern = pattern;
		this.content = content;
	}
	
	public String getPattern() {
		return pattern;
	}
	
	public String getContent() {
		return content;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
