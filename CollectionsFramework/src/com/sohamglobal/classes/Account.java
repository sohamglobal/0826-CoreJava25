package com.sohamglobal.classes;

public class Account {
	private int accnumber;
	private String accname;
	private String acctype;
	private double balance;
	
	public Account(int accnumber, String accname, String acctype, double balance) {
		super();
		this.accnumber = accnumber;
		this.accname = accname;
		this.acctype = acctype;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accnumber=" + accnumber + ", accname=" + accname + ", acctype=" + acctype + ", balance="
				+ balance + "]";
	}
	
	

}
