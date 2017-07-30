package fileInputOutput;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HighScore {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("HighScore.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		System.out.println("Please enter your score");
		String scoreInput = input.next();
		System.out.println("Enter your name");
		String nameInput = input.next();
		
		pw.println(scoreInput);
		pw.println(nameInput);
		
		System.out.println("Data stored in high HighScore.txt");
		pw.close();
		input.close();
	}
}
