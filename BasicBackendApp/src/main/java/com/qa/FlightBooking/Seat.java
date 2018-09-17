package com.qa.FlightBooking;

public class Seat {

	private int seatNumber;

	public Seat() {
		seatNumber = 27;
	}
	
	public Seat(int seatNumber) {
		setSeatNumber(seatNumber);
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return seatNumber + "";
	}

}
