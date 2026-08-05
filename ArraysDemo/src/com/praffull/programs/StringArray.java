package com.praffull.programs;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names=new String[5];
		String[] arr= {"praffull","swami","sharayu"};
		Scanner sc=new Scanner(System.in);
		
		for(String nm:arr)
			System.out.println(nm);
		
		System.out.println("Enter 5 names : ");
		for(int i=0;i<=4;i++)
		{
			names[i]=sc.next();
		}

	}

}
