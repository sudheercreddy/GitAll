package LeetCode;

public class Arrays {

	public static void main(String[] args) {
		int[] products = new int[5];
		
		products[0] = 11;
		products[1] = 22;
		products[2] = 33;
		products[3] = 44;
		products[4] = 55;

		for (int aa : products) {
			if (aa == 44) {
			 	System.out.println(aa + "found ");
				break;
			} else {
				System.out.println(aa + "searching for .....");
			}
		}
	}

}
