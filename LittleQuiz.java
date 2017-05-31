import java.util.Scanner;

public class LittleQuiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Are you ready for a quiz? (Y/N)");
		String startQuiz = input.next();
		int quizTotal;
		int answerTotal = 0;

		String response = startQuiz.toLowerCase();

		if (response.equals("y")) {
			// play the game
			System.out.println("OK here it comes.\n");
			// Question 1
			System.out.println("Q1.)  What is the capital of Alaska?\n");
			System.out.println("\t 1. Melbourne");
			System.out.println("\t 2. Anchorage");
			System.out.println("\t 3. Juneau");
			String questionOneInput = input.next();

			if (questionOneInput.equals("3")) {
				System.out.println("That is correct!!!\n");
				answerTotal = answerTotal + 1;
			}else{
				System.out.println("Your Answer was incorrect. The answer is 3. Juneau\n");
			}
			
			//question 2
			System.out.println("Q2.)  What is the capital of Pennslyvania?\n");
			System.out.println("\t 1. Philadelphia");
			System.out.println("\t 2. Harrisburg");
			System.out.println("\t 3. Pittsburgh");
			String questionTwoInput = input.next();

			if (questionTwoInput.equals("2")) {
				System.out.println("That is correct!!!\n");
				answerTotal = answerTotal+1;
			}else{
				System.out.println("Your Answer was incorrect. The answer is 2. Harrisburg\n");
			}
			
			//question 3
			System.out.println("Q3.)  What is the capital of Vermont?\n");
			System.out.println("\t 1. Columbus");
			System.out.println("\t 2. Burlington");
			System.out.println("\t 3. Montpelier");
			String questionThreeInput = input.next();

			if (questionThreeInput.equals("3")) {
				System.out.println("That is correct!!!\n");
				answerTotal = answerTotal+1;
			}else{
				System.out.println("Your Answer was incorrect. The answer is 3. Montpelier\n");
			}
			
			
			System.out.println("Overall you got " + answerTotal + " of 3 correct");
			
			
		}else if (response.equals("n")){
			System.out.println("You have selected to exit the game.");
			System.exit(0);
		}
				

	}

}
