package com.praffull.classes;
import com.aarya.interfaces.*;

public class CreditCard implements Payment {

	public void pay()
	{
		System.out.println("credit card payment done");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("credit card payment refund complete");
	}
}
