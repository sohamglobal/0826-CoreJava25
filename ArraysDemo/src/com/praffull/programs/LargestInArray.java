package com.praffull.programs;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,23,34,75,56,67,18};
		int largest=0;
		
		for(int n:arr)
		{
			if(n>largest)
				largest=n;
		}
		
		System.out.println(largest);

	}

}
