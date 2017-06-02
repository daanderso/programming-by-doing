package arraylist;
import java.util.List;
import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		
		//adding -113  10x into arraylist 
		for(int counter = 1; counter <=10; counter++){
			numbers.add(-113);
		}
		System.out.println(numbers);
		
		//for loop using to get element from the array list
		
		for (int counter = 0; counter <= numbers.size()-1; counter++){
			System.out.println("Slot " + counter + " contains a "+ numbers.get(counter));
		}		
		
		
	}

}
