package ForLoops;

import java.util.Scanner;

public class Refresher {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String response = input.next();

		if (response.equals("Mitchell")) {
			for (int i = 1; i <= 5; i++) {

				System.out.println(i + ".) " + response);
			}
		} else {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + ".) " + response);
			}

		}
		input.close();
	}
}
