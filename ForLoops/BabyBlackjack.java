package ForLoops;

import java.util.Scanner;
import java.util.Random;

public class BabyBlackjack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		//Player cards
		int card1 = 1 + r.nextInt(10);
		int card2 = 1 + r.nextInt(10);
		int playerTotal = card1 + card2;
		
		System.out.println("You drew a " + card1 + " and a " + card2);
		System.out.println("Your total is " + playerTotal + "\n");
		
		//dealer cards
		int dealerCard1 = 1 + r.nextInt(10);
		int dealerCard2 = 1 + r.nextInt(10);
		int dealerTotal = dealerCard1 + dealerCard2;
		
		System.out.println("The dealer drew a " + dealerCard1 + " and a " + dealerCard2);
		System.out.println("The dealer's total is " + dealerTotal + "\n");
		
		if ((playerTotal <= 21) && (playerTotal > dealerTotal)){
			System.out.println("You Win !!!");
		}else if ((dealerTotal <= 21) && (dealerTotal > playerTotal)) {
			System.out.println("Dealer Wins !!!");
		}else if (dealerTotal == playerTotal) {
			System.out.println("House Wins !!!");
		}
		
		
	}

}
