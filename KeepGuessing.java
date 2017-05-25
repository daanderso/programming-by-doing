import java.util.Scanner;
import java.util.Random;


public class KeepGuessing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("I'm thinking of a number from 1-10");
		int guess = input.nextInt();
		
		int secretNumber = 1 + r.nextInt(10);
		
		while (guess != secretNumber){
			System.out.println(" Try again, I'm thinking of a number from 1-10");
			guess = input.nextInt();
		}
			System.out.println("You got it, the secret number is " + secretNumber);
		
		
		
	}

}
