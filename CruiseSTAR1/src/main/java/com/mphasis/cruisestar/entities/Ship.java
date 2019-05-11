package com.mphasis.cruisestar.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mphasis.cruisestar.util.StringPrefixedSequenceIdGenerator;



@Entity
public class Ship {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Ship_seq")
    @GenericGenerator(
        name = "Ship_seq", 
        strategy = "com.mphasis.cruisestar.util.StringPrefixedSequenceIdGenerator", 
        parameters = {
            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "10"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "SH"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	private String shipid;
	private String shipname;
	private int seatcapacity;
	private int reservecapacity;
	private double travelduration;

	
	@OneToMany(mappedBy="ship",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Passenger> passengers;
	
	@ManyToOne
	private Admin admin;
	
	@OneToMany(mappedBy="ship",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Ticket> tickets;
	

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

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


	
}
