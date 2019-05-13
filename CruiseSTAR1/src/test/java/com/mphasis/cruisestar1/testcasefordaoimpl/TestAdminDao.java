package com.mphasis.cruisestar1.testcasefordaoimpl;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mphasis.cruisestar.configurations.AppConfig;
import com.mphasis.cruisestar.daos.AdminDao;
import com.mphasis.cruisestar.daos.PassengerDao;
import com.mphasis.cruisestar.entities.Admin;
import com.mphasis.cruisestar.exceptions.ShipException;


@RunWith(SpringJUnit4ClassRunner.class) // spring provides junit
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration 
@Transactional // insert ... operations used 
public class TestAdminDao {
	
	@Autowired
	AdminDao adminDao;
	@Autowired
	PassengerDao passengerDao; 
	@Test
	public void test() throws ShipException{
	
		Admin admin=adminDao.login("Admin", "123");
		assertEquals(admin.getAdminname(),"Admin");
		assertEquals(admin.getPassword(),"123");
		
		
		Admin adm = new Admin();
		adm.setAdminname("Admin1");
		adm.setPassword("123");
		
		adminDao.login("Admin1", "123");
		assertEquals(admin.getAdminname(), "Admin1");
		assertEquals(admin.getPassword(), "123");
		
	}

}
