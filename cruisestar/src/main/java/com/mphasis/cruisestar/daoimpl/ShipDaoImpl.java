package com.mphasis.cruisestar.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.ShipDao;
import com.mphasis.cruisestar.entities.Schedule;
import com.mphasis.cruisestar.entities.Ship;


@Repository
@Transactional
public  class ShipDaoImpl implements ShipDao {
	@Autowired
	SessionFactory sessionfactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionfactory = sessionFactory;
	}

	public void addShip(Ship ship) {
		Session session = sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println(ship.getShipid()+"ship values in dao");
		session.save(ship);
		tr.commit();
	}

	public void editShip(Ship ship) {
		Session session = sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(ship);
		tr.commit();
		session.close();
	}

	public void deleteShip(int shipid) {
		Session session = sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		Ship c=(Ship)session.get(Ship.class, shipid);
		session.delete(c);
		tr.commit();
		
	}

	public Ship getAllShips(int shipname) {
		Session session = sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		Ship s=(Ship)session.get(Ship.class, shipname);
		return s;
	
	}

	public void getShipById(int shipid) {
		Session session = sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		Ship s=(Ship)session.get(Ship.class, shipid);
		tr.commit();
		return  ;

	}

	public Ship getAllShips() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Ship> searchShips(Ship ship) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Ship> searchBySchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		return null;
	}

}
