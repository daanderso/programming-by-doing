package nested_loops;

public class NumberPuzzleOne {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 60 ; i++ ) {
			
			for (int j = 0; j<=60 ; j++) {
				
				if ((i + j == 60) && (( i-j == 14)||(j-i ==14))) {
					System.out.println (i + ", " + j);
				}
				
			}//for 1
		}//for 2
	}

}
