package arrays;
import java.util.Random;

public class BasicArraysThree {

	public static void main(String[] args) {
		
		Random r = new Random();
		//int x = 10 + r.nextInt(99);
		
		int[] randomNums = new int[1000];
		
		for(int index=0; index <= 999; index++){
			int x = r.nextInt(99 - 10 + 1) + 10;
			randomNums[index]= x;
			System.out.println(randomNums[index] + "  ");
		}

	}

}
