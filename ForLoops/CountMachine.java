package ForLoops;
import java.util.Scanner;

public class CountMachine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Count to: ");
		int number = input.nextInt();
		int counter;
		
		
		for (counter = 0 ; counter <= number; counter++){
			System.out.print(counter + " ");
		}
		
		
	}//end main method

}//end class
