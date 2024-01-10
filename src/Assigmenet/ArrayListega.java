package Assigmenet;

import java.util.ArrayList;

public class ArrayListega {

	public static ArrayList<Object> list(ArrayList<Object> a1) {
		ArrayList<Object> aaa = new ArrayList<Object>();
		aaa.addAll(a1);

		return aaa;

	}

	public static void main(String[] args) {

		ArrayList<Object> second = new ArrayList<Object>();
		second.add("Hello");
		second.add("How");
		second.add("Are");
		second.add("you");
		
		ArrayList<Object> ccc= list(second);
		System.out.println(ccc);
		ccc.addAll(second);

	}
}
