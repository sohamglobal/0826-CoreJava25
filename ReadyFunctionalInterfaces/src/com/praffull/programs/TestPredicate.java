package com.praffull.programs;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> obj=(password)->{
			if(password.equals("liverpool"))
				return true;
			else
				return false;
		};
		
		System.out.println(obj.test("chelsea"));
	}

}
