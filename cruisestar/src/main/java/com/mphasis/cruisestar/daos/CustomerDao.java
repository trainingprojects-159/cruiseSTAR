package com.mphasis.cruisestar.daos;

import java.util.List;

import com.mphasis.cruisestar.entities.Ship;

public interface CustomerDao {

	public List<Ship> searchShips();
	public void addpassenger();
	public void userProfileList();
	public void viewSchedule();
	public void reserveTicket();
	public void cancelTicket();
}
