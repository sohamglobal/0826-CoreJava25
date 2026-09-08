package com.praffull.classes;
import com.aarya.interfaces.*;

public class UPI implements Payment {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("UPI payment done");
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("UPI refund complete");
	}

}
