package com.mphasis.cruisestar.daos;



import com.mphasis.cruisestar.entities.Customer;


public interface CustomerDao 
{

	public boolean login(String username, String password);

	public Customer register(Customer customer);


}
