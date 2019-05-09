package com.mphasis.cruisestar.daoimpl;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.AdminDao;

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

	public boolean login(String adminname, String password)
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Admin where adminname =: adminname and password =: password");
		query.setParameter("username", adminname);
		query.setParameter("password", password);
		int i = query.executeUpdate();
		if(i>0) {
		return true;
		}
		else {
			return false;
		}
	}

}
