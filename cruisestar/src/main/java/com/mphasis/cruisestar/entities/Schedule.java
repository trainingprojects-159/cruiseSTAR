package com.mphasis.cruisestar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Schedule {
	
	@Id
	
	private String scheduleid;
	private String bookingdate;
	private String scheduledate;
	
	

	@OneToOne
	@JoinColumn(name="shipud")
	private Ship ship;
	

	public String getScheduleid() {
		return scheduleid;
	}


	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
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
