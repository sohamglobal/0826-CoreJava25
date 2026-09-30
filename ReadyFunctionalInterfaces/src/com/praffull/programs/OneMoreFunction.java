package com.praffull.programs;

import java.util.function.Function;

public class OneMoreFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, String> obj=(nm)->{
			String msg="Welcome "+nm.toUpperCase();
			return msg;
		};
		
		System.out.println(obj.apply("sharayu"));
		System.out.println(obj.apply("babu"));
		
	}

}
