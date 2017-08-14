package arraylist2;

import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> arrayOne = new ArrayList<Integer>();
		ArrayList<Integer> arrayTwo = new ArrayList<Integer>();
		Random r = new Random();
		
		for (int i = 0; i < 10; i++){
		
			int x = r.nextInt((100 - 1) + 1) + 1;
			arrayOne.add(x);
		}
		
		for(Integer x : arrayOne){
			arrayTwo.add(x);
		}
		
		arrayOne.set(9, -7);
		System.out.println("ArrayList 1: " + arrayOne);
		System.out.println("ArrayList 2: " + arrayTwo);
		
	}

}
