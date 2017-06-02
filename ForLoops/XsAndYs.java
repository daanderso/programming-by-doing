package ForLoops;

public class XsAndYs {

	public static void main(String[] args) {
		double counter;
		double y;
		
		System.out.println("  x      y");
		System.out.println("-----  -----");
		
		for (counter = -10; counter <= 10; counter = counter + 0.5) {	
			y=counter*counter;
			System.out.println(counter + "  " + y);
		
			
		}
		
	}

}
