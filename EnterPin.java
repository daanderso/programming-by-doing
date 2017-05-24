import java.util.Scanner;

public class EnterPin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pin = 1234;
		
		System.out.println("Welcome to Anderson Bank");
		System.out.println("Enter your pin number");
		int pinEntry = input.nextInt();
		
		while ( pin != pinEntry){
			
			System.out.println("Incorrect pin, please try again");	
			pinEntry = input.nextInt();
		}
		
		//System.out.println("Welcome to Anderson Bank");	
		if( pin == pinEntry){
		System.out.println("Welcome to Anderson Bank");			
		
		}
	}

}
