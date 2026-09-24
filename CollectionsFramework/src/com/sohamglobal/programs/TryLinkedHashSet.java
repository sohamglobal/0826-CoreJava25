package com.sohamglobal.programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TryLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("c");
		lhs.add("cpp");
		lhs.add("python");
		lhs.add(null);
		lhs.add("cpp");
		lhs.add("java");
		System.out.println(lhs);
		
		Iterator<String> iterator=lhs.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}

}
