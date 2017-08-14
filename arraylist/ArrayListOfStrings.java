package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListOfStrings {

	public static void main(String[] args) {

		String sentence = "Ask not what your country can do for you but";
		String sentence2 = sentence.toLowerCase();
		String[] strValues = sentence2.split(" ");
		ArrayList<String> sentenceArray = new ArrayList<String>(Arrays.asList(strValues));
		
		Collections.sort(sentenceArray);
		System.out.println(sentenceArray);
		
		

	}

}
