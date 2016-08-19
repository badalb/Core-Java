package com.test.sortmap;

import java.util.Comparator;

public class KeyComparator implements Comparator<MapKey> {

	@Override
	public int compare(MapKey o1, MapKey o2) {

		if (o1.getfAttr() == o2.getfAttr()) {
			return 0;
		}
		if (o1.getfAttr() == null) {
			return -1;
		}
		if (o2.getfAttr() == null) {
			return 1;
		}
		return o1.getfAttr().compareTo(o2.getfAttr());

	}

}
