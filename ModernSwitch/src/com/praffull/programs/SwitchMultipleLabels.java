package com.praffull.programs;

import java.util.Scanner;

public class SwitchMultipleLabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jno;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter jersey number : ");
		jno=sc.nextInt();
		
		switch(jno)
		{
		case 63,66,55->
			System.out.println("England");
		case 4,8,30->
			System.out.println("Liverpool");
		default->
			System.out.println("invalid number");
		}

	}

}
