package com.praffull.programs;

public class FinalStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I like cricket";
		String res=s.replace("cricket", "football");
		System.out.println(res);
		String ps="chelsea123";
		res=ps.replaceAll("[0-9]", "x");
		System.out.println(res);
		
		String film="the matrix,1999,action,english,keanu reeves,8.9";
		String[] arr=film.split(",");
		
		for(String f:arr)
			System.out.println(f);
		
		String nm="    ";
		System.out.println(nm.isBlank());
		System.out.println(nm.isEmpty());
		
		String city="";
		System.out.println(city.equals("berlin"));
		System.out.println(city.isEmpty());
		
		System.out.println("soham".concat("global"));
		
		int n=746256;
		System.out.println(String.valueOf(n).substring(0,2));
		
		
		String code="821509";
		System.out.println(Integer.parseInt(code)+4);
		//Float.parseFloat()
		//Double.parseDouble()
		
		String id="ethan ";
		System.out.println(id.repeat(5));
	}

}
