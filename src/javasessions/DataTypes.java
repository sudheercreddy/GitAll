package javasessions;

public class DataTypes {

	public static void main(String[] args) {

		/*
		 * Data Types - type of Data in the varaible . 2 types of Date types 1-
		 * primitive data type and 2- Non primitive data type
		 * 
		 * 1- primitive data type --> byte , short , int , long Numeric Type: //Integer
		 * Value: 1. Integer: byte, short, Int, long 2. Floating-point: float, double
		 * //Character type: char
		 * 
		 */

		// byte
		// size is 1 byte = 8 bits
		// range //2^7 to -2^7 = 2x2x2x2x2x2x2=128

		byte age = 25;
		System.out.println(age);

		// short
		// size is 2 bytes = 16 bits
		// range is //2^15 -->-32768 to 32767

		short shoEg = 32767;

		short shorEgNeg = -32768;

		System.out.println(shoEg);
		System.out.println(shorEgNeg);

		// int
		// size is 4 bytes = 4x8 = 32 bits
		// range 2^31
		int rage = 23444;
		System.out.println(rage);

		// long
		// size --> 8 bytes 8x8 = 64 bits
		// range 2^63
		long sss = 324232432;

		System.out.println(sss);
		
		//float
		//size - 4 bytes 4x8 = 32 bits
		//range 2^31
		
		float money = 12.4444444444f;
		System.out.println(money);
		
		//float
		//size - 4 bytes 4x8 = 32 bits
		//range 2^31
		double moneyD = 12.444444444;
		System.out.println(moneyD);
		
		
		char c = 'a';
		char c1= '1';
		char c2 = '$';
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c+c1);//97+49 as per ASCII its Dec valueis 

		

	}

}
