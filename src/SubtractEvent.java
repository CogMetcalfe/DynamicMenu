import event.ChoiceEvent;
import godscan.GodScanner;

//Jacky
public class SubtractEvent extends ChoiceEvent{

	@Override
	public boolean runEvent() {
		int a;
		int b;
		int result;
		System.out.println("Please enter a number: ");
		a = GodScanner.scanner.nextInt();
		
		System.out.println("Please enter a numbers: ");
		b = GodScanner.scanner.nextInt();
		result = a - b;
		System.out.println(result);
		GodScanner.scanner.nextLine();
		
		return false;
	}

}
