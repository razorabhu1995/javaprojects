package upcastingDowncasting;
class Machine{
	public void start(){
		System.out.println("Machine started");
	}
}
class Camera extends Machine{

	@Override
	public void start() {
		System.out.println("camera started");
	}
	
	public void snap(){
		System.out.println("photo taken");
	}
	
}

public class App {

	public static void main(String[] args) {
		Machine abhishek = new Machine();
		abhishek.start();
		
		Camera camera1 = new Camera();
		camera1.start();
		camera1.snap();
		
		//upcasting
		
		Machine machine2=camera1;
		machine2.start();
		//error: machine2.snap();
		
		//downcasting
		Machine machine3 = camera1;
		Camera camera2 = (Camera)machine3;
		camera2.snap();
		
		//doesnt work -- run time error
		Machine machine4 = new Machine();
		Camera camera3 = (Camera)machine4;
		camera3.start();
		camera3.snap();
	}

}
