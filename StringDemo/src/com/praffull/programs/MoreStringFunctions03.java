package com.praffull.programs;

public class MoreStringFunctions03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uid="praffull";
		String ps="Praffull";
		System.out.println(uid.equals(ps));
		System.out.println(uid.equalsIgnoreCase(ps));
		
		if(uid.equalsIgnoreCase(ps))
			System.out.println("same userid password not allowed");
	
		String s1="praffull";
		String s2="Shailaja";
		//0 for same, -ve if first is smaller, +ve if first is larger
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo("praffull"));
	}

}
