package com.praffull.programs;

import java.util.Hashtable;

public class TryHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> ht=new Hashtable<String, String>();
		ht.put("IN", "India");
		ht.put("US", "America");
		ht.put("GB","Britain");
		ht.put("CN", "China");
		ht.put("JP", "Japan");
		//ht.put("FR", null);
		System.out.println(ht);
	}

}
