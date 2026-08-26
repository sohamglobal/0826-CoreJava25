package com.praffull.programs;

import com.sohamglobal.classes.Account;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		acc.showAccountDetails();
		
		Account obj=new Account("swami",43500.00);
		obj.showAccountDetails();
	}

}
