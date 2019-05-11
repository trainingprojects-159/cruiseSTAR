package com.mphasis.cruisestar.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Admin {

	@Id
	private String adminname;
	private String password;

	
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Ship> ships;
	
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Customer> customers;
	
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Route> routes;
	
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Passenger> passengers;
	
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
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
		