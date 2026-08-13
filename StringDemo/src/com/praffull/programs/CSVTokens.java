package com.praffull.programs;

import java.util.StringTokenizer;

public class CSVTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String film="sholay,1975,action,hindi,amitabh bachchan,r d burman,7.6";
		StringTokenizer st=new StringTokenizer(film,",");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		

	}

}
