package generics;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "abhishek");
		map.put(2, "tamrakar");
		map.put(3, "hades");
		for(int i =1;i<=3;i++){
		System.out.println(map.get(i));
		}
		System.out.println(map.containsKey(0));
		if(map.containsKey(5)==true){
			System.out.println("the element is in hashmap");
		}
		else{
			System.out.println("not in hasmap");
		}
		
		System.gc();
		
	}
	protected void finalize(){
		
	}

}
