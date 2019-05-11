package com.mphasis.cruisestar.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.ShipDao;
import com.mphasis.cruisestar.entities.Route;
import com.mphasis.cruisestar.entities.Schedule;
import com.mphasis.cruisestar.entities.Ship;


@Repository
@Transactional
public class ShipDaoImpl implements ShipDao {
	@Autowired
	SessionFactory sessionFactory;

public void setSessionFactory(SessionFactory sessionFactory) {
 this.sessionFactory = sessionFactory;
}

public void addShip(Ship ship) {
 Session session = sessionFactory.openSession();
 Transaction tr=session.beginTransaction();
 System.out.println(ship.getShipid()+"ship values in dao");
 session.save(ship);
 tr.commit();
}

public void editShip(Ship ship) {
 Session session = sessionFactory.openSession();
 Transaction tr=session.beginTransaction();
 session.update(ship);
 tr.commit();
 session.close();
}

public void deleteShip(int shipid) {
 Session session = sessionFactory.openSession();
 Transaction tr=session.beginTransaction();
 Ship c=(Ship)session.get(Ship.class, shipid);
 session.delete(c);
 tr.commit();
 
}


public List<Ship> getAllShips() {
 Session session =sessionFactory.openSession();
 Transaction tr=session.beginTransaction();
 List<Ship> ship=session.createQuery("from Ship",Ship.class).list();
 tr.commit();
 session.close();
 return ship;
}

public Ship getShipById(int shipid) {
 Session session = sessionFactory.openSession();
 Transaction tr=session.beginTransaction();
 Ship s=(Ship)session.get(Ship.class, shipid);
 tr.commit();
 return s;
}


public List<Ship> searchShips(String source,String destination) {
 Session session = sessionFactory.openSession();
 Transaction tr=session.beginTransaction();
 List<Ship> s=session.createNativeQuery("select * from ship where routeid=(select routeid from route where source=:source and destination=:destination)").list();
// //HQL
// Query<Route> route=session.createQuery("from Route where source=:source and destination=:destination",Route.class);
// 	route.setParameter("source", source);
// 	route.setParameter("destination", destination);
// 	Query<Ship> ships=session.createQuery("from Ship where route=:route",Ship.class);
// 	ships.setParameter("route", route);
// 	List<Ship> ship=ships.getResultList();
// 	
// 	//
// 	Criteria cr=session.createCriteria(Route.class);
// 	cr.add(Restrictions.eq("source", source));
// 	cr.add(Restrictions.eq("destination", destination));
// 	cr.add(Restrictions.and(source,destination));
// 	
 tr.commit();
 return s;
}

public List<Ship> searchBySchedule(Schedule schedule) {
 Session session=sessionFactory.openSession();
 Transaction tr= session.beginTransaction();
 List<Ship> ships=session.createQuery("from Ship",Ship.class).list();
 tr.commit();
 return ships;
}

}