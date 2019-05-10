package com.mphasis.cruisestar.daos;

import com.mphasis.cruisestar.entities.Admin;

public interface AdminDao {

	public Admin login(String adminname,String password);	

}
 