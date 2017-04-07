package cube;

public class CubeC {
	private int l;
	private int b;
	private int h;
	CubeC(){
		l=1;
		b=1;
		h=1;
		System.out.println("the volume of cube is: " + l*b*h);
	}
	CubeC(int l , int b , int h){
		System.out.println("the volume of cube is: " + l*b*h);
	}

}
