package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) throws IOException {
	
		File file = new File("house.txt");
		
		try {
			Scanner fr = new Scanner(file);
			while(fr.hasNextLine()){
			String x = fr.nextLine();
			System.out.println(x);
			}
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found: "+ file.toString());
		} 
		
	
			
	}

}
