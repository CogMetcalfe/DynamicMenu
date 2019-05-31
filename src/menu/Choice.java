package menu;
import java.util.ArrayList;

import event.*;

//Ross
public class Choice {
	String name;
	ArrayList<String> inputs;
	ChoiceEvent event;
	boolean caseSensitive=false;
	
	
	public Choice(String name, String input, ChoiceEvent e) {
		this.name = name;
		this.inputs = new ArrayList<String>();
		this.inputs.add(input);
		this.event = e;
	}
	
	public Choice(String name, String[] inputs, ChoiceEvent e) {
		this.name = name;
		this.inputs = new ArrayList<String>();
		for(int i=0;i<inputs.length;i++) {
			this.inputs.add(inputs[i]);
		}
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
		for(int i=0;i<inputs.size();i++) {
			String checkStr = inputs.get(i);

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
	
	public Choice addInput(String additionalInput) {
		if(!inputs.contains(additionalInput)) {
			this.inputs.add(additionalInput);
		}
		return this;
	}
	
	
}
