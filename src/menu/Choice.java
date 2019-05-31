package menu;
import event.*;

//Ross
public class Choice {
	String name;
	String[] inputs;
	ChoiceEvent event;
	boolean caseSensitive=false;

	
	public Choice(String name, String input, ChoiceEvent e) {
		this.name = name;
		this.inputs = new String[1];
		this.inputs[0]= input;
		this.event = e;
	}
	
	public Choice(String name, String[] inputs, ChoiceEvent e) {
		this.name = name;
		this.inputs = inputs;
		this.event = e;
	}
	
	public Choice caseSensitive(boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
		return this;
	}
	
	private boolean doesInputMatch(String userInput) {
		if(!caseSensitive) {
			userInput = userInput.toLowerCase();
		}
		for(int i=0;i<inputs.length;i++) {
			String checkStr = inputs[i];

			if(!caseSensitive) {
				checkStr = checkStr.toLowerCase();
			}
			
			if(userInput.equals(checkStr)){
				return true;
			}
		}
		return false;
	}
	
	public boolean eventIfMatch(String userInput) {
		if(doesInputMatch(userInput)) {
			return event.runEvent();
		}
		return false;
	}
	
	
}
