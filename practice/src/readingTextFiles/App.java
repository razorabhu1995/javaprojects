package readingTextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = new String("house.txt");
		
		File textFile = new File(fileName);
		
		Scanner reader = new Scanner(textFile);
	
		
		while(reader.hasNextLine()){
			String read = reader.nextLine();
			System.out.println(read);
		}
		
		reader.close();
		

	}

}
