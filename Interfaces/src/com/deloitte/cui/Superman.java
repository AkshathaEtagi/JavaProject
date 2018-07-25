package com.deloitte.cui;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Superman taking off");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Superman landing");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Superman flying");
	}
	
	public void leapBuilding() {
		System.out.println("Leaping off a building");
		
	}
	public void stopBullet() {
		System.out.println("Stopping a bullet");
	}

}
