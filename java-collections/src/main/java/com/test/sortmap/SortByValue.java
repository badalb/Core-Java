package com.test.sortmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByValue {

	public static void main(String[] args) {

		MapKey fKey = new MapKey("hello", "world");
		MapKey lKey = new MapKey("Hello", "World");

		MapVal fVal = new MapVal("test", "value");
		MapVal lVal = new MapVal("Test", "Value");

		Map<MapKey, MapVal> skMap = new HashMap<MapKey, MapVal>();
		skMap.put(fKey, fVal);
		skMap.put(lKey, lVal);

		System.out.println(skMap);

		Map<MapKey, MapVal> treeMap = sortMapByValue(skMap);

		System.out.println(treeMap);

	}

	public static TreeMap<MapKey, MapVal> sortMapByValue(Map<MapKey, MapVal> map) {
		Comparator<? super MapKey> comparator = new ValueComparator(map);
		TreeMap<MapKey, MapVal> result = new TreeMap<MapKey, MapVal>(comparator);
		result.putAll(map);
		return result;
	}

}
