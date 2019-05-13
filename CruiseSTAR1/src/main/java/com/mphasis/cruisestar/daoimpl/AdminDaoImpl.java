package com.mphasis.cruisestar.daoimpl;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.AdminDao;
import com.mphasis.cruisestar.entities.Admin;

@Repository
@Transactional
public class AdminDaoImpl implements AdminDao {
	
	@Autowired
	SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Admin login(String adminname, String password)
	{
		Session session=sessionFactory.getCurrentSession();
		//Transaction tr=session.beginTransaction();
		TypedQuery<Admin> query=session.createQuery("from Admin where adminname =: adminname and password =: password");
		query.setParameter("adminname", adminname);
		query.setParameter("password", password);
		Admin admin;
		try {
		admin= query.getSingleResult();
		}catch(NoResultException e) {
			throw new NoResultException();
		}
		//tr.commit();
		return admin;
	}


}
