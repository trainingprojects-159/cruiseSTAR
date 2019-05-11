package com.mphasis.cruisestar.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cruisestar.daos.PassengerDao;
import com.mphasis.cruisestar.entities.Passenger;
import com.mphasis.cruisestar.exceptions.ShipException;
import com.mphasis.cruisestar.services.PassengerService;
@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	PassengerDao passengerDao;
	
	public void setPassengerDao(PassengerDao passengerDao) throws ShipException{
		this.passengerDao = passengerDao;
	}

	public List<Passenger> getAllPassengersList() throws ShipException {
		
		return passengerDao.getAllPassengers();
	}

	public Passenger getPassengerByTheirId(int passengerid) throws ShipException {
		
		return passengerDao.getPassengerById(passengerid);
	}

	public void insertPassenger(Passenger passenger) throws ShipException {
		passengerDao.addPassenger(passenger);

	}

}
