package Assigmenet;

import java.util.Scanner;

public class IfAssignmenets {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the value of A");
		int a= sc.nextInt();
		System.out.println("enter the value of B");
		int b= sc.nextInt();
		System.out.println("enter the value of C");
		int c= sc.nextInt();
		System.out.println("enter the value of C");
		int d= sc.nextInt();
		
		if(a>b && a>c && a>d) {
			System.out.println(a + " 'a' is greatest");
		}else if(b>c && b>d) {
			System.out.println(b + " 'b' is greatest" );
		}else if(c>d) {
			System.out.println(c+ " 'c' is greatest");
		}else {
			System.out.println(d+ " 'D' is greatest");
		}
	}

}
