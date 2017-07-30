package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileInput {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("name.txt"));
        
		String line;
        
        System.out.println("Your name is :");
       
        while((line = br.readLine())!= null)
        {
            System.out.println(line);
        }
        br.close();
		
	
	}

}
