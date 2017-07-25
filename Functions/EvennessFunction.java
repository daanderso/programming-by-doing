package Functions;

public class EvennessFunction {

	public static void main(String[] args) {

		for( int i = 0; i<=20; i++) {
			
			if ((isEven(i) == true) && (isDivisibleBy3(i) == true)) {
				System.out.println( i + " <");
				System.out.println( i + " =");
				
			}else if ( isEven(i) == true) {
			
				System.out.println(i + " <");
			
			}else if ( isDivisibleBy3(i) == true) {
				
				System.out.println( i + " =");
			}
			else {
				System.out.println(i);
			}
			
		}
		
		
		
	}

	public static boolean isEven(int n) {
		
		boolean result;
		
		if (n % 2 == 0) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
	public static boolean isDivisibleBy3(int n) {
		 boolean result;
		 
		 if (n % 3 == 0) {
			 
			 result = true;
		 }else {
			 result = false;
		 }
		
		
		return result;
	}
	
	 
}
