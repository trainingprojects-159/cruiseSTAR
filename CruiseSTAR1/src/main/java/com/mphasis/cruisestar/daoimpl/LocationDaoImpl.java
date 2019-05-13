package com.mphasis.cruisestar.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.LocationDao;
import com.mphasis.cruisestar.entities.Location;

@Repository
@Transactional
public class LocationDaoImpl implements LocationDao {

	
	@Autowired
	SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	
	public void addLocation(Location location) {
		
		Session session=sessionFactory.openSession();
		//Transaction tr=session.beginTransaction();
		System.out.println(location.getLocationname()+"Location name is ");
		session.save(location);
		//tr.commit();

	}

	public void editLocation(Location location) {
		
		Session session=sessionFactory.openSession();
	//	Transaction tr=session.beginTransaction();
		session.update(location);
		//tr.commit();
	}

	public void deleteLocation(int locationid) {
		
		Session session=sessionFactory.openSession();
		//Transaction tr=session.beginTransaction();
		Location e=(Location)session.get(Location.class,locationid);
		session.delete(e);
		//tr.commit();

	}

	public List<Location> getAllLocations() {
		
		Session session=sessionFactory.openSession();
	//	Transaction tr=session.beginTransaction();
		List<Location> location=session.createQuery("from Location",Location.class).list();
	//	tr.commit();
		return location;
		
	}

	public Location getLocationById(int locationid) {
		
		Session session=sessionFactory.openSession();
		//Transaction tr=session.beginTransaction();
		Location location=(Location)session.get(Location.class,locationid);
	//	tr.commit();
		
		return location;

	}
}