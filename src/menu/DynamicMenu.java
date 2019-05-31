package menu;
import java.util.ArrayList;
import java.util.List;

import godscan.GodScanner;

//Ross
public class DynamicMenu {
	List<Choice> choices;
	
	public DynamicMenu() {
		choices = new ArrayList<Choice>();
	}
	
	public void addChoice(Choice newChoice) {
		choices.add(newChoice);
	}
	
	public void runMenu() {
		boolean running = true;
		while(running) {
			
			printMenu();
			String userInput = GodScanner.getScan().nextLine();
			for(Choice c:choices) {
				if(c.eventIfMatch(userInput)) {
					return;
				}
			}

		}
	}
	
	private void printMenu() {
		for(Choice c:choices) {
			System.out.println(c.name);
		}
	}
}
