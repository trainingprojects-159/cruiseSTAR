package com.mphasis.cruisestar.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.cruisestar.services.AdminService;

public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminService adminService;
	public boolean adminlogin(String adminname, String password) {
		return adminService.adminlogin(adminname, password);
	}
	
	

}
