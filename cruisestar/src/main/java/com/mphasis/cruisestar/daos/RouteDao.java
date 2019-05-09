package com.mphasis.cruisestar.daos;

import java.util.List;

import com.mphasis.cruisestar.entities.Route;

public interface RouteDao {

	public void addRoute(Route route);
	public void editRoute(Route route);
	public void deleteRoute(int routeid);
	public List<Route> getAllRoutes();
	public Route getRouteById(int routeid);
	public List<Route> viewSchedule(String source,String destination);
}
