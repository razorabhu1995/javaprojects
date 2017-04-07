package polymorphism;

public class app {

	public static void main(String[] args) {
	Plant plant1 = new Plant();
	tree oak = new tree();
	
	Plant plant2 = plant1;
	plant1.grow();
	plant2.grow();
	
	oak.shedleaves();
	plant2.shedleaves();
	docut(oak);
	}
	
	public static void docut(Plant plant3){
		plant3.grow();
	}

}
