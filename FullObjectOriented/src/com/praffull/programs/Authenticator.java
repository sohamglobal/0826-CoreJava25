package com.praffull.programs;

import java.util.Scanner;

import com.sohamglobal.classes.User;

public class Authenticator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String id,ps;
		System.out.print("Enter userid : ");
		id=sc.next();
		System.out.print("Enter password : ");
		ps=sc.next();
		
		//System.out.println(id+" | "+ps);
		User obj=new User();
		obj.setUserid(id);
		obj.setPassword(ps);
		//System.out.println("Authentication status : "+obj.getStatus());
		
		if(obj.getStatus().equals("success"))
			System.out.println("welcome to sohamglobal");
		else
			System.out.println("sorry authentication failed");
		

	}

}
