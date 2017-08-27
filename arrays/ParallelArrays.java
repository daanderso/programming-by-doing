package arrays;

import java.util.Scanner;

public class ParallelArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean registeredStudent = false;

		String[] lastnames = { "Anderson", "Martin", "Williams", "Scott", "Bowles" };
		double[] gpa = { 99.9, 89.5, 79.6, 69.9, 85.5 };
		int[] id = { 123, 456, 789, 101, 121 };

		int arraySize = lastnames.length;

		System.out.println("Values: ");
		for (int i = 0; i < arraySize; i++) {
			System.out.println("\t" + lastnames[i] + " " + gpa[i] + " " + id[i]);
		} // end for

		System.out.println("");
		System.out.print("Enter a student id to lookup: ");
		int studentId = input.nextInt();

		for (int i = 0; i < arraySize; i++) {

			if (studentId == id[i]) {
				registeredStudent = true;
				System.out.println("");
				System.out.println("Found in slot " + i);
				System.out.println("\t" + "Name: " + lastnames[i]);
				System.out.println("\t" + "Average: " + gpa[i]);
				System.out.println("\t" + "ID: " + id[i]);
			}

		}
		
		if (registeredStudent == false){
			System.out.println("");
			System.out.println(studentId + " is not a valid student id");
		}
		input.close();
	}
}
