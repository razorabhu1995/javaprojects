package arraylistSwifting;

import java.util.ArrayList;
import java.util.Scanner;

public class Swifting {
	ArrayList<String> li = new ArrayList<String>();
	Scanner reader = new Scanner(System.in);
	
	int n = reader.nextInt();
	
	public void entry(){

		System.out.println("enter the array list:");
		for(int i=0;i<n;i++){
			li.add(reader.next());
			
		}
	}
	public String getTop(){
		return li.get(0);
	}
	
	public void topRemove(){
		li.remove(0);
	}
	public void displayArray(){
		for(String x : li){
			
			System.out.println(x);
		}
	}
	
}
