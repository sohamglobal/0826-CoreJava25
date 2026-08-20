package com.swami.programs;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks;
		
		System.out.print("Enter student marks out of 100 : ");
		
		try {
		marks=sc.nextInt();
		if(marks<0 || marks>100)
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("invalid marks");
			marks=0;
		}
				
		
		if(marks>=35)
			System.out.println("student is PASS");
		else
			System.out.println("student is FAIL");
		

	}

}
