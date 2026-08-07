package com.arrays.programs;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{10,12},
				{22,56,77},
				{54},
				{11,69,25,48}
			};
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		
		}

	}

}
