package com.praffull.programs;

import com.sohamglobal.classes.Film;

public class MyMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Film f=new Film("sholay",1975,"action",8.1);
		//f.showData();
		System.out.println(f);
		
		f=new Film("the matrix",1999,"action",8.9);
		System.out.println(f);
	}

}
