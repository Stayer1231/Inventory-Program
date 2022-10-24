import java.awt.Container;
import java.util.Scanner;

import org.w3c.dom.css.CSSCharsetRule;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do { 
			System.out.println();
			Menu.printSeparator(30);
			Menu.mainMenu();
			System.out.print("Your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				do {
					System.out.println();
					Menu.printSeparator(30);
					Menu.add();
					System.out.print("Your choice: ");
					choice = sc.nextInt();
					switch(choice) {
					case 1:
						Inventory.addWood();
						break;
					case 2:
						Inventory.addPotion();
						break;
					case 3:
						Inventory.addApple();
						break;
					case 4:
						System.out.println();
						Inventory.viewInventory();
					}
					
				} while(choice < 5);
				
			break;
			case 2:
				do {
					System.out.println();
					Menu.printSeparator(30);
					Menu.remove();
					System.out.print("Your choice: ");
					choice = sc.nextInt();
					switch(choice) {
					case 1:
						Inventory.removeWood();
						break;
					case 2:
						Inventory.removePotion();
						break;
					case 3:
						Inventory.removeApple();
						break;
					case 4:
						System.out.println();
						Inventory.viewInventory();
					}
				} while(choice < 5);
			break;
				
			case 3:
				System.out.println();
				Inventory.viewInventory();
				
			}
		} while(choice < 9);
		
	}
}
