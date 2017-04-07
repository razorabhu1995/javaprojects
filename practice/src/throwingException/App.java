package throwingException;

import java.io.IOException;

public class App {
	public static void main(String args[]){
		Machine machine1= new Machine();
		try {
			machine1.start();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			System.out.println("RUn success");
		}
	}

}
