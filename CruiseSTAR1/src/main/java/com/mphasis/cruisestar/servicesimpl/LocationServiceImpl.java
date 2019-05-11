package com.mphasis.cruisestar.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cruisestar.daos.LocationDao;

import com.mphasis.cruisestar.entities.Location;
import com.mphasis.cruisestar.services.LocationService;


@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationDao locationDao;
	
	
	public void setLocationDao(LocationDao locationDao)
	{
		this.locationDao=locationDao;
	}
	
	public void addLocation(Location location) {
		locationDao.addLocation(location);

	}

	public void editLocation(Location location) {
		locationDao.editLocation(location);
	}

	public void deleteLocation(int locationid) {
		locationDao.deleteLocation(locationid);

	}

	public List<Location> getAllLocations() {
		return locationDao.getAllLocations();
	}

	public Location getLocationById(int locationid) {
		return locationDao.getLocationById(locationid);
	}

}
