package com.forloops.programs;

public class NewForArrays {

	public static void main(String[] args) {
		// array is a collection of values of same type
		int[] n= {9,26,13,1,10,45,30};
		/*
		int i;
		for(i=0;i<=6;i++)
			System.out.println(n[i]);
		*/
		for(int x:n)
			System.out.println(x*x);
		
	}

}
