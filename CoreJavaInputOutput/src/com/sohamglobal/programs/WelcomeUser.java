package com.sohamglobal.programs;
import java.util.*;

public class WelcomeUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		userName=sc.nextLine();
		
		System.out.println("Welcome "+userName+" to Java");
		sc.close();
	}

}
