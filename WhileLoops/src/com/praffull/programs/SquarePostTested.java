package com.praffull.programs;

import java.util.Scanner;

public class SquarePostTested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner sc=new Scanner(System.in);
		// post-tested loop (first action then condition)
		// repeat as long as the condition is true
		do
		{
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		if(n!=0)
		System.out.println("Square is "+n*n);
		}
		while(n!=0);
	}

}
