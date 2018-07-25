package com.deloitte.cui;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("airplane taking off");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("airplane landing");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("airplane flying");
	}
 
}
