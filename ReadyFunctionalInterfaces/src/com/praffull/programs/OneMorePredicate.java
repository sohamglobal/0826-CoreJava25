package com.praffull.programs;

import java.util.function.Predicate;

public class OneMorePredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> obj=(n)->{
			if(n%2==1)
				return true;
			else
				return false;
		};
		
		System.out.println(obj.test(9));
		System.out.println(obj.test(26));
		
	}

}
