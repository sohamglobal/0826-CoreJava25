package com.praffull.classes;

import com.aarya.interfaces.Automobile;

public class VolkswagenCrosspolo implements Automobile {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("VW started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("VW stopped");
	}

	@Override
	public void changeSpeed() {
		// TODO Auto-generated method stub
		System.out.println("VW direction changed");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("VW turned");
	}

}
