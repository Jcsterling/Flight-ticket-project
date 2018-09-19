package com.qa.FlightBooking;

import java.util.ArrayList;

public class DataBase {

	private ArrayList<Seat> seats;
	private ArrayList<Flight> flights;
	private ArrayList<Passenger> passengers;
	private ArrayList<Ticket> tickets;

	public DataBase() {
		flights = new ArrayList<Flight>();
		seats = new ArrayList<Seat>();
		passengers = new ArrayList<Passenger>();
		tickets = new ArrayList<Ticket>();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void addSeat(int seatNumber) {
		seats.add(new Seat(seatNumber));
		// TODO Auto-generated method stub
		
	}

	public void addPassenger(String passengerName) {
		passengers.add(new Passenger(passengerName));
		// TODO Auto-generated method stub
		
	}

	public void addFlight(String departure, String arrival, int flightNo) {
		flights.add(new Flight(departure ,arrival, flightNo));
		// TODO Auto-generated method stub
		
	}
	
	public void bootStrap() {
		addSeat(47);
		addSeat(23);
		addSeat(14);
		addSeat(8);
		addSeat(16);
		
		addFlight("toronto", "london", 219);
		addFlight("chicago", "peru", 211);
		addFlight("mexico", "antigua", 424);
		addFlight("denmark", "lisbon", 36);
		addFlight("jahbuti", "nepal", 539);
		addFlight("sunderland", "heathrow", 28);
		
		addPassenger("joseph");
		addPassenger("mike");
		addPassenger("sonny");
		addPassenger("gabe");
		addPassenger("arthur");


	}

}
