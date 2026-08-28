package com.praffull.programs;

import com.sohamglobal.classes.Addition;

public class FunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition obj=new Addition();
		obj.add(12, 45, 66);
		obj.showResult();
		obj.add(44, 77);
		obj.showResult();
		
	}

}
