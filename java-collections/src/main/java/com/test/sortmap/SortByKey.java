package com.test.sortmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKey {

	public static void main(String[] args) {
		
		MapKey fKey = new MapKey("hello", "world");
		MapKey lKey = new MapKey("Hello", "World");
		
		MapVal fVal = new MapVal("test", "value");
		MapVal lVal = new MapVal("Test", "Value");
		
		Map<MapKey, MapVal> skMap = new HashMap<MapKey, MapVal>();
		skMap.put(fKey, fVal);
		skMap.put(lKey, lVal);
		
		System.out.println(skMap);
		
		Map <MapKey, MapVal> treeMap = new TreeMap<MapKey, MapVal>(new KeyComparator());
		treeMap.putAll(skMap);
		
		System.out.println(treeMap);
	}

}
