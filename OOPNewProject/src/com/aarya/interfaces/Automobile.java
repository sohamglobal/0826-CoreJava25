package com.aarya.interfaces;

public interface Automobile {
	public void start();
	public void stop();
	public void changeSpeed();
	public void turn();
	
	default void showMessage()
	{
		System.out.println("Dont drink and drive");
	}

}
