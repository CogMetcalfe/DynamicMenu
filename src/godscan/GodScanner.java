package godscan;

import java.util.Scanner;

//Ross
public class GodScanner {
	public static Scanner scanner = new Scanner(System.in);
	public static void createScanner() {
		destroyScanner();
		scanner = new Scanner(System.in);
	}
	public static boolean destroyScanner() {
		if(scanner!=null) {
			scanner.close();
			return true;
		}
		return false;
	}
}
