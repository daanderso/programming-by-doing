package arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindValue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random r = new Random();
		ArrayList<Integer> numbers = new ArrayList<>();

		for (int index = 1; index <= 10; index++) {
			// generate random number from 0 - 50
			int randomNumber = r.nextInt(49 - 10 + 1) + 10;
			// adding random number into arraylist
			numbers.add(randomNumber);
		} // end for

		System.out.println(numbers);
		System.out.print("Value to find: ");
		int numToFind = input.nextInt();

		for (Integer element : numbers) {
             if (element == numToFind){
            	 System.out.println(numToFind + " is in the arraylist");
             }
		}

	}// end main

}// end class
