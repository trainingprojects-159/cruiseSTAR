package com.mphasis.cruisestar.services;

import java.util.List;

import com.mphasis.cruisestar.entities.Route;

public interface RouteService {
	public void insertRoute(Route route);
	public void updateRoute(Route route);
	public void deleteRoute(int routeid);
	public List<Route> getAllRoutes();
	public Route getRouteById(int routeid);
	public List<Route> viewSchedule(String source,String destination);

}
