package com.mphasis.cruisestar1.testcasefordaoimpl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.cruisestar.daos.AdminDao;
import com.mphasis.cruisestar.entities.Admin;

public class TestAdminDao {
	
	@Autowired
	AdminDao adminDao;
	

	@Test(expected=NullPointerException.class)
	public void test() {
		Admin admin=adminDao.login("ss", "123");
		assertNull(admin);
		
		Admin admin1=adminDao.login("Supriya", "46778");
		assertEquals(admin1.getAdminname(), "Supriya");
		assertEquals(admin1.getPassword(), "46778");
		
		Admin admin2=adminDao.login("Supriya", "46778");
		assertEquals(admin2.getAdminname(), "Supriya");
		assertEquals(admin2.getPassword(), "467791");
	}

}
