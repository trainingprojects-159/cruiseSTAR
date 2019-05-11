package com.mphasis.cruisestar.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mphasis.cruisestar.util.StringPrefixedSequenceIdGenerator;

@Entity
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Schedule_seq")
    @GenericGenerator(
        name = "Schedule_seq", 
        strategy = "com.mphasis.cruisestar.util.StringPrefixedSequenceIdGenerator", 
        parameters = {
            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "10"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "SE"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	private String scheduleid;
	private String bookingdate;
	private String scheduledate;

	@OneToOne
	private Ship ship;
	
	@OneToMany(mappedBy="schedule",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Ticket> tickets;
	

	public String getScheduleid() {
		return scheduleid;
	}


	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}


	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}


	public String getBookingdate() {
		return bookingdate;
	}


	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}


	


	public String getScheduledate() {
		return scheduledate;
	}


	public void setScheduledate(String scheduledate) {
		this.scheduledate = scheduledate;
	}





	public Ship getShip() {
		return ship;
	}


	public void setShip(Ship ship) {
		this.ship = ship;
	}
	
	
	
}
