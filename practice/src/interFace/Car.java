package interFace;

public class Car implements Info{
	
	@Override
	public void run() {
		System.out.println("car started running");
	}
	
	@Override
	public void stop() {
		System.out.println("car stopped");
		
	}

}
