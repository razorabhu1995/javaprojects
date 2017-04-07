package sum;

public class SumC {
	private int a;
	private int b;
	private int c;
	SumC(){
		a=2;
		b=3;
		c=a+b;
		System.out.println("the sum is: "+c);
	}
	SumC(int a, int b){
		c=a+b;
		System.out.println("the sum is: "+c);
	}
}
