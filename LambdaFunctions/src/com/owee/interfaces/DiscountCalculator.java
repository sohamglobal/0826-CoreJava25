package com.owee.interfaces;

@FunctionalInterface
public interface DiscountCalculator {
	public void findDiscount(double amount,double perc);
}
