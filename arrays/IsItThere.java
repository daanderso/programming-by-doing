package arrays;

import java.util.Random;
import java.util.Scanner;

public class IsItThere {

	public static void main(String[] args) {
		int numbers[] = new int[10];
		Scanner input = new Scanner(System.in);
		boolean inArray = false;

		populateRandomArray(numbers);


		System.out.print("\nEnter a value: ");
		int userInput = input.nextInt();
		
		
		inArray = isInArray(numbers,userInput,inArray);
		
		if (inArray == false){
			System.out.println(userInput + " is not in the array");
		}else if (inArray == true){
			System.out.println(userInput + " is in the array");
		}
		
		countElements(numbers, userInput);
		
	}

	// populates an array with random numbers
	public static void populateRandomArray(int array[]) {
		Random r = new Random();
		System.out.print("Array: ");
		for (int i = 0; i <= array.length - 1; i++) {
			int x = r.nextInt((50 - 1) + 1) + 1;
			array[i] = x;
			System.out.print(array[i] + " ");
		}
	}

	// counts the number of occurrences of a number in the array
	public static void countElements(int array[], int userInput) {

		int numCount = 0;
		for (int i = 0; i <= array.length - 1; i++) {

			if (userInput == array[i]) {
				numCount++;
			}
		}

		System.out.println(userInput + " was found " + numCount + " times");

	}

	public static boolean isInArray(int array[], int userInput, boolean result) {
		//boolean result = false;

		for (int i = 0; i <= array.length - 1; i++) {

			if (userInput == array[i]) {
				result = true;			
			}
		}
		return result;
	}
}
