import java.util.Random;

public class DiceDoubles {

	public static void main(String[] args) {
		Random r = new Random();

		int die1 = 1 + r.nextInt(6);
		int die2 = 1 + r.nextInt(6);
		int diceTotal = die1 + die2;
		System.out.println("Here Come The Dice !!!\n");

		if (die1 == die2){
			System.out.println("Roll #1: " + die1);
			System.out.println("Roll #2: " + die2);
			System.out.println("The total is " + diceTotal + "!\n");
		}
		
		while (die1 != die2) {

			 die1 = 1 + r.nextInt(6);
			 die2 = 1 + r.nextInt(6);
			 diceTotal = die1 + die2;

			System.out.println("Roll #1: " + die1);
			System.out.println("Roll #2: " + die2);
			System.out.println("The total is " + diceTotal + "!\n");
		}

	}

}
