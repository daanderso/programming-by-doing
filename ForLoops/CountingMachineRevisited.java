package ForLoops;
import java.util.Scanner;

public class CountingMachineRevisited {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter;
		
		//Count from a number. Start counter from here
		System.out.print("Count from: ");
		int initialize = input.nextInt();
		
		//Count to a number. Set the iteration
		System.out.print("Count to: ");
		int counterLimit = input.nextInt();
		
		//count by
		System.out.print("Count by: ");
		int increment = input.nextInt();
		
		
		for(counter = initialize; counter <= counterLimit; counter = counter + increment){
			System.out.print(counter + " ");
		}
	input.close();
	}

}
