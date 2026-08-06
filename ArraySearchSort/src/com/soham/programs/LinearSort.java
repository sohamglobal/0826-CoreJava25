package com.soham.programs;

public class LinearSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,67,33,23,45,9,13,26,9,10};
		int temp;
		for(int i=0;i<=8;i++)
		{
			for(int j=i+1;j<=9;j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		
		for(int n:arr)
			System.out.print(n+" ");
	}

}
