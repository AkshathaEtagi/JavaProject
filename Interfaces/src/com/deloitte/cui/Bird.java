package com.deloitte.cui;

public class Bird extends Animal implements Flyer{

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Bird taking off");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Bird landing");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird flying");
	}
	
	public void buildNest() {
		System.out.println("Building the nest");
	}
	public void layEggs() {
		System.out.println("Laying eggs");
	}

}
