package com.forloops.programs;

import java.util.Scanner;

public class ForFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		
		//4-> 1x2x3x4
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
		

	}

}
