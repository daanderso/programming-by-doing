package Functions;

import java.util.Scanner;

public class KeychainsForSale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userChoice;
		boolean menuLoop = true;
		//Keychain shop menu
		
		System.out.println("Welcome to the Keychain Shop");
		
		do {
		System.out.println();
		System.out.println("1. Add Keychains To Order");
		System.out.println("2. Remove Keychains From Keychains Order");
		System.out.println("3. View Order");
		System.out.println("4. Checkout");
		System.out.println();
		System.out.print("Please enter your choice: ");
		System.out.print("");
		
		userChoice = input.next();	
		
		if (userChoice.equals("1")) {
			add_keychains();
		}else if (userChoice.equals("2")) {
			remove_keychains();
		}else if (userChoice.equals("3")) {
			view_order();
		}else if (userChoice.equals("4")) {
			checkout();
			menuLoop = false;
		}else {
			System.out.println("Not a valid input. Please try again");
		}
		
		}while (menuLoop != false);
		
	}// end main

	public static void add_keychains() {
		System.out.println("\nADD KEYCHAINS");
		return;
	}
	
	public static void remove_keychains() {
		System.out.println("\nREMOVE KEYCHAINS");
		return;
	}
	
	public static void view_order() {
		System.out.println("\nVIEW ORDER");
		return;
	}
	
	public static void checkout() {
		System.out.println("\nCHECKOUT");
		return;
	}
	
}
