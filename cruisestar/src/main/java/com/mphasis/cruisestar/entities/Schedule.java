package com.mphasis.cruisestar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Schedule {
	
	@Id
	
	private String scheduleid;
	private String currentdate;	
	private String bookingdate;
	private String scheduledays;
	
	private Ship shipid; //fk

	@OneToOne
	private Ship ship;
	

	public String getScheduleid() {
		return scheduleid;
	}


	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
	}


	public String getCurrentdate() {
		return currentdate;
	}


	public void setCurrentdate(String currentdate) {
		this.currentdate = currentdate;
	}


	public String getBookingdate() {
		return bookingdate;
	}


	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}


	public String getScheduledays() {
		return scheduledays;
	}


	public void setScheduledays(String scheduledays) {
		this.scheduledays = scheduledays;
	}


	public Ship getShipid() {
		return shipid;
	}


	public void setShipid(Ship shipid) {
		this.shipid = shipid;
	}


	public Ship getShip() {
		return ship;
	}


	public void setShip(Ship ship) {
		this.ship = ship;
	}
	
	
	
}
