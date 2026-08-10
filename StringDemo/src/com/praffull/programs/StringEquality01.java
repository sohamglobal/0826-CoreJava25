package com.praffull.programs;

public class StringEquality01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userid="praffull";
		String name="praffull";
		
		System.out.println(userid==name);
		
		String location=new String("mumbai");
		String city=new String("mumbai");
		
		System.out.println(location==city);
		
		System.out.println("----------------");
		System.out.println(userid.equals(name));
		System.out.println(location.equals(city));

	}

}
