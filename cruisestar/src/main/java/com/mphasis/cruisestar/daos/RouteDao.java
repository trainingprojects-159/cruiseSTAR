package com.mphasis.cruisestar.daos;

import com.mphasis.cruisestar.entities.Route;

public interface RouteDao {

	public void addRoute(Route route);
	public void editRoute(Route route);
	public void deleteRoute(int routeid);
	public Route getAllRoutes();
	public void getRouteById(int routeid);
}
