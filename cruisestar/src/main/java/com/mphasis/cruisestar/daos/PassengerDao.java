package com.mphasis.cruisestar.daos;

import com.mphasis.cruisestar.entities.Passenger;

public interface PassengerDao {
	
	public Passenger getAllPassengers();
	public void getPassengerById(int passengerid);
	public void addPassenger(Passenger passenger);
}
