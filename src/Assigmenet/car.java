package Assigmenet;

public class car {

	public static void main(String[] args) {
		// WAP to book the specific type of car from the Uber app using Switch - Case. 
		//Car Type: Mini, Sedan, SUV, Premium
		
		String selectCar="Minai";
		
		switch(selectCar.toUpperCase().trim()) {
		case "MINI":{
			System.out.println(selectCar+ ":car Succesfully! Booked the car !!!");
			break;
		}
		case "Sedan":{
			System.out.println(selectCar+ ":Succesfully! Booked the car !!!");
			break;
		}
		case "SUV":{
			System.out.println(selectCar+ " : Succesfully! Booked the car !!!");
			break;
		}
		case "Premiume":
			System.out.println(selectCar +" :Succesfully! Booked the car !!!");
			break;
		default:
			System.out.println("WARNING: please select the right car type!");
		}
		
		
		
	}

}
