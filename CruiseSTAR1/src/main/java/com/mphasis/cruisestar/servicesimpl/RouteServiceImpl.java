package com.mphasis.cruisestar.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cruisestar.daos.RouteDao;
import com.mphasis.cruisestar.entities.Route;
import com.mphasis.cruisestar.services.RouteService;
@Service
public class RouteServiceImpl implements RouteService{

	@Autowired
	RouteDao routeDao;
	public void setRouteDao(RouteDao routeDao) {
		this.routeDao = routeDao;
	}

	public void insertRoute(Route route) {
		routeDao.addRoute(route);
	}

	public void updateRoute(Route route) {
		routeDao.editRoute(route);
		
	}

	public void deleteRoute(int routeid) {
		routeDao.deleteRoute(routeid);
		
	}

	public List<Route> getAllRoutes() {
		
		return routeDao.getAllRoutes();
	}

	public Route getRouteById(int routeid) {
		return routeDao.getRouteById(routeid);
	}

	public List<Route> viewSchedule(String source, String destination) {

		return routeDao.viewSchedule(source, destination);
	}
	
	

}
