package com.praffull.programs;

import java.util.Scanner;

public class SwitchArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter day : ");
		day=sc.nextInt();
		
		switch(day)
		{
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
		default -> System.out.println("Invalid weekday");
		}
		
		
	}

}
