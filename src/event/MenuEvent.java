package event;

import menu.*;

//Ross
public class MenuEvent extends ChoiceEvent{
	DynamicMenu menu;
	
	public MenuEvent(DynamicMenu menu) {
		this.menu = menu;
	}
	@Override
	public boolean runEvent() {
		menu.runMenu();
		return false;
	}

}
