package com.mphasis.cruisestar.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	private int locationid;
	private String locationname;
//	
//	@OneToMany(mappedBy="source",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@JsonIgnore
//	private List<Route> sourceroute;
//	
//	@OneToMany(mappedBy="destination",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@JsonIgnore
//	private List<Route> destinationroute;
	
	@ManyToOne
	private Admin admin;
	
	
	
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	
//	public List<Route> getSourceroute() {
//		return sourceroute;
//	}
//	public void setSourceroute(List<Route> sourceroute) {
//		this.sourceroute = sourceroute;
//	}
//	public List<Route> getDestinationroute() {
//		return destinationroute;
//	}
//	public void setDestinationroute(List<Route> destinationroute) {
//		this.destinationroute = destinationroute;
//	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
	
}
