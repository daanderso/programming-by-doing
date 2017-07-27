package ForLoops;

import java.util.Scanner;

public class DisplayingMultiples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Choose a number:");
		int userInput = input.nextInt();
		System.out.println("");

		for (int i = 1; i <= 12; i++) {
			int result = userInput * i;
			System.out.println(userInput + "x" + i + "=" + result);
		}
		input.close();
	}

}
