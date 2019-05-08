package com.mphasis.cruisestar.daos;

import java.util.List;

import com.mphasis.cruisestar.entities.Schedule;
import com.mphasis.cruisestar.entities.Ship;

public interface ShipDao {

	public void addShip(Ship ship);
	public void editShip(Ship ship);
	public void deleteShip(int shipid);
	public Ship getAllShips();
	public void getShipById(int shipid);
	public List<Ship> searchShips(Ship ship);
	public List<Ship> searchBySchedule(Schedule schedule);
	
}                                                                 
