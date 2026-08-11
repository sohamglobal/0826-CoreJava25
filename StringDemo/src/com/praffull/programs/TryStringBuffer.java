package com.praffull.programs;

public class TryStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Java");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append(" programming language");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
