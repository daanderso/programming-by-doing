package Functions;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Shape Area Calculator");

		boolean loop = true;

		while (loop != false) {
			System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-\n");
			System.out.println("1.) Triange");
			System.out.println("2.) Rectangle");
			System.out.println("3.) Square");
			System.out.println("4.) Circle");
			System.out.println("5.) Quit");
			System.out.print("Which shape:");

			String userResponse = input.next();

			if (userResponse.equals("1")) {

				System.out.print("Base: ");
				int base = input.nextInt();
				System.out.print("Height: ");
				int height = input.nextInt();
				System.out.print("\n");
				double result = area_triangle(base, height);

				System.out.println("The area is " + result);
			} else if (userResponse.equals("2")) {
				System.out.print("Length: ");
				int length = input.nextInt();
				System.out.print("Width: ");
				int width = input.nextInt();
				System.out.print("\n");
				int result = area_rectangle(length, width);

				System.out.println("The area is " + result);

			} else if (userResponse.equals("3")) {
				System.out.print("Side: ");
				int side = input.nextInt();
				System.out.print("\n");
				int result = area_square(side);

				System.out.println("The area is " + result);
			} else if (userResponse.equals("4")) {
				System.out.print("Radius: ");
				int radius = input.nextInt();
				System.out.print("\n");
				double result = area_circle(radius);

				System.out.println("The area is " + result);
			} else if (userResponse.equals("5")) {
				System.out.println("You have quit the area calculator app...");
				loop = false;
			}

		}
		input.close();
	}

	public static int area_rectangle(int length, int width) {

		int area = length * width;

		return area;
	}// end rectangle function

	public static double area_circle(int radius) {

		double area = Math.PI * radius;

		return area;
	}// end circle function

	public static int area_square(int side) {

		int area = side * side;

		return area;
	}// end square function

	public static double area_triangle(int base, int height) {

		double area = 0.5 * (base * height);

		return area;
	}// end triangle function

}
