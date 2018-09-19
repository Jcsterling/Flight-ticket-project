package com.qa.FlightBooking;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketTest {

	@Test
	public void testSetPassengerName() {
		Ticket testTicket1 = new Ticket();
		Passenger testPassenger1 = new Passenger("mike kelly");
		testTicket1.setPassenger(testPassenger1);
		
		assertEquals("mike kelly", testTicket1.getPassenger().getName());
		
	}
	@Test
	public void testSetFlight() {
		Ticket testTicket2 = new Ticket();
		Flight testFlight1 = new Flight("chicago", "montego", 47);
		testTicket2.setFlight(testFlight1);
		
		assertEquals(testFlight1, testTicket2.getFlight());
		
	}
	@Test
	public void testSetSeat() {
		Seat seat1 = new Seat(49);
		Ticket testTicket3 = new Ticket();
		testTicket3.setSeat(seat1);
		assertEquals(49, testTicket3.getSeat().getSeatNumber());
		
	}
	@Test
	
	public void testToString() {
		Ticket testTicket4 = new Ticket();
		Flight testFlight2 = new Flight("chicago", "montego", 47);
		Seat seat2 = new Seat(49);
		Passenger testPassenger2 = new Passenger("skeng do");
		testTicket4.setSeat(seat2);
		testTicket4.setFlight(testFlight2);
		testTicket4.setPassenger(testPassenger2);
		
		assertEquals("Ticket: passenger:Passenger name: skeng do, flight: chicago, montego, 47, seat: 49", testTicket4.toString());
	}

}
