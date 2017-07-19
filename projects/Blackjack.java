package projects;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// int randomNum = r.nextInt(10 - 10 + 1) + 10;

		System.out.println("Welcome to Derek's Blackjack");

		// Players Hand
		int playerCard1 = randomNum();
		int playerCard2 = randomNum();
		int playerCardTotal = playerCard1 + playerCard2;
		System.out.println("You get a " + playerCard1 + " and a " + playerCard2);
		System.out.println("Your total is " + playerCardTotal + "\n");

		// Dealers Hand
		int dealerCard1 = randomNum();
		int dealerCard2 = randomNum();
		int dealerCardTotal = dealerCard1 + dealerCard2;
		System.out.println("The dealer has a " + dealerCard1 + " showing, and a hidden card.");
		System.out.println("His total is hidden too \n");

		// Player select to HIT or STAY
		while (playerCardTotal < 21) {
			System.out.println("Would you like to \"Hit\" or \"Stay\"?");
			String playerInput = input.nextLine();

			// player STAYS
			if (playerInput.equalsIgnoreCase("stay")) {
				System.out.println("Okay, Dealer's turn.");
				System.out.println("Dealers hidden card was a " + dealerCard2);
				System.out.println("Dealer's total is " + dealerCardTotal + "\n");
				break;
			}

			// player HITS
			if (playerInput.equalsIgnoreCase("hit")) {
				int hit = randomNum();
				System.out.println("You drew " + hit);
				playerCardTotal = playerCardTotal + hit;
				System.out.println("Yout total is " + playerCardTotal + "\n");
			}
		} // end player while

		// Dealer HITS on 16 or less
		while (dealerCardTotal <= 16) {
			System.out.println("Dealer chooses to hit...");
			int dealerHit = randomNum();
			System.out.println("Dealer draws " + dealerHit);
			dealerCardTotal = dealerCardTotal + dealerHit;
			System.out.println("Dealer's total is " + dealerCardTotal);
		}

		// Dealer STAY
		if ((dealerCardTotal >= 17) && (dealerCardTotal < 21)) {
			System.out.println("Dealer Stays....\n");
			// System.out.println("Dealer total is " + dealerCardTotal);
			// System.out.println("Player total is " + playerCardTotal);
		}

		// if player total > dealer total Player wins
		if ((playerCardTotal > dealerCardTotal) && (playerCardTotal <= 21)) {
			System.out.println("Dealer total is " + dealerCardTotal);
			System.out.println("Player total is " + playerCardTotal);
			System.out.println("Player wins");
		}

		// if dealer total > player total Dealer wins
		if ((dealerCardTotal > playerCardTotal) && (dealerCardTotal <= 21)) {
			System.out.println("Dealer total is " + dealerCardTotal);
			System.out.println("Player total is " + playerCardTotal);
			System.out.println("Dealer wins");
		}

		// player and dealer have blackjack dealer wins
		if (playerCardTotal == dealerCardTotal) {
			System.out.println("Dealer total is " + dealerCardTotal);
			System.out.println("Player total is " + playerCardTotal);
			System.out.println("Dealer Wins");
		}

		// if player has black jack and dealer is busted
		if (((playerCardTotal == 21) && (dealerCardTotal > 21))) {
			System.out.println("Dealer total is " + dealerCardTotal);
			System.out.println("Player total is " + playerCardTotal);
			System.out.println("Player Wins..dealer busts");
		}

		if (((dealerCardTotal == 21) && (playerCardTotal > 21))) {
			System.out.println("Dealer total is " + dealerCardTotal);
			System.out.println("Player total is " + playerCardTotal);
			System.out.println("Dealer Wins..player busts");
		}

		// Dealer Busts
		if (dealerCardTotal > 21) {
			System.out.println("Dealer has " + dealerCardTotal + ". Player Wins...Dealer BUSTED !!!");
		}
		// Player Busts
		if (playerCardTotal > 21) {
			System.out.println("Player has " + playerCardTotal + ". Dealer Wins...You're BUSTED !!!");
		}

	}// end main

	public static int randomNum() {
		Random r = new Random();
		int randomGen = 0;
		for (int count = 2; count <= 11; count++) {
			// generate random number from 2 - 11
			randomGen = 2 + r.nextInt((11 - 2) + 1);
		}
		return randomGen;
	}

}// end class
