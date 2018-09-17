package com.qa.FlightBooking;

public class Flight {

	private String departureCity;
	private String arivalCity;
	private int flightNumber;

	public Flight() {
		departureCity = "generic departure city";
		arivalCity = "generic arival city";
		flightNumber = 100;
	}
	
	public Flight(String departureCity, String arivalCity, int flightNumber ) {
		setDepartureCity(departureCity);
		setArivalCity(arivalCity);
		setFlightNumber(flightNumber);
		
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArivalCity() {
		return arivalCity;
	}

	public void setArivalCity(String arivalCity) {
		this.arivalCity = arivalCity;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	@Override
	public String toString() {
		return   departureCity + ", " + arivalCity + ", "
				+ flightNumber ;
	}

}
