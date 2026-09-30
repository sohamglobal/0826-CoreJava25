package com.praffull.programs;

import java.util.function.Supplier;

public class OneMoreSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> obj=()->{
			String value="abc123";
			return value;
		};
		
		System.out.println(obj.get());
	}

}
