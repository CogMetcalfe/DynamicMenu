import event.*;
import menu.*;

//Jacky
public class DynamicMenuMain {
	public static void main(String[] Jacky) {
		DynamicMenu mainMenu = new DynamicMenu();
		String[] addChoices = {"a", "add", "addition"};
		String[] subtractChoice = {"b", "subtract", "sub"};
		String[] exitChoice = {"c", "exit", "close", "stop", "end"};
		mainMenu.addChoice(new Choice("A) Add",      addChoices, new AddEvent()));
		mainMenu.addChoice(new Choice("B) Subtract", subtractChoice, new SubtractEvent()));
		mainMenu.addChoice(new Choice("C) Exit",     exitChoice, new BackEvent()));
		mainMenu.runMenu();
	}
}
