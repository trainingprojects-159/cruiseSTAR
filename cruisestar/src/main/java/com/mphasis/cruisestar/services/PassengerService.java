package com.mphasis.cruisestar.services;

import java.util.List;

import com.mphasis.cruisestar.entities.Passenger;

public interface PassengerService {

	public List<Passenger> getAllPassengersList();
	public Passenger getPassengerByTheirId(int passengerid);
	public void insertPassenger(Passenger passenger);
}
