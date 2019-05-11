package com.mphasis.cruisestar.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.RouteDao;
import com.mphasis.cruisestar.entities.Route;

@Repository
public class RouteDaoImpl implements RouteDao {
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		 this.sessionFactory=sessionFactory;
	}

	public void addRoute(Route route) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println(route.getRouteid()+"route values in dao");
		session.save(route);
		tr.commit();
		
	}

	public void editRoute(Route route) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(route);
		tr.commit();

	}

	public void deleteRoute(int routeid) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Route route=(Route)session.get(Route.class,routeid);
		session.delete(route);
		tr.commit();
	}

	public List<Route> getAllRoutes() {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Route> routes=session.createQuery("from Route",Route.class).list();
		tr.commit();
		return  routes;
	}

	public Route getRouteById(int routeid) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Route route=(Route)session.get(Route.class,routeid);
		tr.commit();
		return route;
	}

	public List<Route> viewSchedule(String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	//public List<Route> viewSchedule(String source, String destination) {
	//	Session session=sessionFactory.openSession();
		//Transaction tr=session.beginTransaction();
//		Criteria criteria=session.createCriteria(Route.class);
//		criteria.add(Restrictions.eq("source",source));
//		criteria.add(Restrictions.eq("destination",destination));
//		criteria.add(Restrictions.and(source, destination));
//		List<Route> routes=criteria.list();	
	//	tr.commit();
	//	return routes;
	
	
	}

