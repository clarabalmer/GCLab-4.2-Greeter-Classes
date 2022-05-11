
import org.junit.Assert;
import org.junit.jupiter.api.Test;



class Tests {

	@Test
	void testDefaultConstructor() {
		Greeter gr = new Greeter();
		Assert.assertNull(gr.getGreeting());
	}
	@Test
	void testSecondConstructor() {
		Greeter gr = new Greeter("hiya");
		Assert.assertEquals("hiya", gr.getGreeting());
	}
	@Test
	void testGreetMethod() {
		Greeter gr = new Greeter("Hi");
		Assert.assertEquals("Hi, Rebecca!", gr.greet("Rebecca"));
	}
	@Test
	void testSimonGreeting() {
		SimonGreeter sGr = new SimonGreeter("Hey");
		Assert.assertEquals("Hey", sGr.getGreeting());
	}
	@Test
	void testSimonSusan() {
		SimonGreeter sGr = new SimonGreeter("Salutations");
		Assert.assertEquals("Simon Says, \"Salutations, Susan!\"", sGr.greet("Susan"));
	}
	@Test
	void testSimonBecky() {
		SimonGreeter sGr = new SimonGreeter("What's up");
		Assert.assertEquals("Simon Says, \"What's up, Becky!\"", sGr.greet("Becky"));
	}
	@Test
	void testLoudGreeting() {
		LoudGreeter loudGr = new LoudGreeter("Sup");
		Assert.assertEquals("Sup", loudGr.getGreeting());
	}
	@Test
	void testLoudNoLouder() {
		LoudGreeter loudGr = new LoudGreeter("Hiya");
		Assert.assertEquals("Hiya, Felix!!", loudGr.greet("Felix"));
	}
	@Test
	void testLoudOneLouder() {
		LoudGreeter louGr = new LoudGreeter("Sup");
		louGr.addVolume();
		Assert.assertEquals("Sup, Buster!!!", louGr.greet("Buster"));
	}
	@Test
	void testLoudEightLouder() {
		LoudGreeter loudGr = new LoudGreeter("Oh hey");
		for (int i = 0; i < 8; i++) {
			loudGr.addVolume();
		}
		Assert.assertEquals("Oh hey, Camilla!!!!!!!!!!", loudGr.greet("Camilla"));
	}
	@Test
	void testHtmlGreeting() {
		HtmlGreeter ht = new HtmlGreeter("Aloha");
		Assert.assertEquals("Aloha", ht.getGreeting());
	}
	@Test
	void testHtmlDefault() {
		HtmlGreeter ht = new HtmlGreeter("Wowza");
		Assert.assertEquals("<h1>Wowza, Franchesca!</h1>", ht.greet("Franchesca"));
	}
	@Test
	void testHtmlTagSetter() {
		HtmlGreeter sarcasm = new HtmlGreeter("Welcome");
		sarcasm.setTagName("s");
		Assert.assertEquals("<s>Welcome, Dieter!</s>", sarcasm.greet("Dieter"));
	}
	@Test
	void testHtmlFullConstructor() {
		HtmlGreeter con = new HtmlGreeter("Howdy", "b");
		Assert.assertEquals("<b>Howdy, Bub!</b>", con.greet("Bub"));
	}
	@Test
	void testHtmlPlus() {
		HtmlGreeter plus = new HtmlGreeter("Saluton", "f");
		plus.setTagName("p");
		Assert.assertEquals("<p>Saluton, Sofia!</p>", plus.greet("Sofia"));
	}
	
}
