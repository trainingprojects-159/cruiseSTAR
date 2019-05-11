package com.mphasis.cruisestar.daos;

import java.util.List;

import com.mphasis.cruisestar.entities.Passenger;

public interface PassengerDao {
	
	public List<Passenger> getAllPassengers();
	public Passenger getPassengerById(int passengerid);
	public void addPassenger(Passenger passenger);
}
