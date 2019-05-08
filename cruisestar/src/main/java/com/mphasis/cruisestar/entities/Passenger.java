package com.mphasis.cruisestar.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Passenger {

	@Id
	private long aadharno;
	private String passengername;
	private int age;
	private String gender;
	private String bookingdate;
	private String seatno;
	
	private Schedule scheduleid; //fk

	
	
	@OneToMany(mappedBy="Passenger",cascade=CascadeType.ALL)
	private List<Ticket> tickets;
	
	@ManyToOne
	private Admin admin;
	
	@ManyToMany(mappedBy="Passenger",cascade=CascadeType.ALL)
	private Ship ships;
	
	
	
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

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Ship getShips() {
		return ships;
	}

	public void setShips(Ship ships) {
		this.ships = ships;
	}
	
	
	
}
