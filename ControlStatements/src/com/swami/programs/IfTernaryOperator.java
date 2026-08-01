package com.swami.programs;

import java.util.Scanner;

public class IfTernaryOperator {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.print("Enter your age : ");
		age=sc.nextInt();
		String result=(age>=18)?"Adult":"Minor";
		System.out.println(result);
		
		String ps;
		System.out.print("Enter password : ");
		ps=sc.next();
		
		/*
		String status=(ps=="chelsea")?"success":"failed";
		System.out.println(status);
		*/
		
		double pamt,disc;
		pamt=12000;
		disc=(pamt>2000)?pamt*13/100:pamt*9/100;
		System.out.println(disc);
	}

}
