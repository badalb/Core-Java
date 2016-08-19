package com.test.sortmap;

public class MapKey {

	private String fAttr;

	private String lAttr;

	public String getfAttr() {
		return fAttr;
	}

	public void setfAttr(String fAttr) {
		this.fAttr = fAttr;
	}

	public String getlAttr() {
		return lAttr;
	}

	public void setlAttr(String lAttr) {
		this.lAttr = lAttr;
	}

	public MapKey(String fAttr, String lAttr) {
		super();
		this.fAttr = fAttr;
		this.lAttr = lAttr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fAttr == null) ? 0 : fAttr.hashCode());
		result = prime * result + ((lAttr == null) ? 0 : lAttr.hashCode());
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
		MapKey other = (MapKey) obj;
		if (fAttr == null) {
			if (other.fAttr != null)
				return false;
		} else if (!fAttr.equals(other.fAttr))
			return false;
		if (lAttr == null) {
			if (other.lAttr != null)
				return false;
		} else if (!lAttr.equals(other.lAttr))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MapKey [fAttr=" + fAttr + ", lAttr=" + lAttr + "]";
	}

}
