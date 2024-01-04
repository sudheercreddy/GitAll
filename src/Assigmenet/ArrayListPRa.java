package Assigmenet;

import java.util.ArrayList;

public class ArrayListPRa {

	public static void main(String[] args) {
		ArrayList<Object> lista= new ArrayList<Object>();
		lista.add("Hello");
		lista.add("How");
		lista.add("Are");
		lista.add("You");
		
		System.out.println(lista);
		
		for(Object wL:lista ) {
			System.out.println(wL);
		}

	}

}
