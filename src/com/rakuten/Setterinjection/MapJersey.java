package com.rakuten.Setterinjection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapJersey {
	private HashMap<Integer,String> hmap;

	public HashMap<Integer, String> getHmap() {
		return hmap;
	}

	public void setHmap(HashMap<Integer, String> hmap) {
		this.hmap = hmap;
	}
	public void displayTeam() {
		Iterator<Map.Entry<Integer, String> >itr= hmap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String>entry =itr.next();
			System.out.println("jersey:"+entry.getKey());
		}


}
}
