package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> carBrands = new ArrayList<String>();
		carBrands.add("Toyota");
		carBrands.add("Lexus");
		carBrands.add("Acura");
		carBrands.add("Honda");

		List<String> exoticBrands = new ArrayList<String>();
		exoticBrands.add("Lamborghini");
		exoticBrands.add("Ferrari");
		exoticBrands.add("McLarren");

		Map<String, List<String>> map = new LinkedHashMap<String,List<String>>();
		map.put("RegularBrands", carBrands);
		map.put("ExoticBrands", exoticBrands);

		for(Map.Entry<String, List<String>> car:map.entrySet()){
			System.out.println(car.getKey() + " "+car.getValue());
		}
	}
	}

