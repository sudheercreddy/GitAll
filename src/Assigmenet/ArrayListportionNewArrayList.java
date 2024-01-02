package Assigmenet;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListportionNewArrayList {

	public static void main(String[] args) {
		ArrayList<Object> colors = new ArrayList<Object>();
		colors.add("Yellow");//0
		colors.add("RED");//1
		colors.add("GREEN");//2
		colors.add("WHITE");
		colors.add("PINK");
		System.out.println(colors);
		
		ArrayList<Object>portion = new ArrayList<Object>(colors.subList(0, 4));
		Collections.shuffle(portion);
		System.out.println(portion);
		Collections.reverse(portion);
		System.out.println(portion);
		//System.out.println(portion);
		//System.out.println(portion.size());

	}

}
