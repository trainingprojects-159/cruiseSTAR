package com.mphasis.cruisestar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(value="/ships", method=RequestMethod.GET)
	public List<Ship> getAllShip()
	{
		return this.shipServices.getAllShips();
	}
	
	@RequestMapping(value="/schedules", method=RequestMethod.GET)
	public List<Schedule> getAllSchedules()
	{ 
		return this.scheduleService.getSchedules();
	}
	
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public Customer registerCustomer(@RequestBody Customer customer) {
		return this.customerServices.registerServices(customer);
		 
	}
	
	@RequestMapping(value = "/home/{username}/{password}", method = RequestMethod.GET)
	public boolean loginCustomer(@PathVariable("username") String username, @PathVariable("password") String password) 
	{
		 return this.customerServices.loginServices(username, password);
	
	
	
	}	
	
	@RequestMapping(value="/passenger/add", method = RequestMethod.POST)
	public void addPassenger(@RequestBody Passenger passenger)
	{
		this.passengerService.insertPassenger(passenger);
	}
	
	
	@RequestMapping(value="/passengers", method=RequestMethod.GET)
	public List<Passenger> getAllPassengers()
	{
		return this.passengerService.getAllPassengersList();
	}
	
	@RequestMapping(value="/ticket/add", method=RequestMethod.POST)
	public Ticket bookTicket(Ticket ticket)
	{
		return this.ticketService.bookTicket(ticket);
	}
	
	@RequestMapping(value="/ticket/{ticketid}", method=RequestMethod.POST)
	public void cancelTicket(int ticketid)
	{
		 this.ticketService.cancelledTicket(ticketid);
	}
	
	
	@RequestMapping(value = "/ships", method = RequestMethod.GET)
	public List<Ship> getAllShips() {
		return this.shipServices.getAllShips();
	}
	
	@RequestMapping(value = "/ships/search/{source}/{destination}", method = RequestMethod.GET)
	public List<Ship> searchShips(@PathVariable("source")String source,@PathVariable("source")String destination) {
		return this.shipServices.searchShips(source,destination);
	}
	
	@RequestMapping(value = "/ships/searchBySchedule", method = RequestMethod.GET)
	public List<Ship> searchBySchedule(Schedule schedule) {
		return this.shipServices.searchBySchedule(schedule);
	} 

}