package com.deloitte.cui;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airport air= new Airport();
		Helicopter copter= new Helicopter();
		SeaPlane sea= new SeaPlane();
		Superman supers= new Superman();
		air.giveLandingPermission(copter);
		air.giveLandingPermission(sea);
		air.giveLandingPermission(supers);
	}
	
	
	public void giveLandingPermission(Flyer f) {
		f.land();
	}

}
