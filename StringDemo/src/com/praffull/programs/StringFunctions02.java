package com.praffull.programs;

public class StringFunctions02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="You will never walk alone";
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.substring(5,13));
		System.out.println(name.substring(10));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		String city="     mumbai     ";
		System.out.println("my city is "+city.trim()+" and i love it");
		System.out.println("my city is "+city.strip()+" and i love it");
		System.out.println("my city is "+city.stripLeading()+" and i love it");
		System.out.println("my city is "+city.stripTrailing()+" and i love it");
		
		String line="technology is power";
		System.out.println(line.startsWith("What"));
		System.out.println(line.startsWith("tech"));
		System.out.println(line.endsWith("?"));
		System.out.println(line.contains("was"));
		System.out.println(line.indexOf("is")); // -1 for not found
		
	}

}
