package com.deloitte.livingbeings;

import com.deloitte.livingbeings.organs.Eye;

public class human extends Mammals {
	public HumanEye leftEye, rightEye; //fields
	
	public human(){
		leftEye= new HumanEye();
		rightEye= new HumanEye();
	}
	
	public class HumanEye extends Eye{
		
	}

}
