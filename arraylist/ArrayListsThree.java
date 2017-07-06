package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListsThree {

	public static void main(String[] args) {

		ArrayList<Integer> arrayOne = new ArrayList<>();
		ArrayList<Integer> arrayTwo = new ArrayList<>();

		Random r = new Random();

		// adding random letters to ArrayList
		for (int counter = 0; counter < 10; counter++) {

			int randomNumbers = r.nextInt(99 - 10 + 1) + 10;
			arrayOne.add(randomNumbers);
		}

		// setting arrayOne=arrayTwo is just a pointer so,
		// using for each loop to iterate over arrayOne and add its contents to arrayTwo
		for (Integer x : arrayOne) {
			arrayTwo.add(x);
		}

		// inserting a -7 at index 9 of arrayOne using set method
		arrayOne.set(9, -7);

		System.out.println("ArrayList1: " + arrayOne);
		System.out.println("ArrayList2: " + arrayTwo);

	}

}
