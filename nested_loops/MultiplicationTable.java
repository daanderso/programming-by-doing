package nested_loops;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("x|	1	2	3	4	5	6	7	8	9");
		System.out.println("=============================================================================");
		
		for(int i = 1; i <= 12; i++) {
			 System.out.print(i + "|");
			for (int j = 1; j <=9; j++) {
				//System.out.print(j+1 + "\t");
				int result = i*j;
				System.out.print("\t" +result);
				
				if (j== 9) {
					System.out.println("\n");
				}
				
			}//inner for
		}//outer for

	}

}
