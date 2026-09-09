package com.praffull.programs;

import com.praffull.classes.Movies;

public class Entertain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movies m;
		m=new Movies("PK", 2014, "comedy", "amir khan", 8.9);
		System.out.println(m);
		
		m=new Movies("Sholay", 1975, "action", "amjad khan", 8.1);
		System.out.println(m);
	}

}
