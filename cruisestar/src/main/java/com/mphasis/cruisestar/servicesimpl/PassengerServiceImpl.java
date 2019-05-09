package com.mphasis.cruisestar.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cruisestar.daos.PassengerDao;
import com.mphasis.cruisestar.entities.Passenger;
import com.mphasis.cruisestar.services.PassengerService;
@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	PassengerDao passengerDao;
	
	public List<Passenger> getAllPassengersList() {
		
		return passengerDao.getAllPassengers();
	}

	public Passenger getPassengerByTheirId(int passengerid) {
		
		return passengerDao.getPassengerById(passengerid);
	}

	public void insertPassenger(Passenger passenger) {
		passengerDao.addPassenger(passenger);

	}

}
