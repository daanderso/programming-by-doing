package arrays;

public class BasicArraysOne {

	public static void main(String[] args) {

int[] number = new int[10];
		
		number[0]= -131;
		number[1]= -131;
		number[2]= -131;
		number[3]= -131;
		number[4]= -131;
		number[5]= -131;
		number[6]= -131;
		number[7]= -131;
		number[8]= -131;
		number[9]= -131;
		
		for(int index=0; index <= (number.length -1 ); index++){
			System.out.println("Slot " + index + " contains " + number[index]);
		}
		
		
	}

}
