package Assigmenet;

import java.util.Scanner;

public class oddNEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value= sc.nextInt();
		
		if(value % 2 == 0) {
			System.out.println(value + " is a Even");
		}else {
			System.out.println(value + " is a odd");
		}
	}

}
