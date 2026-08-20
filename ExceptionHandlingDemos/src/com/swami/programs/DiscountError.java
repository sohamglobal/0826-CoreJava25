package com.swami.programs;

import java.util.Scanner;

public class DiscountError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double amount,discount,bill;
		System.out.print("Enter purchase Amount : ");
		
		try {
			amount=sc.nextDouble();
		}
		catch(Exception e)
		{
			amount=0.0;
			System.out.println("invalid amount...");
		}
		discount=amount*10/100;
		bill=amount-discount;
		if(amount>0)
		{
		System.out.println("Amount   : "+amount);
		System.out.println("Discount : "+discount);
		System.out.println("Net Bill : "+bill);
		}
		sc.close();
	}

}
