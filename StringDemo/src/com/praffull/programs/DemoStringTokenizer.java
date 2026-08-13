package com.praffull.programs;

import java.util.StringTokenizer;

public class DemoStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("I love Java");
		String token;
		
		while(st.hasMoreTokens())
		{
			token=st.nextToken();
			System.out.println(token);
		}

	}

}
