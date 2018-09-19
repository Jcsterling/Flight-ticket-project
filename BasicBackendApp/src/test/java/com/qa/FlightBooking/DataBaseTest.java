package com.qa.FlightBooking;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataBaseTest {

	@Test
	public void testConstructor() {
		DataBase testDB = new DataBase();
		assertEquals(0, testDB.getSeats().size());
		assertEquals(0, testDB.getFlights().size());
		assertEquals(0, testDB.getPassengers().size());
		assertEquals(0, testDB.getTickets().size());


	}
	@Test
	public void testAddSeat() {
		DataBase testDB2 = new DataBase();
		testDB2.addSeat(17);
		
		assertEquals(1, testDB2.getSeats().size() );
		
		assertEquals(17, testDB2.getSeats().get(0).getSeatNumber());
		
	}
	
	@Test
	public void testAddPassenger() {
		DataBase testDB3 = new DataBase();
		testDB3.addPassenger("captain falcon");
		
		assertEquals(1, testDB3.getPassengers().size());
		
		assertEquals("captain falcon", testDB3.getPassengers().get(0).getName());
		
	}
	@Test
	public void testAddFlight() {
		DataBase testDB4 = new DataBase();
		testDB4.addFlight("london", "minisota", 503);
		
		assertEquals(1, testDB4.getFlights().size());
		
		assertEquals("london", testDB4.getFlights().get(0).getDepartureCity());
		assertEquals("minisota", testDB4.getFlights().get(0).getArivalCity());
		assertEquals(503, testDB4.getFlights().get(0).getFlightNumber());

		
	}
	@Test
	public void testBootstrap() {
		DataBase testDB5 = new DataBase();
		testDB5.bootStrap();
		assertEquals(5, testDB5.getSeats().size());
		assertEquals(6, testDB5.getFlights().size());
		assertEquals(5, testDB5.getPassengers().size());

	}
}
