package com.sohamglobal.programs;

import java.util.Iterator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<>();
		v.add("mobile");
		v.add("laptop");
		v.add("watch");
		v.add("keyboard");
		v.add("mobile");
		v.add(null);
		v.add("mouse");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		Iterator<String> iterator=v.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}
