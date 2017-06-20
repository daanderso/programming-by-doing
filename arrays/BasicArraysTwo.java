package arrays;

public class BasicArraysTwo {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		 
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=25;
		numbers[3]=42;
		numbers[4]=56;
		numbers[5]=77;
		numbers[6]=26;
		numbers[7]=99;
		numbers[8]=52;
		numbers[9]=87;
		
		for(int index=0; index <= (numbers.length -1); index++){
			System.out.println("Slot " + index + " contains " + numbers[index]);
		}
		

	}

}
