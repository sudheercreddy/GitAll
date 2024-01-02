package LeetCode;

public class ObjectArray {

	public static void main(String[] args) {

		Object[] items = new Object[5];

		items[0] = "Sudheer";
		items[1] = "Chittireddy";
		items[2] = 5999;
		items[3] = "sudheer@gmail.com";
		items[4] = 'A';
				
		
		System.out.println(items);
		System.out.println("--------");
		for (Object all : items) {
			System.out.println(all);
		}

	}

}
