package com.shivam.flightreservation.dao;

import java.util.HashMap;

import com.shivam.flightreservation.model.Flight;
import com.shivam.flightreservation.model.Reservation;

public class ReservationDaoImpl implements ReservationDao{

	HashMap<Long, Flight> flights=new HashMap<Long, Flight>();
	HashMap<Long, Reservation> reservations = new HashMap<Long, Reservation>();
	long reservationId;
	
	public ReservationDaoImpl() {
		flights = new HashMap<>();
		Flight flight1= new Flight();
		flight1.setId(1l);
		flight1.setFlightNumber("123");
		flight1.setOperatingAirlines("American");
		flight1.setArrivalCity("Newyork");
		flight1.setDateAndTimeOfDeparture("05/22/2025 9PM");
		
		flights.put(flight1.getId(), flight1);
		
		Flight flight2= new Flight();
		flight2.setId(2l);
		flight2.setFlightNumber("1234");
		flight2.setOperatingAirlines("American");
		flight2.setArrivalCity("SanDiago");
		flight2.setDateAndTimeOfDeparture("07/22/2025 3PM");
		
		flights.put(flight1.getId(), flight1);
	}
	@Override
	public Reservation bookFlight(Reservation reservation) {
		Flight flight = flights.get(reservation.getFlightId());
		reservation.setFlight(flight);
		reservationId+=1;
		reservations.put(reservationId,reservation);
		return reservation;
	}
	@Override
	public Reservation checkIn(long reservationId, int noOfBags) {
		Reservation reservation = reservations.get(reservationId);
		reservation.setNoOfBags(noOfBags);
		reservation.setCheckedIn(true);
		return reservation;
	}
	
}
