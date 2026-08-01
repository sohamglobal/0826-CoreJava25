package com.swami.programs;

import java.util.Scanner;

public class SwitchString {
	public static void main(String args[])
	{
		String country;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter country : ");
		country=sc.next();
				
		switch(country)
		{
		case "england":
			System.out.println("Capital:London Currency: Pounds");
			break;
		case "germany":
			System.out.println("Capital: Berlin Currency: Euro");
			break;
		default:
			System.out.println("Information not available");
		
		}
		
		// member, regular, new
		
	}

}
