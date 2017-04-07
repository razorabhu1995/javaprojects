package throwingException;

import java.io.IOException;

public class Machine  {
	
	public void start() throws IOException  {
		int test = 0;
		
		if(test!=0){
			throw new IOException("file is not found!!!!");
		}
		System.out.println("machine run successfull");
	}
	

}
