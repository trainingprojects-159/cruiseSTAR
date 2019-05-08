package com.mphasis.cruisestar.daos;

import com.mphasis.cruisestar.entities.Location;

public interface LocationDao {

	public void addLocation(Location location);
	public void editLocation(Location location);
	public void deleteLocation(int locationid);
	public Location getAllLocations();
	public void getLocationById(int locationid);
	
}
