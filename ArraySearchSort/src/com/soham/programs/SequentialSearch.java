package com.soham.programs;

import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,67,33,23,45,9,13,26,9,10};
		int n,i;
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter search number : ");
		n=sc.nextInt();
		
		for(i=0;i<=9;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("Found at "+i);
				found=true;
			}
			
		}
		
		if(found==false)
			System.out.println("not found");

	}

}
