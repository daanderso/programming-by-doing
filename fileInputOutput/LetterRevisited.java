package fileInputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LetterRevisited {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("LetterToMyself.txt"));
		pw.println("+------------------------------------------------------------------------+");	
		pw.println("|                                                                  ####  |");		
		pw.println("|                                                                  ####  |");
		pw.println("|                                                                  ####  |");		
		pw.println("|                                                                  ####  |");
		pw.println("|                                                                        |");
		pw.println("|                                 John Doe                               |");
		pw.println("|                                 123 Java Dr.                           |");
		pw.println("|                                 Columbus, OH 43035                     |");
		pw.println("|                                                                        |");
		pw.println("+------------------------------------------------------------------------+");
		pw.close();
	}

}
