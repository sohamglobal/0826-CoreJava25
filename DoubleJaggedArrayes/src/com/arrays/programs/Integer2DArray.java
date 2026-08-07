package com.arrays.programs;

import java.util.Scanner;

public class Integer2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[][] nums=new int[3][4];
		nums[0][0]=23;
		nums[0][1]=44;
		nums[0][2]=67;
		nums[0][3]=82;
		
		int[][] nums= {
				{12,23,34,54},
				{32,65,43,11},
				{81,22,65,74}
		};
		*/
		Scanner sc=new Scanner(System.in);
		int[][] nums=new int[3][4];
		int i,j;
		
		System.out.println("Enter 12 values : ");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=3;j++)
			{
				nums[i][j]=sc.nextInt();
			}
		}
		
		//sum of elements
		int sum=0,rs;
		for(i=0;i<=2;i++)
		{
			rs=0;
			for(j=0;j<=3;j++)
			{
				sum+=nums[i][j];
				rs+=nums[i][j];
			}
			System.out.println("Row sum is "+rs);
		}
		
		System.out.println("sum of elements is "+sum);
	}

}
