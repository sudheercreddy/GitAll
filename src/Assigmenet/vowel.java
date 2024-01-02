 package Assigmenet;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// vowels = =   'a', 'e', 'i', 'o', 'u'
		
		String alphabet= "ch";
		
		
		switch(alphabet.toLowerCase().trim()) {
		case "a" :
			System.out.println(alphabet + ": Belongs to the vowel and its 'a'");
			break;
		case "e" :
			System.out.println(alphabet + " Belongs to the vowel and its 'e'");
			break;
		case "i" :
			System.out.println(alphabet + " Belongs to the vowel and its 'i'");
			break;
		case "o" :
			System.out.println(alphabet + " Belongs to the vowel and its 'o'");
			break;
		case "u" :
			System.out.println(alphabet + " Belongs to the vowel and its 'u'");
			break;
		default:
			System.out.println(alphabet+ " : it a consent alphabet");
		}

	}

}
