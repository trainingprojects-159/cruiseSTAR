package com.mphasis.cruisestar.daoimpl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.PassengerDao;
import com.mphasis.cruisestar.entities.Passenger;
@Repository
@Transactional
public class PassengerDaoImpl implements PassengerDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionFactory = sessionfactory;
	}

	
	public List<Passenger> getAllPassengers() {
		Session session = sessionFactory.openSession();
	//	Transaction transaction = session.beginTransaction();
		List<Passenger> passengers = session.createQuery("from Passenger",Passenger.class).list();
	//	transaction.commit();
		session.close();
		return passengers;
	}

	public Passenger getPassengerById(int passengerid) {
		Session session = sessionFactory.openSession();
	//	Transaction transaction = session.beginTransaction();
		Passenger p = (Passenger)session.get(Passenger.class, passengerid);
	//	transaction.commit();
		session.close();
		return p;
		

	}

	public void addPassenger(Passenger passenger) {
	
		Session session = sessionFactory.openSession();	
	//	Transaction transaction = session.beginTransaction();
		session.save(passenger);
		session.close();
	//	transaction.commit();
		
		
	}

}
