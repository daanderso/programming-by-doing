import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random();
		
		int die1 = 1 + r.nextInt(6);
		int die2 = 1 + r.nextInt(6);
		int diceTotal = die1 + die2;
		
		System.out.println("Here Come The Dice");
		System.out.println("Roll #1: " + die1);
		System.out.println("Roll #2: " + die2);
		System.out.println("The total is " + diceTotal + "!");
		
		

	}

}
