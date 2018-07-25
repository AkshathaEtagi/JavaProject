package com.deloitte.cui;

public class Harbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harbour har=new Harbour();
		RiverBarge barge= new RiverBarge();
		SeaPlane sea= new SeaPlane();
		
		har.DockPerm(barge);
	}

	private void DockPerm(Sailer s) {
		s.dock();
	}
}
