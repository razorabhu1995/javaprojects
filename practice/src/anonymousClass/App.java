package anonymousClass;
class Deck{
	int i=1;
	public void cards(){
		do{
		System.out.print(i+",");
		i=i+1;
		}while(i<=52);
	}
}

public class App {

	public static void main(String[] args) {
		Deck deck1 = new Deck(){

			@Override
			public void cards() {
				// TODO Auto-generated method stub
				System.out.println("there are 52 cards");
			}
			
		};
		deck1.cards();

	}

}
