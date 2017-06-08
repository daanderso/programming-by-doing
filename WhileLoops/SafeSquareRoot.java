package WhileLoops;

import java.util.Scanner;
import java.lang.Math;

public class SafeSquareRoot {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		writeLine("SQUARE ROOT!");
		writeLine("Enter A Number to Square");
		double NumberToSquare = input.nextInt(); // Casting integer to double

		while (NumberToSquare < 1) {
			writeLine("You can't take the square root of a negative number, silly.\nTry again:");
			NumberToSquare = input.nextInt();
			
			if (NumberToSquare >= 1) {
				writeLine("The square root of " + NumberToSquare + " is " + Math.sqrt(NumberToSquare));
			}

		}//end while

		input.close();
	
	}// end main

	public static void writeLine(String message) {
		System.out.println(message);
	}

}// end class
