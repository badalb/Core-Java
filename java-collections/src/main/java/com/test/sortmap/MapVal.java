package com.test.sortmap;

public class MapVal {

	private String mapFVal;

	private String mapSval;

	public String getMapFVal() {
		return mapFVal;
	}

	public void setMapFVal(String mapFVal) {
		this.mapFVal = mapFVal;
	}

	public String getMapSval() {
		return mapSval;
	}

	public void setMapSval(String mapSval) {
		this.mapSval = mapSval;
	}

	public MapVal(String mapFVal, String mapSval) {
		super();
		this.mapFVal = mapFVal;
		this.mapSval = mapSval;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mapFVal == null) ? 0 : mapFVal.hashCode());
		result = prime * result + ((mapSval == null) ? 0 : mapSval.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapVal other = (MapVal) obj;
		if (mapFVal == null) {
			if (other.mapFVal != null)
				return false;
		} else if (!mapFVal.equals(other.mapFVal))
			return false;
		if (mapSval == null) {
			if (other.mapSval != null)
				return false;
		} else if (!mapSval.equals(other.mapSval))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MapVal [mapFVal=" + mapFVal + ", mapSval=" + mapSval + "]";
	}

}
