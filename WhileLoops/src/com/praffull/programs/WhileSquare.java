package com.praffull.programs;
import java.util.*;

public class WhileSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		Scanner sc=new Scanner(System.in);
		
		while(n!=0)
		{
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		if(n!=0)
		System.out.println("Square is "+n*n);
		}

	}

}
