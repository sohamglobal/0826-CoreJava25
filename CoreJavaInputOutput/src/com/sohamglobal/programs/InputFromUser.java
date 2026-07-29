package com.sohamglobal.programs;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sq;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		sq=n*n;
		System.out.println("Square of "+n+" is "+sq);
		sc.close();
	}

}
