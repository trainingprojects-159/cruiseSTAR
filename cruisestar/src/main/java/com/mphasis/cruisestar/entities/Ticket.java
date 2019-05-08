package com.mphasis.cruisestar.entities;




import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToOne;



@Entity
public class Ticket {

	@Id
	private String ticketid;
	private String status;
	
	private String scheduleid; //fk
	private String aadharno; //fk
	private String routeid; //fk
	
	
	@ManyToOne
	private Customer customer;
	
	@ManyToOne
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
	public String getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getRouteid() {
		return routeid;
	}
	public void setRouteid(String routeid) {
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
