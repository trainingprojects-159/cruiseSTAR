package com.mphasis.cruisestar.services;

import java.util.List;

import com.mphasis.cruisestar.entities.Schedule;
import com.mphasis.cruisestar.entities.Ship;

public interface ShipServices {
	
	public void addShip(Ship ship);
	public void editShip(Ship ship);
	public void deleteShip(int shipid);
	public List<Ship> getAllShips();
	public Ship getShipById(int shipid);
	public List<Ship> searchShips(Ship ship);
	public Ship searchBySchedule(int scheduleid);
	
	
}
