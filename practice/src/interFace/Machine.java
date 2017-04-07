package interFace;

public class Machine implements Info{

	@Override
	public void run() {
		System.out.println("Machine started running");
	}

	@Override
	public void stop() {
		System.out.println("Machine stop");
		
	}

}
