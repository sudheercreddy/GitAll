package Assigmenet;

public class vowels {

	public static void main(String[] args) {
		//97-122;
		
		//Print only vowels (aeiou) using for and while loop.
		//Start the loop from ‘a‘ to ‘z‘
		
		for(char i = 97 ; i <=122 ; i ++) {
			char j =i;
			switch (j) {
			case 'a': {
				System.out.println(j);
				break;
			}
			case 'e': {
				System.out.println(j);
				break;
			}
			case 'i': {
				System.out.println(j);
				break;
			}
			case 'o': {
				System.out.println(j);
				break;
			}
			case 'u': {
				System.out.println(j);
				break;
			}
			default:
				break;
				
			}
		}

	}

}
