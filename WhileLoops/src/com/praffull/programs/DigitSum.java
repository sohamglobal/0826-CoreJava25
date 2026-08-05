package com.praffull.programs;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		
		while(n>0)
		{
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println("sum of digits is "+sum);
	}

}
