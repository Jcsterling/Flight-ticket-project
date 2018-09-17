package com.qa.FlightBooking;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeatTest {

	@Test
	public void testSeat() {
		Seat testSeat1 = new Seat();
		assertEquals(27, testSeat1.getSeatNumber());
	}
	@Test
	public void testSetSeatNumber() {
		Seat testSeat2 = new Seat();
		testSeat2.setSeatNumber(49);
		assertEquals(49, testSeat2.getSeatNumber());

		
	}

}
