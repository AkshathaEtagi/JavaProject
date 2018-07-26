package com.deloitte.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

class Address implements Comparable{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	private int id;
	
	Address(String n, String s, String c, String st, String cd){
		name=n;
		street=s;
		city=c;
		state=st;
		code=cd;
	}
	
	public String toString() {
		return name + "\n" +street+ "\n" + city + " " +state+ " " +code;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Address casted=(Address)obj;
		if (this.name==casted.name && this.street==casted.street && this.city==casted.city && this.state==casted.state && this.code==casted.code)
							return true;
		else		return false;
  
    
   
	}
	@Override
	public int hashCode() {
		return this.id;
	}
}


public class MainClass {

	public static void main(String[] args) {
		
		Set<Address> ml= new HashSet<Address>();
		
		//add elements to the linked list
		ml.add(new Address("J.W West", "11 Oak Ave", "Urbana", "IL","61001"));
	//	ml.add(new Address("Ralph Baker", "1542 Maple Lane", "Mahome", "IL","61853"));
		ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL","61820"));
		ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL","61820"));
		
		System.out.print("Original contents of al: "); 

	    Iterator<Address> itr = ml.iterator(); 
	    while(itr.hasNext()) { 
	      Address element = itr.next();
	    
	      System.out.println(element); 
	    } 
	    System.out.println();
		
		
	}
}
