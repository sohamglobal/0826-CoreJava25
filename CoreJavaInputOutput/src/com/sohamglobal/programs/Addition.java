package com.sohamglobal.programs;
import java.util.*;

public class Addition {
	public static void main(String args[])
	{
		double x,y,result;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		x=sc.nextDouble();
		System.out.print("Enter second number : ");
		y=sc.nextDouble();
		
		result=x+y;
		System.out.println("Sum of "+x+" and "+y+" is "+result);
		sc.close();
	}

}
