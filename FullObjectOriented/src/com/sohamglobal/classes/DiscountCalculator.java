package com.sohamglobal.classes;

public class DiscountCalculator {
	
	private double discount;
	
	public DiscountCalculator()
	{
		discount=13;
	}
	
	public void showBill(String custnm,double amount)
	{
		double bill,discamt;
		discamt=amount*discount/100;
		bill=amount-discamt;
		System.out.println("Customer name : "+custnm);
		System.out.println("Purchase amount :₹ "+amount);
		System.out.println("Discount Percent :₹ "+discount+"%");
		System.out.println("Discount amount :₹ "+discamt);
		System.out.println("Bill :₹ "+bill);
	}
	
	

}
