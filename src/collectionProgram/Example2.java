package collectionProgram;

import java.util.List;
import java.util.ArrayList;

public class Example2 {
	
	static void display() {
		//List list=new List();
		List  <String> list= new ArrayList<String>();
		list.add( "O");
		list.add("M");
		list.add( "3");
		System.out.println(list.get(2));
		
		for(int index=0; index<list.size(); index++) {
			
			System.out.print(list.get(index ));
		}
		
		
	}

	public static void main(String[] args) {
		display();

	}

}
