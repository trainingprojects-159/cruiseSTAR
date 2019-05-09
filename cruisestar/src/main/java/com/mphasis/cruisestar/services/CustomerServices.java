package com.mphasis.cruisestar.services;

import com.mphasis.cruisestar.entities.Customer;

public interface CustomerServices {
	public boolean loginServices(String username, String password);

	public Customer registerServices(Customer customer);

}
