package nested_loops;

public class BasicNestedLoops {

	public static void main(String[] args) {
		for (int i = 0; i <=5 ; i++) {
			for ( int j = 0; j <= 5; j++) { 
				System.out.print("("+ i + "," + j + ")");
				if (j == 5) {
					System.out.print("\n");
				}
			}//inner for
		}//outer for
	}

}
