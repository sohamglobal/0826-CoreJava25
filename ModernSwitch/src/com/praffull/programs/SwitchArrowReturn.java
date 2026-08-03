package com.praffull.programs;

import java.util.Scanner;

public class SwitchArrowReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter day : ");
		day=sc.nextInt();
		
		String dayName=switch(day)
		{
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid weekday";
		};
		
		System.out.println("Day name is "+dayName);
	}

}
