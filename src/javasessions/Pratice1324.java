package javasessions;

public class Pratice1324 {

	String name;
	int age;
	double salary;
	static String state = "Kansas";

	public static void main(String[] args) {
		Pratice1324 pc1 = new Pratice1324();
		pc1.name = "SUDHEER";

		Pratice1324 pc2 = new Pratice1324();
		pc2.name = "NAVEEN";

		Pratice1324 pc3 = new Pratice1324();
		pc3.name = "MYRA";

		Pratice1324 pc4 = new Pratice1324();
		pc4.name = "BINDU";
		
		Pratice1324 pc5 = new Pratice1324();
		pc5.name = "HARI";
		
		pc1=pc2;
		System.out.println(pc1.name+ "-"+pc2.name + "-"  +pc3.name +"-"+pc4.name+"-"+pc5.name+"&"+state.toUpperCase());
		pc2=pc3;
		System.out.println(pc1.name+ "-"+pc2.name + "-"  +pc3.name +"-"+pc4.name+"-"+pc5.name+"& "+Pratice1324.state );
		pc3=pc4;
		System.out.println(pc1.name+ "-"+pc2.name + "-"  +pc3.name +"-"+pc4.name+"-"+pc5.name  );
		pc4=pc5;
		System.out.println(pc1.name+ "-"+pc2.name + "-"  +pc3.name +"-"+pc4.name+"-"+pc5.name  );
		pc5=pc1;
		System.out.println(pc1.name+ "-"+pc2.name + "-"  +pc3.name +"-"+pc4.name+"-"+pc5.name  );
		//added comments
	}

}
