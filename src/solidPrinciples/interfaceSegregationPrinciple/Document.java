package solidPrinciples.interfaceSegregationPrinciple;

public class Document {

	private String content;

	public Document() {}
	
	public Document(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
