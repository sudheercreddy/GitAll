package Assigmenet;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");
		
		System.out.println(studentNames.subList(0, 4));
		System.out.println(studentNames);
		
//		for(int i =studentNames.size()-1;i >=0 ; i --) {
//			System.out.println(studentNames.get(i));
//		}
//		Collections.reverse(studentNames);
//		
//		Collections.shuffle(studentNames);
//		Collections.sort(studentNames);
//		System.out.println(studentNames);

	}

}
