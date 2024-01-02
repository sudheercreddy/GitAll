package javasessions;

public class Day3 {

	public static void main(String[] args) {
		//wideinng
		byte a = 10;
		short b = a;
		// byte-->short-->int-->float-->double
		 System.out.println(a);
		 System.out.println(b);
		 
		 
		 //narrowing
		 int c=150;
		 byte d =(byte) c;
		 System.out.println(d);
		 
		 int e = 99998989;
		 long f = e;
		 System.out.println(e);
		 System.out.println(f);
		 
		 int g = (int)f;
		 System.out.println(g);
		 System.out.println(f);
		 
		 
		 float h = 13456.6345f;
		 double i = h;
		 System.out.println(h);
		 System.out.println(i);
		 
		 
		 float j =(float)i;
		 System.out.println(j);
		 
		 char ch = 'a';
		 System.out.println("The ASCII Value of " + ch + " 	is " + (int)ch);
		 
		 int k = 100;
		 char l = (char)k;
		 System.out.println(l);
		 
		 
		 int m = 64;
		 char n = (char)m;
		 System.out.println(n);
		 
	}

}
