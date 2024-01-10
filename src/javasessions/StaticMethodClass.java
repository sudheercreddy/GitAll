package javasessions;

public class StaticMethodClass {

	public static String name;
	public static String LName;
	public int age;
	public String Mname;
	StaticMethodClass sc =  new StaticMethodClass();

	public void a1() {
		System.out.println("NON-A1");
		a2();//NS-NS
		b1();//NS-S
	}

	public void a2() {
		System.out.println("NON-A2");

	}

	public void a3() {
		System.out.println("NON-A3");

	}

	public static void b1() {
		System.out.println("Static-B1");
		StaticMethodClass sc =  new StaticMethodClass();
		sc.a3();

	}

	public static void b2() {
		System.out.println("Static-B2");

	}

	public static void b3() {
		System.out.println("Static-B3");

	}

	public static void main(String[] args) {
		

	}

}
