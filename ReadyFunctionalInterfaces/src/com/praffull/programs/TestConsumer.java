package com.praffull.programs;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Double> obj=(amount)->{
			double discount;
			discount=amount*9/100;
			System.out.println("Discount will be "+discount);
		};
		obj.accept(12360.00);
	}

}
