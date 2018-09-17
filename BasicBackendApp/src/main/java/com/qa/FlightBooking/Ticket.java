package com.qa.FlightBooking;

public class Ticket {

	private Passenger passenger;
	private Flight flight;
	private Seat seat;

	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "Ticket: passenger:" + passenger + ", flight: " + flight + ", seat: " + seat;
	}
	
	

}
