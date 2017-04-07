package FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String args[]){
		File file = new File("house.txt");
		BufferedReader br=null;
		try {
			FileReader fr = new FileReader(file);
			
			br = new BufferedReader(fr);
			String text;
			while((text = br.readLine())!=null){
				System.out.println(text);
			};
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found"+file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File cannot be read"+file.toString());
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("file never closed"+file.toString());
			} catch(NullPointerException ex){
				//file may not be open
			}
		}
		
		
	}
}
