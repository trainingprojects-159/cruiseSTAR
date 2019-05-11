package com.mphasis.cruisestar.daos;

import java.util.List;

import com.mphasis.cruisestar.entities.Location;

public interface LocationDao {

	public void addLocation(Location location);
	public void editLocation(Location location);
	public void deleteLocation(int locationid);
	public List<Location> getAllLocations();
	public Location getLocationById(int locationid);
	
}
