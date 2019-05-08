package com.mphasis.cruisestar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	private String ticketid;
	private String status;
	private String currentdate;	
	
	public String getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(String currentdate) {
		this.currentdate = currentdate;
	}
	@ManyToOne
	@JoinColumn(name="scheduleid")
	private Schedule scheduleid; //fk
	
	@ManyToOne
	@JoinColumn(name="routeid")
	private Route routeid; //fk
	
	
	@ManyToOne
	@JoinColumn(name="customerid")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="aadharno")
	private Passenger passengers;
	
	
	public String getTicketid() {
		return ticketid;
	}
	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Schedule getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(Schedule scheduleid) {
		this.scheduleid = scheduleid;
	}
	public Route getRouteid() {
		return routeid;
	}
	public void setRouteid(Route routeid) {
		this.routeid = routeid;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Passenger getPassengers() {
		return passengers;
	}
	public void setPassengers(Passenger passengers) {
		this.passengers = passengers;
	}
	
	
	
}
