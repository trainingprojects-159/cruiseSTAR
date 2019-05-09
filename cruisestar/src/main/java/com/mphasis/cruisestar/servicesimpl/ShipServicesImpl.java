package com.mphasis.cruisestar.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cruisestar.daos.ShipDao;
import com.mphasis.cruisestar.entities.Ship;
import com.mphasis.cruisestar.services.ShipServices;
@Service
public class ShipServicesImpl implements ShipServices {
	@Autowired
	
	public ShipDao shipdao;
	public void setShipDao(ShipDao shipDao) {
		this.shipdao = shipDao;
	}

	public void addShip(Ship ship) {
		System.out.println("Ship values in services"+ship.getShipid());
		shipdao.addShip(ship);
		
	}

	public void editShip(Ship ship) {
	shipdao.editShip(ship);
		
	}

	public void deleteShip(int shipid) {
		shipdao.deleteShip(shipid);
		
	}

	public List<Ship> getAllShips() {
		
		return shipdao.getAllShips();
	}

	public Ship getShipById(int shipid) {
		
		return  shipdao.getShipById(shipid);
	}

	public List<Ship> searchShips(Ship ship) {
		
		return  shipdao.searchShips(ship);
	}

	public Ship searchBySchedule(int scheduleid) {
			return shipdao.searchBySchedule(scheduleid);
	}

}
