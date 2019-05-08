package com.mphasis.cruisestar.daos;

import java.util.List;

import com.mphasis.cruisestar.entities.Customer;
import com.mphasis.cruisestar.entities.Passenger;
import com.mphasis.cruisestar.entities.Ship;
import com.mphasis.cruisestar.entities.Ticket;

public interface CustomerDao {

	public boolean login(String username, String password);

	public Customer register(Customer customer);



	



	

}
