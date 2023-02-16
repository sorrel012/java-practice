package collections;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put("F", 25);
		linkedHashMap.put("A", 15);
		linkedHashMap.put("Z", 5);
		linkedHashMap.put("L", 250);

		System.out.println(linkedHashMap);

		TreeMap<String, Integer> treemap = new TreeMap<>();

		treemap.put("F", 25);
		treemap.put("A", 15);
		treemap.put("Z", 5);
		treemap.put("L", 250);

		System.out.println(treemap);



	} //main

}
