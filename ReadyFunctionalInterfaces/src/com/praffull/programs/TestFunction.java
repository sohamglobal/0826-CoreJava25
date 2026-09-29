package com.praffull.programs;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, String> obj=(marks)->{
			if(marks>=35)
				return "pass";
			else
				return "fail";
		};
		System.out.println(obj.apply(23));
	}

}
