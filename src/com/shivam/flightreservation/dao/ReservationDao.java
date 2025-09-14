package com.shivam.flightreservation.dao;

import com.shivam.flightreservation.model.Reservation;

public interface ReservationDao {
Reservation bookFlight(Reservation reservation);
Reservation checkIn(long reservationId, int noOfBags);
}
