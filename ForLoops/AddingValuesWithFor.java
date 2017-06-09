package ForLoops;

import java.util.Scanner;

public class AddingValuesWithFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int userInput = input.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= userInput; i++){
			System.out.print(i + " ");
			sum = sum + i;
							
		}// end for
		
		System.out.println("\nThe sum of the numbers is " + sum + ".");

	}// end main

}// end class
