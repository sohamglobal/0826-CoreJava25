package com.praffull.programs;

import java.util.Calendar;
import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> obj=()->{
			Calendar cal=Calendar.getInstance();
			return cal.getTime().toString();
		};
		
		System.out.println(obj.get());
	}

}
