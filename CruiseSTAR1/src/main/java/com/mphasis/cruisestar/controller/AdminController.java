package com.mphasis.cruisestar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.cruisestar.entities.Admin;
import com.mphasis.cruisestar.entities.Location;
import com.mphasis.cruisestar.entities.Route;
import com.mphasis.cruisestar.entities.Schedule;
import com.mphasis.cruisestar.entities.Ship;
import com.mphasis.cruisestar.services.AdminService;
import com.mphasis.cruisestar.services.LocationService;
import com.mphasis.cruisestar.services.RouteService;
import com.mphasis.cruisestar.services.ScheduleService;
import com.mphasis.cruisestar.services.ShipServices;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	@Autowired
	ShipServices shipServices;
	@Autowired
	RouteService routeService;
	@Autowired
	ScheduleService scheduleService;
	@Autowired
	LocationService locationService;			
	
	

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public void setShipServices(ShipServices shipServices) {
		this.shipServices = shipServices;
	}

	public void setRouteService(RouteService routeService) {
		this.routeService = routeService;
	}

	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}
	
	public void setLocationService(LocationService locationService) {
		this.locationService = locationService;
	}

	
	//admin
	
	@RequestMapping(value = "/login/{adminname}/{password}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Admin login(@PathVariable("adminname") String adminname, @PathVariable("password") String password) 
	{
		/*if(adminname==null || password==null) {
			
		}*/
		Admin admin = adminService.adminlogin(adminname, password);
		return admin;
	} 
	
	
	//ship

	@RequestMapping(value = "/ship/add", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void addShip(@RequestBody Ship ship) {
		this.shipServices.addShip(ship);
	}

	@RequestMapping(value = "/ship/edit", method = RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void editShip(@RequestBody Ship ship) {
		this.shipServices.editShip(ship);
	}

	@RequestMapping(value = "/ship/{shipid}", method = RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void deleteShip(@PathVariable("shipid") int shipid) {
		this.shipServices.deleteShip(shipid);
	}

	@RequestMapping(value = "/ships", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Ship> getAllShips() {
		return this.shipServices.getAllShips();
	}
	
	@RequestMapping(value = "/ships/search/{source}/{destination}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Ship> searchShips(@PathVariable("source")String source,@PathVariable("source")String destination) {
		return this.shipServices.searchShips(source,destination);
	}
	
	@RequestMapping(value = "/ships/searchBySchedule", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Ship> searchBySchedule(Schedule schedule) {
		return this.shipServices.searchBySchedule(schedule);
	} 
	
	
	//route
	
	@RequestMapping(value = "/route/add", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void addRoute(@RequestBody Route route) {
		this.routeService.insertRoute(route);
	}

	@RequestMapping(value = "/route/{routeid}", method = RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void editRoute(@PathVariable("routeid") String routeid, @RequestBody Route route) {
		this.routeService.updateRoute(route);
	}

	@RequestMapping(value = "/route/{routeid}", method = RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void deleteRoute(@PathVariable("routeid") int routeid) {
		this.routeService.deleteRoute(routeid);
	}

	@RequestMapping(value = "/routes", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Route> getAllRoutes() {
		return this.routeService.getAllRoutes();
	}

	
	//schedule
	
	@RequestMapping(value = "/schedule/add", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void addSchedule(@RequestBody Schedule schedule) {
		this.scheduleService.addSchedule(schedule);
	}

	/*
	 * @RequestMapping(value="/schedule/delete",method=RequestMethod.DELETE) public
	 * void deleteSchedule(int scheduleid) {
	 * this.scheduleService.deleteSchedule(scheduleid); }
	 */

	@RequestMapping(value = "/schedules", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public void getAllSchedule() {
		this.scheduleService.getSchedules();
	}

	
	//location
	
	@RequestMapping(value = "/location/add", method = RequestMethod.POST)
	public void addLocation(@RequestBody Location location) {
		
		this.locationService.addLocation(location);
	}
	
	@RequestMapping(value = "/location/{locationid}", method = RequestMethod.PUT)
	public void editLocation(@PathVariable("locationid") int locationid, @RequestBody Location location)
	{
	this.locationService.editLocation(location);
	}

	@RequestMapping(value = "/location/{locationid}", method = RequestMethod.DELETE)
	public void deleteLocation(@PathVariable("locationid") int locationid) {
		this.locationService.deleteLocation(locationid);
	}
	
	@RequestMapping(value = "/locations", method = RequestMethod.GET)
	public List<Location> getAllLocations() {
		return this.locationService.getAllLocations();
	}
	
	
}
	

