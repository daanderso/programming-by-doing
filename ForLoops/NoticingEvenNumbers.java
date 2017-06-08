package ForLoops;

import java.util.Scanner;

public class NoticingEvenNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//int counter = 1;
		
		for (int counter = 1; counter <=20; counter++){
			
			if (counter % 2 == 0){
				
				System.out.println(counter + "<");
			}else{
				
				System.out.println(counter);
			}
		
		
		}//end for	
		
	}//end main

}//end class
