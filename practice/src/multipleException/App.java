package multipleException;

public class App {
	public static void main(String args[]){
	Multi multi1 = new Multi();
	/*try {
		multi1.run();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}*/
	/*try {
		multi1.run();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}*/
	
	/*try {
		multi1.run();
	} catch (IOException | ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	try {
		multi1.run();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
	
	
	}

}
