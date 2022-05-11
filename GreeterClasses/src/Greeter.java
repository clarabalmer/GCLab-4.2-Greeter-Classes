
public class Greeter {
	//instance variables
	private String greeting;
	
	//constructors
	Greeter() {
		
	}
	Greeter(String greeting) {
		setGreeting(greeting);
	}
	
	//methods
	public String greet(String name) {
		return greeting + ", " + name + "!";
	}
	
	//getters/setters
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	
	
}

