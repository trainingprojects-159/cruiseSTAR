package com.mphasis.cruisestar.services;

import java.util.List;

import com.mphasis.cruisestar.entities.Passenger;
import com.mphasis.cruisestar.exceptions.ShipException;

public interface PassengerService {

	public List<Passenger> getAllPassengersList() throws ShipException;
	public Passenger getPassengerByTheirId(int passengerid) throws ShipException;
	public void insertPassenger(Passenger passenger) throws ShipException;
}
