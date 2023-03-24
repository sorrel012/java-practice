package collections;

import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {

		TreeMap<String, Integer> treemap = new TreeMap<>();

		treemap.put("F", 25);
		treemap.put("Z", 5);
		treemap.put("L", 250);
		treemap.put("A", 15);
		treemap.put("B", 25);
		treemap.put("G", 25);

		System.out.println(treemap);

		System.out.println(treemap.higherKey("B"));
		System.out.println(treemap.ceilingKey("B"));
		System.out.println(treemap.lowerKey("B"));
		System.out.println(treemap.floorKey("B"));
		System.out.println();

		System.out.println(treemap.firstEntry());
		System.out.println(treemap.lastEntry());
		System.out.println();

		System.out.println(treemap.subMap("F", "Z"));
		System.out.println(treemap.subMap("F", true, "Z", true));


	} //main

}
