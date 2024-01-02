package Assigmenet;

import java.util.Scanner;

public class Environmentpg {

	public static void main(String[] args) {
		//WAP to run your test cases in a specific environment like
		//: QA, Stage, Dev, UAT, Prod using using Switch - Case
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Environment you want to perform testing");
		String inputEnv= sc.next();
		
		String environment=inputEnv;
		
		switch(environment.toLowerCase().trim()) {
		case "qa":
			System.out.println("Performing Regression test on QA environment");
			break;
		case "stage":
			System.out.println("Performing Regression test on Stage environment");
			break;
		case "dev":
			System.out.println("Performing Regression test on Dev environment");
			break;
		case "uat":
			System.out.println("Performing Regression test on UAT environment");
			break;
		case "prod":
			System.out.println("Performing Regression test on PROD environment");
			break;
		default:
			System.out.println("Please select the available Environment only ");
			}

	}

}
