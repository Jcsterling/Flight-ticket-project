package com.qa.FlightBooking;

public class Passenger {
	
	
	private String name;
	
	
	public Passenger() {
		
		name = "unknown T";
	}
	
	public Passenger(String name) {
		setName(name);
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Passenger name: " + name;
	}
	
	
	

}
