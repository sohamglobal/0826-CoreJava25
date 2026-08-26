package com.sohamglobal.classes;

public class User {
	
	private String userid;
	private String password;
	private String status;
	
	public String getStatus() {
		check();
		return status;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private void check()
	{
		if(userid.equals("ethan") && password.equals("mission"))
			status="success";
		else
			status="failed";

	}
	

}
