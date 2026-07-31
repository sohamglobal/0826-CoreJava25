package com.swami.programs;
import java.util.*;

public class IfStudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks : ");
		marks=sc.nextInt();
		
		if(marks>=35)
		{
			System.out.println("You are pass");
		}
		else
		{
			System.out.println("You are fail");
		}
		
		sc.close();

	}

}
