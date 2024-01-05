package Assigmenet;

import java.util.ArrayList;

public class ArrayListPRa {

	
	
	public ArrayList<String> getDevices() {
		System.out.println("Getting devices");
		ArrayList<String>users = new ArrayList<String>();
		users.add("shiva");
		users.add("ravi");
		users.add("Leena");
		return users;
		
	}
	public static void main(String[] args) {
		ArrayListPRa ap = new ArrayListPRa();
		ArrayList<String> myList= ap.getDevices();
		System.out.println(myList.size());
		myList.add("sudheer");
		System.out.println(myList.size());
	}

}
