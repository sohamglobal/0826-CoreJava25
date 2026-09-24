package com.sohamglobal.programs;

import java.util.Hashtable;
import java.util.Iterator;

public class TryHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(101, "soham");
		ht.put(102, "aarya");
		ht.put(103, "owee");
		ht.put(104, "sharayu");
		
		System.out.println(ht);
		System.out.println(ht.get(103));
		
				
	}

}
