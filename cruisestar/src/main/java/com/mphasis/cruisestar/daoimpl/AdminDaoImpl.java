package com.mphasis.cruisestar.daoimpl;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.AdminDao;
import com.mphasis.cruisestar.entities.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Admin login(String adminname, String password)
	{
		Session session=sessionFactory.getCurrentSession();
		TypedQuery<Admin> query=session.createQuery("from Admin where adminname =: adminname and password =: password");
		query.setParameter("username", adminname);
		query.setParameter("password", password);
		Admin admin = (Admin) query.getSingleResult();
		return admin;
	}

}
