import java.util.Scanner;

public class WorstNumberGuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int guess = 4;

		System.out.println("The Worst Guessing Game Ever !!!");
		System.out.println("Try to guess a number between 1 -10");
		int userinput = input.nextInt();

		if (userinput == guess) {
			System.out.println("You guessed CORRECTLY, The answer is 4");
		}else{
			System.out.println("Ur wrong, Thanks for playing!!!");
		}

	}

}
