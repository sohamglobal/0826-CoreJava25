package com.swami.programs;

import java.util.Scanner;

public class IfCustomerBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String custName;
		double amount,discount,bill;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter customer Name : ");
		custName=sc.nextLine();
		System.out.print("Enter purchase amount : ");
		amount=sc.nextDouble();
		
		if(amount>=20000)
		{
			discount=amount*13/100;
			System.out.println("13% discount applied");
		}
		else
		{
			discount=amount*9/100;
			System.out.println("9% discount applied");
		}
		bill=amount-discount;
		System.out.println("Name : "+custName);
		System.out.println("Amount : "+amount);
		System.out.println("Discount : "+discount);
		System.out.println("Net Bill : "+bill);
	}

}
