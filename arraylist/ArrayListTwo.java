package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTwo {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> numbers = new ArrayList<>();

		// creating for loop that inputs 10 random numbers into ArrayList 0-100
		for (int count = 0; count < 10; count++) {

			int randomNumber = r.nextInt(99 - 10 + 1) + 10;
			//adding random number to ArrayList
			numbers.add(randomNumber);
		}

		System.out.println("ArrayList: " + numbers);

	}// end main

}// End
