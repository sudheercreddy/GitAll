package Assigmenet;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListupdateelement {

	public static void main(String[] args) {
		ArrayList<Object> states = new ArrayList<Object>(Arrays.asList("MA", "IA", "NE", "IL", "KS"));
		for(Object aa :states) {
			System.out.println(aa);
		}
		System.out.println("AFTER*****");
		states.set(0, "NH");
		states.add(1, "MA");
		//states.remove(2);
		for(Object aa :states) {
			if(aa.equals("KS")) {
				System.out.println("Found Myra");
			}
			
			
		}
		
	}

}
