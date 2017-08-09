package arrays;

import java.util.Random;

public class FindingTheLargestValue {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		int greatestNumber=0;
		
		initiateRandomArray(array);
		System.out.println("\n");
		
		for(int i = 0; i <= array.length - 1; i++){
			
			if (greatestNumber < array[i]){
				greatestNumber = array[i];	
			}
			
		}
		
		System.out.println("The greatest number is " + greatestNumber);
	}

	// populates an array with random numbers
	public static void initiateRandomArray(int array[]) {
		Random r = new Random();
		System.out.print("Array: ");
		for (int i = 0; i <= array.length - 1; i++) {
			int x = r.nextInt((100 - 1) + 1) + 1;
			array[i] = x;
			System.out.print(array[i] + " ");
		}
	}
}
