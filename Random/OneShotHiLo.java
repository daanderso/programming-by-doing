package Random;

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner input = new Scanner(System.in);

		int numToGuess = 1 + r.nextInt(100);

		writeLine("I'm thinking of a number between 1-100. Try to guess it.");
		int guessInput = input.nextInt();

		if (guessInput > numToGuess) {
			writeLine("Sorry, You are too high, I was thinking of " + numToGuess);
		} else if (guessInput < numToGuess) {
			writeLine("Sorry, You are too low, I was thinking of " + numToGuess);
		} else if (guessInput == numToGuess) {
			writeLine("You guessed it, what are the odds " + numToGuess);
		}
		
		input.close();

	}// end main

	public static void writeLine(String message) {
		System.out.println(message);
	}

}// end class
