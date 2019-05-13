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
		if(passengerid!=0)
		return passengerDao.getPassengerById(passengerid);
		else
		throw new ShipException("Passenger ID is not Invalid");	
	}

	public void insertPassenger(Passenger passenger) throws ShipException {
		if(passenger!=null)
		passengerDao.addPassenger(passenger);
		else
		throw new ShipException("Passenger is not valid");
	}

}
