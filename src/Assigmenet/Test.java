package Assigmenet;

import java.util.ArrayList;

public class Test {
	
	
	
	
	public int sum(int a , int b) {

		int c = a;
		int d = b;
		
		System.out.println(c);
		System.out.println(d);
		int e = c+d;
		return e;
	}
	public static ArrayList<Object> sumofArray(){
		ArrayList<Object> lst = new ArrayList<Object>();
		lst.add("Sudheer");
		lst.add("Sunil");
		lst.add("Myra");
		lst.add("Bindu");
		
		return lst;
		
		
	}
	public static void main(String[] args) {
		Test t1 = new Test();
		int sumof= t1.sum(5, 88);
		System.out.println(sumof);
		
		ArrayList<Object>eee= t1.sumofArray();
		System.out.println(eee);
		ArrayList<Object> eee2 = new ArrayList<Object>();
		eee2.add("First");
		
		System.out.println(eee2);
		eee2.addAll(eee);
		System.out.println(eee2);

		
	}

}
