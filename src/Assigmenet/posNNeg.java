package Assigmenet;

import java.util.Scanner;

public class posNNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value= sc.nextInt();
		
		if(value>0) {
			System.out.println(value +" : value is positive");
		}else {
			System.out.println(value + " : value is Negative");
		}
	}
		
}
