package com.mphasis.cruisestar.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Admin {

	private String adminname;
	private String password;

	
	@OneToMany(mappedBy="Admin",cascade=CascadeType.ALL)
	private List<Ship> ships;
	
	@OneToMany(mappedBy="Admin",cascade=CascadeType.ALL)
	private List<Customer> customers;
	
	@OneToMany(mappedBy="Admin",cascade=CascadeType.ALL)
	private List<Route> routes;
	
	@OneToMany(mappedBy="Admin",cascade=CascadeType.ALL)
	private List<Passenger> passengers;
	
	@OneToMany(mappedBy="Admin",cascade=CascadeType.ALL)
	private List<Location> locations;
	
	
	
	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Ship> getShips() {
		return ships;
	}

	public void setShips(List<Ship> ships) {
		this.ships = ships;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	
	
}
		