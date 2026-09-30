package com.aarya.programs;

import com.owee.interfaces.DiscountCalculator;
import com.owee.interfaces.SquareCalculator;

public class TestingLambdaFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareCalculator obj=(a)->{
			int sq;
			sq=a*a;
			//System.out.println("Square is "+sq);
			return sq;
		};
		
		System.out.println(obj.calcSquare(13));
		
		DiscountCalculator dc=(amount,perc)->{
			double discount;
			discount=amount*perc/100;
			System.out.println("Discount is "+discount);
		};
		dc.findDiscount(13450.00, 9.5);
	}

}
