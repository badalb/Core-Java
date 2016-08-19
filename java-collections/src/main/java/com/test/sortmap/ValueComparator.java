package com.test.sortmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class ValueComparator<K, V extends Comparable<V>> implements Comparator<K> {

	HashMap<K, V> map = new HashMap<K, V>();

	public ValueComparator(Map<K, V> map2) {
		this.map.putAll(map2);
	}

	@Override
	public int compare(K s1, K s2) {
		return ((MapVal) map.get(s1)).getMapFVal().compareTo(((MapVal) map.get(s2)).getMapFVal());
	}
}
