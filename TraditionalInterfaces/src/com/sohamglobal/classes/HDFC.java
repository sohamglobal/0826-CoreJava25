package com.sohamglobal.classes;

import com.sohamglobal.interfaces.Banking;

public class HDFC implements Banking {

	@Override
	public void showNotification() {
		// TODO Auto-generated method stub
		System.out.println("transfer successful");
	}

	@Override
	public void calcInterest(double balance) {
		// TODO Auto-generated method stub
		double interest;
		interest=balance*3/100;
		System.out.println("Interest "+interest);
	}

}
