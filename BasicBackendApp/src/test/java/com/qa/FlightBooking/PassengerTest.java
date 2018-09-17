package com.qa.FlightBooking;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassengerTest {

	@Test
	public void testPassenger() {
		Passenger testPassenger = new Passenger();
		String result = testPassenger.getName();
		assertEquals("unknown T", result);
	}


	@Test
	public void testSetName() {
		Passenger passenger2 = new Passenger();
		passenger2.setName("hommerton B");
		assertEquals("hommerton B", passenger2.getName());
	}

}
