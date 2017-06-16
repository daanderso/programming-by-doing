package Random;

import java.util.Random;
import java.util.Scanner;


public class ThreeCardMonte {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		//a random number from 1-3
		int ace = 1 + r.nextInt(3);
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.\n");
		System.out.println("Which one is the ace?\n");
		
		System.out.println("\t##  ##  ##");
		System.out.println("\t##  ##  ##");
		System.out.println("\t 1   2   3");
		
		System.out.print("> ");
		int guessInput = input.nextInt();
		
		//if the winner guesses the ace correctly
		if(guessInput == 1 && ace == 1 ){
			System.out.println("You nailed it\n");
			System.out.println("\tAA  ##  ##");
			System.out.println("\tAA  ##  ##");
			System.out.println("\t 1   2   3");			
		}else if(guessInput == 2 && ace == 2 ){
			System.out.println("You nailed it\n");
			System.out.println("\t##  AA  ##");
			System.out.println("\t##  AA  ##");
			System.out.println("\t 1   2   3");			
		}else if(guessInput == 3 && ace == 3 ){
			System.out.println("You nailed it\n");
			System.out.println("\t##  ##  AA");
			System.out.println("\t##  ##  AA");
			System.out.println("\t 1   2   3");			
		}
		
		//guessInput is 2 and incorrect
		if (guessInput == 2 && ace == 1){
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + ace);
			System.out.println("\tAA  ##  ##");
			System.out.println("\tAA  ##  ##");
			System.out.println("\t 1   2   3");
		}else if(guessInput == 2 && ace == 3 ){
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + ace);
			System.out.println("\t##  ##  AA");
			System.out.println("\t##  ##  AA");
			System.out.println("\t 1   2   3");		
		}
		
		//guessInput  is 3 and incorrect	
		if (guessInput == 3 && ace == 1){
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + ace);
			System.out.println("\tAA  ##  ##");
			System.out.println("\tAA  ##  ##");
			System.out.println("\t 1   2   3");
		}else if(guessInput == 3 && ace == 2 ){
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + ace);
			System.out.println("\t##  AA  ##");
			System.out.println("\t##  AA  ##");
			System.out.println("\t 1   2   3");		
		}

		input.close();

	}//end main

}
