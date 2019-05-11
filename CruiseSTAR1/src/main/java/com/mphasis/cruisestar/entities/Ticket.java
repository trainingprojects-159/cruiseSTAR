package com.mphasis.cruisestar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.mphasis.cruisestar.util.StringPrefixedSequenceIdGenerator;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Ticket_seq")
    @GenericGenerator(
        name = "Ticket_seq", 
        strategy = "com.mphasis.cruisestar.util.StringPrefixedSequenceIdGenerator", 
        parameters = {
            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "10"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "TK"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	private String ticketid;
	private String status;
	private String currentdate;
	
	@ManyToOne
	private Schedule schedule; 
	
	@ManyToOne
	private Route routeid; 
	
	
	@ManyToOne
	private Customer customer;
	
	@OneToOne
	private Passenger passenger;
	
	@ManyToOne
	private Ship ship;
	
	
	public Ship getShip() {
		return ship;
	}
	public void setShip(Ship ship) {
		this.ship = ship;
	}
	public String getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(String currentdate) {
		this.currentdate = currentdate;
	}
	
	
	
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
	
	
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
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
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassengers(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
	
}
