package interFace;

import java.util.Scanner;

public class Mecha {
	public static Info getInfo(String ch){
		if(ch.equalsIgnoreCase("machine")){
			return new Machine();
		}
		else if(ch.equalsIgnoreCase("car")){
			return new Car();
		}
		return null;
		
		
	}

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String s = read.nextLine();
		Info i = getInfo(s);
		i.run();
		i.stop();
		read.close();
	}

}
