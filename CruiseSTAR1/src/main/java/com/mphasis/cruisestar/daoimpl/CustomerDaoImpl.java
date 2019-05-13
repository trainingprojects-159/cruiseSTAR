package com.mphasis.cruisestar.daoimpl;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.CustomerDao;
import com.mphasis.cruisestar.entities.Customer;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean login(String username, String password) {
		Session session = sessionFactory.openSession();
		TypedQuery<Customer> query = session.createQuery("from Customer where username=:username and password=:password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		int i=query.executeUpdate();
		if(i>0)
	    return true;
		else
	    return false;

	}
  public Customer register(Customer customer) {
		Session session =sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(customer);
		tr.commit();
		return customer;
		}
  
  
  
	}
