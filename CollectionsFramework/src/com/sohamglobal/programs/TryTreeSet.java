package com.sohamglobal.programs;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TryTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("dominic szoboszlai");
		ts.add("virgil van dijk");
		ts.add("bukayo saka");
		ts.add("bruno fernandez");
		//ts.add(null);
		ts.add("bukayo saka");
		ts.add("mohammed salah");
		ts.add("adam gilchrist");
		System.out.println(ts);
		
		Iterator<String> it=ts.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		TreeSet<Integer> tsi=new TreeSet<Integer>(Collections.reverseOrder());
		tsi.add(31);
		tsi.add(26);
		tsi.add(9);
		tsi.add(13);
		tsi.add(45);
		tsi.add(1);
		tsi.add(10);
		System.out.println(tsi);
		

	}

}
