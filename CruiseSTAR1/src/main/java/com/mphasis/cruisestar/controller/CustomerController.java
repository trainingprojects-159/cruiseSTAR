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

import com.mphasis.cruisestar.entities.Customer;
import com.mphasis.cruisestar.entities.Passenger;
import com.mphasis.cruisestar.entities.Schedule;
import com.mphasis.cruisestar.entities.Ship;
import com.mphasis.cruisestar.entities.Ticket;
import com.mphasis.cruisestar.exceptions.ShipException;
import com.mphasis.cruisestar.services.CustomerServices;
import com.mphasis.cruisestar.services.PassengerService;
import com.mphasis.cruisestar.services.ScheduleService;
import com.mphasis.cruisestar.services.ShipServices;
import com.mphasis.cruisestar.services.TicketService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerServices customerServices;
	@Autowired
	PassengerService passengerService;
	@Autowired
	ScheduleService scheduleService;
	@Autowired
	ShipServices shipServices;
	@Autowired
	TicketService ticketService;
	

	public void setCustomerServices(CustomerServices customerServices) {
		this.customerServices = customerServices;
	}
	
	@RequestMapping(value="/ships", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Ship> getAllShip() throws ShipException
	{
		return this.shipServices.getAllShips();
	}
	
	@RequestMapping(value="/schedules", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Schedule> getAllSchedules() throws ShipException
	{ 
		return this.scheduleService.getSchedules();
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer registerCustomer(@RequestBody Customer customer) throws ShipException {
		return this.customerServices.registerServices(customer);
		 
	}
	
	@RequestMapping(value = "/login/{username}/{password}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean loginCustomer(@PathVariable("username") String username, @PathVariable("password") String password) throws ShipException
	{
		 return this.customerServices.loginServices(username, password);
	
	
	
	}	
	
	@RequestMapping(value="/passenger/add", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void addPassenger(@RequestBody Passenger passenger) throws ShipException
	{
		this.passengerService.insertPassenger(passenger);
	}
	
	
	@RequestMapping(value="/passengers", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Passenger> getAllPassengers() throws ShipException
	{
		return this.passengerService.getAllPassengersList();
	}
	
	@RequestMapping(value="/ticket/add", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void bookTicket(Ticket ticket) throws ShipException
	{
		 this.ticketService.bookTicket(ticket);
	}
	
	public void setPassengerService(PassengerService passengerService) {
		this.passengerService = passengerService;
	}

	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}

	public void setShipServices(ShipServices shipServices) {
		this.shipServices = shipServices;
	}

	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	@RequestMapping(value="/ticket/{tickteId}", method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void cancelTicket(@PathVariable("tickteId")int ticketid) throws ShipException
	{
		 this.ticketService.cancelledTicket(ticketid);
	}
	
//	
//	@RequestMapping(value = "/ships", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
//	public List<Ship> getAllShips() {
//		return this.shipServices.getAllShips();
//	}
//	
	@RequestMapping(value = "/ships/search/{source}/{destination}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Ship> searchShips(@PathVariable("source")String source,@PathVariable("source")String destination) {
		return this.shipServices.searchShips(source,destination);
	}
	
	@RequestMapping(value = "/ships/searchBySchedule", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Ship> searchBySchedule(Schedule schedule) {
		return this.shipServices.searchBySchedule(schedule);
	} 

}