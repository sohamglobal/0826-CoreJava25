package com.forloops.programs;

import java.util.Scanner;

public class ForTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		
		for(i=1;i<=10;i++)
			System.out.println(n*i);

	}

}
