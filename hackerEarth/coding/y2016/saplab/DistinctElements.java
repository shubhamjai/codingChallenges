package hackerEarth.coding.y2016.saplab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DistinctElements {

	private static Map<Integer, Set<Integer>> elementMap = new HashMap<Integer, Set<Integer>>();
	private static Map<Integer, Map<Integer, Integer>> cache = new HashMap<Integer, Map<Integer, Integer>>();
	static int[] arr;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrayLength = in.nextInt();

		arr = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++)
			arr[i] = in.nextInt();

		// elements = new int[arrayLength][arrayLength];

		for (int k = 0; k < arrayLength - 1; k++) {
			int i = in.nextInt();
			int j = in.nextInt();

			insertRelationShip(i, j);
			insertRelationShip(j, i);
		}

		int numberOfQuery = in.nextInt();

		while (numberOfQuery-- > 0) {
			int i = in.nextInt();
			int j = in.nextInt();
			HashSet<Integer> elementCovered = new HashSet<Integer>();
			elementCovered.add(i);
			System.out.println(getDistinctElements(i, j, elementCovered));
		}
	}

	private static void insertRelationShip(int i, int j) {
		if (elementMap.containsKey(i))
			elementMap.get(i).add(j);
		else {

			Set<Integer> list = new HashSet<Integer>();
			list.add(j);
			elementMap.put(i, list);
		}

	}

	private static int getDistinctElements(int i, int j, HashSet<Integer> elementCovered) {
		if (elementMap.containsKey(i)) {
			if (elementMap.get(i).contains(j))
				return 1; // one to one relation ship
		}

		if (cache.containsKey(i)) {
			Map<Integer, Integer> cac = cache.get(i);
			if (cac.containsKey(j))
				return cac.get(j); // result in cache
		}

		Set<Integer> elements = elementMap.get(i);
		int result = -1;
		for (Integer element : elements) {
			if (elementCovered.contains(element))
				continue;
			elementCovered.add(element);
			result = getDistinctElements(element, j, elementCovered);
			if (result > -1)
				return elementCovered.size();
			elementCovered.remove(element);
		}
		return result;
	}

	private static void updateCache(int j, Integer element, int result) {
		Map<Integer, Integer> map = cache.get(element);
		if (null == map) {
			map = new HashMap<Integer, Integer>();
			map.put(j, result);
		}
	}

}
