package Assigmenet;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> namesofCities = new ArrayList<>();
		namesofCities.add("hyderabad");
		namesofCities.add("balanagar");
		namesofCities.add("kansas");
		namesofCities.add("overland park");
		namesofCities.add("olathe");
		namesofCities.add("missouri");
		namesofCities.add(6, "lee sumit");

		ArrayList<Object> namesofCities1 = new ArrayList<>();
		namesofCities1.add(namesofCities);
		// System.out.println(namesofCities1);
		namesofCities1.add("london");
		namesofCities1.add("aussie");
		namesofCities1.add("texas");

		ArrayList<Object> namesofCities2 = new ArrayList<>(Arrays.asList("one",12,45.6,'f'));
		namesofCities2.add(namesofCities1);
		
		for (int i = 0; i <= namesofCities2.size() - 1; i++) {
			System.out.println(namesofCities2.get(i));
		}

	}

}
