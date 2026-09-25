package com.praffull.programs;

import java.util.HashMap;

public class TryHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(63, "Jos Buttler");
		hm.put(66, "Joe Root");
		hm.put(8, "Dominik Szoboszlai");
		hm.put(9,"Praffull");
		hm.put(null, "Swami");
		hm.put(null, "Aarya");
		System.out.println(hm);
		System.out.println(hm.get(9));
		//Load factor - expands here 16x.75=12 -> 32

	}

}
