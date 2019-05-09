package com.mphasis.cruisestar.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mphasis.cruisestar.daos.CustomerDao;
import com.mphasis.cruisestar.entities.Customer;
import com.mphasis.cruisestar.services.CustomerServices;


@Service
public class CustomerServicesImpl implements CustomerServices {
	@Autowired
	CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public boolean loginServices(String username, String password) {

		return customerDao.login(username, password);
	}

	public Customer registerServices(Customer customer) {

		return customerDao.register(customer);
	}

}
