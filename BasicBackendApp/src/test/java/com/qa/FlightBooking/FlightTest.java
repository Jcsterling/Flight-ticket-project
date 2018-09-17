package com.qa.FlightBooking;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {

	@Test
	public void testFlight() {
		Flight testFlight1 = new Flight();
		assertEquals("generic departure city", testFlight1.getDepartureCity());
		assertEquals("generic arival city", testFlight1.getArivalCity());
		assertEquals(100, testFlight1.getFlightNumber());
	}
	@Test
	public void testSetDepartureCity() {
		Flight testFlight2 = new Flight();
		testFlight2.setDepartureCity("torronto");
		assertEquals("torronto", testFlight2.getDepartureCity());
		
	}
	@Test
	public void testSetArivalCity() {
		Flight testFlight3 = new Flight();
		testFlight3.setArivalCity("chicago");
		assertEquals("chicago", testFlight3.getArivalCity());
		
	}
	@Test
	public void testSetFlightnumber() {
		Flight testFlight4 = new Flight();
		testFlight4.setFlightNumber(1000);
		assertEquals(1000, testFlight4.getFlightNumber());
		
	}

}
