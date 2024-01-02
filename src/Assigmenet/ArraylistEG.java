package Assigmenet;

import java.util.ArrayList;

public class ArraylistEG {

	public static void main(String[] args) {
		ArrayList<Integer> rollnumbers = new ArrayList<>();
		ArrayList<Integer> rollnumbers1 = new ArrayList<>();
		rollnumbers1.add(12);
		rollnumbers.add(12);
		rollnumbers.add(1, 22);
		rollnumbers.add(1, 33);
		System.out.println(rollnumbers.size());
		rollnumbers.add(3, 44);
		System.out.println(rollnumbers);
		
		
		for(int i = 0 ; i <= rollnumbers.size()-1 ;  i++) {
			System.out.println(rollnumbers.get(i));
		}
	for(int i : rollnumbers) {
		System.out.println(i);
	}

	}

}
