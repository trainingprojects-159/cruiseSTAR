package com.mphasis.cruisestar.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Ship {

	@Id
	
	private String shipid;
	private String shipname;
	private int seatcapacity;
	private int reservecapacity;
	private double travelduration;

	private Route routeid; // fk

	
	@OneToOne
	private Schedule schedule;
	
	@OneToMany(mappedBy="Ship",cascade=CascadeType.ALL)
	private List<Passenger> passengers;
	
	@ManyToOne
	private Admin admin;
	
	@OneToOne
	private Route route;
	
	
	
	public String getShipid() {
		return shipid;
	}

	public void setShipid(String shipid) {
		this.shipid = shipid;
	}

	public String getShipname() {
		return shipname;
	}

	public void setShipname(String shipname) {
		this.shipname = shipname;
	}

	public int getSeatcapacity() {
		return seatcapacity;
	}

	public void setSeatcapacity(int seatcapacity) {
		this.seatcapacity = seatcapacity;
	}

	public int getReservecapacity() {
		return reservecapacity;
	}

	public void setReservecapacity(int reservecapacity) {
		this.reservecapacity = reservecapacity;
	}

	public double getTravelduration() {
		return travelduration;
	}

	public void setTravelduration(double travelduration) {
		this.travelduration = travelduration;
	}

	public Route getRouteid() {
		return routeid;
	}

	public void setRouteid(Route routeid) {
		this.routeid = routeid;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	
	
}
