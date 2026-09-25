package com.praffull.programs;

import java.util.LinkedHashMap;

public class TryLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<String, Integer>();
		lhm.put("Mumbai", 1);
		lhm.put("Nanded", 26);
		lhm.put("Buldhana", 28);
		lhm.put("Amravati", 27);
		lhm.put(null, 44);
		lhm.put("Washim", null);
		System.out.println(lhm);
	}

}
