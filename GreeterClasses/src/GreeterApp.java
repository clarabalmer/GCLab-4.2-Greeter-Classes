import java.util.ArrayList;
import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Choose a greeting: ");
		String userGreet = scnr.nextLine();
		System.out.print("Enter your name: ");
		String userName = scnr.nextLine();
		
		//EXTENDED:
		System.out.println("You will be prompted to select four greeters...");
		fourGreeters(scnr, userGreet, userName);
				
		scnr.close();
		
		//ORIGINAL LAB FUNCTIONALITY:
//		System.out.print("How much louder than loud do you want the loud greeting? (Enter a positive integer): ");
//		int loudLoop = scnr.nextInt();
//		System.out.print("What html tag would you like to use? (Enter just the letter/letters): ");
//		String userTag = scnr.next();
//		
//		Greeter gr = new Greeter(userGreet);
//		System.out.println(gr.greet(userName));
//
//		SimonGreeter simonGr = new SimonGreeter(userGreet);
//		System.out.println(simonGr.greet(userName));
//
//		LoudGreeter loudGr = new LoudGreeter(userGreet);
//		for (int i = 0; i < loudLoop; i++) {
//			loudGr.addVolume();
//		}
//		System.out.println(loudGr.greet(userName));
//
//		HtmlGreeter htmlGr = new HtmlGreeter(userGreet);
//		htmlGr.setTagName(userTag);
//		System.out.println(htmlGr.greet(userName));
	}
	
	public static void fourGreeters(Scanner scnr, String userGreet, String userName) {
		ArrayList<Greeter> greetList = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Select a greeter (normal, simon, loud, or html): ");
			String choice = scnr.nextLine();
			switch (choice) {
				case "normal":
					greetList.add(new Greeter(userGreet));
					break;
				case "simon":
					greetList.add(new SimonGreeter(userGreet));
					break;
				case "loud":
					LoudGreeter loudGr = new LoudGreeter(userGreet);
					System.out.print("How much volume to add? (0 to 10): ");
					String volAdd = scnr.nextLine();
					int volInt = Integer.parseInt(volAdd);
					for (int j = 0; j < volInt; j++) {
						loudGr.addVolume();
					}
					greetList.add(loudGr);
					break;
				case "html":
					System.out.print("Select an HTML tag: ");
					String tag = scnr.nextLine();
					HtmlGreeter htmlGr = new HtmlGreeter(userGreet, tag);
					greetList.add(htmlGr);
					break;
				default:
					System.out.println("That wasn't a valid choice.");
					i--;
			}
		}
		for (int i = 0; i < greetList.size(); i++) {
			System.out.println(greetList.get(i).greet(userName));
		}
	}
	

}
