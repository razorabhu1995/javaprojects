package arraylistSwifting;
public class Swift {
	
	public static void main(String[] args) {
		Swifting my_top = new Swifting();
		my_top.entry();
		my_top.topRemove();
		System.out.println();
		my_top.displayArray();
		System.gc();
	}
	protected void finalize(){
		
	}
}

