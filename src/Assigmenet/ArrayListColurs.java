package Assigmenet;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListColurs {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>(Arrays.asList("RED", "BLUE", "GREEN", "YELLOW", "ORANGE"));
		colors.add("pink".toUpperCase());
		colors.add("white".toUpperCase());
		System.out.println(colors);
		
		System.out.println(colors.get(1));
		System.out.println("**FOR***");
		for (int i = 0; i <= colors.size() - 1; i++) {
			System.out.println(i + 1 + " " + colors.get(i));
		}
		System.out.println("**WHILE***");
		int j = 0;
		while (j <= colors.size() - 1) {
			System.out.println(colors.get(j));
			j++;
		}
		System.out.println("**DO WHILE***");
		int k = 0;
		do {

			System.out.println(colors.get(k));
			k++;
		} while (k <= colors.size() - 1);
	}
}
