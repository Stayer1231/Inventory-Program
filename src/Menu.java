
public class Menu {
	
	//Removing item
	public static void add() {
		System.out.println("1/ Add wood");
		System.out.println("2/ Add potion");
		System.out.println("3/ Add apple");
		System.out.println("4/ View inventory");
		System.out.println("5/ Go back");
		System.out.println("Press 9 to exit.");
	}
	
	//Print menu to Remove or remove item
	public static void mainMenu() {
		System.out.println("1/ Add item");
		System.out.println("2/ Remove item");
		System.out.println("3/ View inventory");
		System.out.println("Press 9 to exit.");
	}
	
	//Print separator
	public static void printSeparator(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void remove() {
		System.out.println("1/ Remove wood");
		System.out.println("2/ Remove potion");
		System.out.println("3/ Remove apple");
		System.out.println("4/ View inventory");
		System.out.println("5/ Go back");
		System.out.println("Press 9 to exit.");
	}
	
}
