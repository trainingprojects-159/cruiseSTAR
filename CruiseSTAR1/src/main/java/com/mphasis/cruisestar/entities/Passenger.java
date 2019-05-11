package com.mphasis.cruisestar.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Passenger {

	@Id
	private long aadharno;
	private String passengername;
	private int age;
	private String gender;
	private String bookingdate;
	private String seatno;
	
	@OneToOne
	private Schedule scheduleid; //fk

	
	@ManyToOne
	private Admin admin;
	
	@ManyToOne
	private Ship ship;
	
	
	
	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public String getPassengername() {
		return passengername;
	}

	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}

	public String getSeatno() {
		return seatno;
	}

	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}

	public Schedule getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(Schedule scheduleid) {
		this.scheduleid = scheduleid;
	}

	

	

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	
	
	
	
	
}
