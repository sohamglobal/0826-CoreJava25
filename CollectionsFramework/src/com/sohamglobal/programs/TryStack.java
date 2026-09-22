package com.sohamglobal.programs;

import java.util.Iterator;
import java.util.Stack;

public class TryStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st=new Stack<>();
		st.push("oracle");
		st.push("mysql");
		st.push("mongodb");
		st.push(null);
		st.push("oracle");
		st.push("azure");
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		st.clear();
		System.out.println(st.isEmpty());
		
		
		System.out.println("----------------");
		Iterator<String> iterator=st.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}
