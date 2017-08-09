package nested_loops;

public class GettingIndividualDigits {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {

			for (int j = 0; j <= 9; j++) {
				int result = i + j;
				System.out.println((10*i+j)+", "+  i + " + " + j + " = " + result);
			} // for 1

		} // for 2

	}
}
