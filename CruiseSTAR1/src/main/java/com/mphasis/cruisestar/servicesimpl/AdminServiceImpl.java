package com.mphasis.cruisestar.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cruisestar.daos.AdminDao;
import com.mphasis.cruisestar.entities.Admin;
import com.mphasis.cruisestar.services.AdminService;
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDao adminDao;
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	public Admin adminlogin(String adminname, String password) {
		return adminDao.login(adminname, password);
	}
	
	

}
