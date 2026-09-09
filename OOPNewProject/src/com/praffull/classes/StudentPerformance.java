package com.praffull.classes;

public abstract class StudentPerformance {
	
	//abstract method
	public abstract void findPercentage(int totalscore);
	
	//concrete method
	public void showMessage()
	{
		System.out.println("performance data updated");
	}

}
