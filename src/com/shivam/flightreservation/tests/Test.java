package com.shivam.flightreservation.tests;

import com.shivam.flightreservation.dao.ReservationDao;
import com.shivam.flightreservation.dao.ReservationDaoImpl;
import com.shivam.flightreservation.model.Passenger;
import com.shivam.flightreservation.model.Reservation;

public class Test {
public static void main(String[] args) {
	ReservationDao dao= new ReservationDaoImpl();
	Reservation reservation = new Reservation();
	Passenger passenger = new Passenger();
	passenger.setId(123l);
	passenger.setFirstName("shivam");
	passenger.setLastName("verma");
	passenger.setEmail("shivamv2@gmail.com");
	reservation.setPassenger(passenger);
	reservation.setId(1l);
	Reservation savedReservation=dao.bookFlight(reservation);
	System.out.println(savedReservation);
	Reservation checkedInReservation = dao.checkIn(savedReservation.getId(), 2);
	System.out.println(checkedInReservation);
}
}
