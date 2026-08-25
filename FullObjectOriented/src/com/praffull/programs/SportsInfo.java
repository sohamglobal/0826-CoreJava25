package com.praffull.programs;
import com.sohamglobal.classes.*;

public class SportsInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player obj=new Player();
		/*
		obj.name="Joe Root";
		System.out.println(obj.name);
		*/
		obj.setName("Jos Buttler");
		obj.setAge(35);
		System.out.println("Name is "+obj.getName());
		//System.out.println("Age is "+obj.getAge());
		int n=obj.getAge();
		if(n>=30)
			System.out.println("senior player");
		else
			System.out.println("junior player");
		
		
	}

}
