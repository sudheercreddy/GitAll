package Assigmenet;

import java.util.Arrays;

public class ArrayEg {

	public static void main(String[] args) {
		//Array of int of rollnumbers
		
		int[] rollnumbers = new int[5];
		rollnumbers[0]=123;
		rollnumbers[1]=1123;
		rollnumbers[2]=3123;
		rollnumbers[3]=3123;
		rollnumbers[4]=5123;
		
		for(int aa :rollnumbers) {
			if(aa==123) {
				System.out.println("123 is present");
			}
		}
		
		
		int[] aaa = {12,14,15,16};
		System.out.println(Arrays.toString(aaa));
		
		System.out.println(Arrays.toString(rollnumbers));
		
	}

}
