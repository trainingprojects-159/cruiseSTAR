package com.mphasis.cruisestar.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.cruisestar.daos.AdminDao;
import com.mphasis.cruisestar.entities.Admin;
import com.mphasis.cruisestar.services.AdminService;

public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDao adminDao;
	public Admin adminlogin(String adminname, String password) {
		return adminDao.login(adminname, password);
	}
	
	

}
