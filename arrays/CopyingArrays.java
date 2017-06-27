package arrays;

import java.util.Random;

public class CopyingArrays {

	public static void main(String[] args) {

		// creating random object
		Random r = new Random();
		int x;

		// creating 2 arrays to hold 10 elements
		int[] arrayOne = new int[10];
		int[] arrayTwo = new int[10];

		for (int index = 0; index <= (arrayOne.length - 1); index++) {
			// generating random number from 1-100 randomNum = rand.nextInt((max - min) + 1) + min
			x = r.nextInt((100 - 1) + 1) + 1;

			// filling elements in array one
			arrayOne[index] = x;		
			// copying what in arrayOne to ArrayTwo
			arrayTwo[index] = arrayOne[index];
		}

		// setting last element of arrayOne to -7
		arrayOne[9] = -7;

		// Displaying arrayOne
		System.out.print("array 1: ");
		for (int index = 0; index <= (arrayOne.length - 1); index++) {
			System.out.print(arrayOne[index] + " ");
		}

		// Displaying arrayTwo
		System.out.print("\n");
		System.out.print("array 2: ");
		for (int index = 0; index <= (arrayTwo.length - 1); index++) {
			System.out.print(arrayTwo[index] + " ");
		}

	}// end main

}// end class
