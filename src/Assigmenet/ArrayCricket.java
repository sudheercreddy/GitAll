package Assigmenet;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCricket {

	public static void main(String[] args) {
		// name, age, team name, DOB, gender, Strike Rate
		ArrayList<Object> player1 = new ArrayList<>();
		player1.add("Sudheer");
		player1.add(35);
		player1.add("Kansas");
		player1.add("02/08/1988");
		player1.add("Male");
		player1.add(45.99);
		System.out.println(player1);

		ArrayList<Object> player2 = new ArrayList<Object>(Arrays.asList("Myra",2,"Olathe","06/15/2021","Female"));
		System.out.println(player2);
		
		player2.addAll(player1);
		System.out.println(player2);
		
	}

}
