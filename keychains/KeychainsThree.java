package keychains;

import java.util.Scanner;

public class KeychainsThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userChoice;
		boolean menuLoop = true;
		int currentNumberOfKeychains = 0;
		int pricePerKeychain = 10;
		double salesTax = 0.0825;
		int baseShipping = 5;
		int shippingPerKeychain = 1;
		

		// Keychain Shop Menu
		System.out.println("Welcome to the Key chain Shop");

		do {
			System.out.println();
			System.out.println("1. Add Keychains To Order");
			System.out.println("2. Remove Keychains From Keychains Order");
			System.out.println("3. View Order");
			System.out.println("4. Checkout");
			System.out.println();
			System.out.print("Please enter your choice: ");
			

			userChoice = input.next();

			if (userChoice.equals("1")) {

				currentNumberOfKeychains = add_keychains(currentNumberOfKeychains);

			} else if (userChoice.equals("2")) {
				
				currentNumberOfKeychains = remove_keychains(currentNumberOfKeychains);
			
			} else if (userChoice.equals("3")) {
		
				view_order(currentNumberOfKeychains, pricePerKeychain, salesTax, baseShipping, shippingPerKeychain);
			
			} else if (userChoice.equals("4")) {
				
				checkout(currentNumberOfKeychains, pricePerKeychain, salesTax, baseShipping, shippingPerKeychain);
				menuLoop = false;
			
			} else {
		
				System.out.println("Not a valid input. Please try again");
			}

		} while (menuLoop != false);
		input.close();
	}// end main

	public static int add_keychains(int currentNumberOfKeychains) {

		Scanner input = new Scanner(System.in);

		System.out.println("You have " + currentNumberOfKeychains + " How many like to add?");
		int keychainsToAdd = input.nextInt();
		
		int checkForNegNumber = keychainsToAdd;
		
		while (checkForNegNumber < 0) {
			System.out.println("You've entered " + checkForNegNumber + ". Please enter a positive number.");
			System.out.println("You have " + currentNumberOfKeychains + " How many like to add?");
			checkForNegNumber = input.nextInt();
			keychainsToAdd = checkForNegNumber;
		}
			
		currentNumberOfKeychains = currentNumberOfKeychains + keychainsToAdd;
		System.out.println("You now have " + currentNumberOfKeychains);
		

		return currentNumberOfKeychains;
	}

	public static int remove_keychains(int currentNumberOfKeychains) {
		Scanner input = new Scanner(System.in);

		System.out.println("You have " + currentNumberOfKeychains + " How many like to remove?");
		int keychainsToRemove = input.nextInt();

		currentNumberOfKeychains = currentNumberOfKeychains - keychainsToRemove;
		System.out.println("You now have " + currentNumberOfKeychains);

		return currentNumberOfKeychains;
	}

	public static void view_order(int currentNumberOfKeychains, int pricePerKeychain, double salesTax, int baseShipping, int shippingPerKeychain) {

		System.out.println("You now have " + currentNumberOfKeychains);
		System.out.println("Keychains cost " + "$" + pricePerKeychain + " each.");
		
		int shippingTotal = baseShipping + (shippingPerKeychain * currentNumberOfKeychains);
		System.out.println("Total shipping costs are $" + shippingTotal);

		int subtotal = (currentNumberOfKeychains * pricePerKeychain) + shippingTotal;
		System.out.println("The subtotal for this order is " + "$" + subtotal);
		
		System.out.println("Sales Tax: " + "$" + salesTax);
		double total = subtotal + (subtotal * salesTax);
		System.out.println("Total cost is " + "$" + total);
		
		return;
	}

	public static void checkout(int currentNumberOfKeychains, int pricePerKeychain, double salesTax, int baseShipping, int shippingPerKeychain ) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.next();
		
		view_order(currentNumberOfKeychains, pricePerKeychain, salesTax, baseShipping, shippingPerKeychain);
		
		System.out.println("Thanks for your order, " + name);
		
		return;
	}

}