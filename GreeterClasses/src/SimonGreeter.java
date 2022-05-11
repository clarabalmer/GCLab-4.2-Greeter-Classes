
public class SimonGreeter extends Greeter {
	//constructors
	public SimonGreeter(String greeting) {
		super(greeting);
	}
	
	@Override
	public String greet(String name) {
		return "Simon Says, \"" + super.greet(name) + "\"";
	}
}