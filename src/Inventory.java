import java.awt.ItemSelectable;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Inventory {
	static int slotNumber = 0;
	public static String[] playerItem = new String[5];

	//ADDING ITEMS
	public static void addWood() {
		for(int i = 0; i < playerItem.length; i++) {
			if(playerItem[slotNumber] != null && slotNumber < 4) {
				slotNumber ++;
			}
		}
		
		if(playerItem[slotNumber] == null) {
			playerItem[slotNumber] = "wood";
			System.out.println("\nWood added");
		}
		
		else {
			System.out.println("Full");
		}
		slotNumber = 0;
		
	}
	
	public static void addPotion() {
		for(int i = 0; i < playerItem.length; i++) {
			if(playerItem[slotNumber] != null && slotNumber < 4) {
				slotNumber ++;
			}
		}
		
		if(playerItem[slotNumber] == null) {
			playerItem[slotNumber] = "potion";
			System.out.println("\nPotion added");
		}
		
		else {
			System.out.println("Full");
		}
		slotNumber = 0;
	}
	
	public static void addApple() {
		for(int i = 0; i < playerItem.length; i++) {
			if(playerItem[slotNumber] != null && slotNumber < 4) {
				slotNumber ++;
			}
		}
		
		if(playerItem[slotNumber] == null) {
			playerItem[slotNumber] = "apple";
			System.out.println("\nApple added");
		}
		
		else {
			System.out.println("Full");
		}
		slotNumber = 0;
	}
	
	//REMOVING ITEMS
	public static void removeWood() {
		for(int i = 0; i < playerItem.length; i++) {
			if((playerItem[slotNumber] == null || 
					playerItem[slotNumber] == "potion" || 
					playerItem[slotNumber] == "apple") && slotNumber < 4) {
				slotNumber ++;
			}
		}
		
		if(playerItem[slotNumber] == "wood") {
			playerItem[slotNumber] = null;
		}
		
		else {
			System.out.println("\nNothing to remove");
		}
		slotNumber = 0;
	}
	
	public static void removePotion() {
		for(int i = 0; i < playerItem.length; i++) {
			if((playerItem[slotNumber] == null || 
					playerItem[slotNumber] == "wood" || 
					playerItem[slotNumber] == "apple") && slotNumber < 4) {
				slotNumber ++;
			}
		}
		
		if(playerItem[slotNumber] == "potion") {
			playerItem[slotNumber] = null;
		}
		
		else {
			System.out.println("\nNothing to remove");
		}
		slotNumber = 0;
	}
	
	public static void removeApple() {
		for(int i = 0; i < playerItem.length; i++) {
			if((playerItem[slotNumber] == null || 
					playerItem[slotNumber] == "potion" || 
					playerItem[slotNumber] == "wood") && slotNumber < 4) {
				slotNumber ++;
			}
		}
		
		if(playerItem[slotNumber] == "apple") {
			playerItem[slotNumber] = null;
		}
		
		else {
			System.out.println("\nNothing to remove");
		}
		slotNumber = 0;
	}
	
	//Show inventory
	public static void viewInventory() {
		for(int i = 0; i < playerItem.length; i++) {
			if(playerItem[i] == null) {
				System.out.println("< Empty >");
			}
			else if(playerItem[i] != null) {
				System.out.println(playerItem[i] + " ");
			}
		}
	}
}
