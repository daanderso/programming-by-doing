package Functions;

public class FindingPrimeNumbers {

	public static void main(String[] args) {
		
		for (int i = 2; i<= 20; i++) {
			
			if (isPrime(i) == true) {
				System.out.println(i + "<");
			}
			else {
				System.out.println(i);
			}
			
		}
		
	}

	public static boolean isPrime(int n) {
		boolean result = true;
		for(int i = 2; i < n; i++) {
	        if ((n % i) == 0 ){
	            result = false;
	           break;
	        }
	        else {
	        	result = true;
	        }
	           
	    }
		
		return result;
		
	}//end prime function
}//end class
