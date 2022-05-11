
public class HtmlGreeter extends Greeter {
	private String tagName;
	
	//constructors
	HtmlGreeter(String greeting) {
		super(greeting);
		setTagName("h1");
	}
	HtmlGreeter(String greeting, String tagName) {
		super(greeting);
		setTagName(tagName);
	}
	
	//methods
	@Override
	public String greet(String name) {
		return "<" + tagName + ">" + super.greet(name) + "</" + tagName + ">";
	}
	
	//getters/setters
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
}