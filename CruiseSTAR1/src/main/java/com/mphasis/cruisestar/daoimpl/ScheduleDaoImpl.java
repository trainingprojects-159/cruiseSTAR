package com.mphasis.cruisestar.daoimpl;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.ScheduleDao;
import com.mphasis.cruisestar.entities.Schedule;

@Repository
public class ScheduleDaoImpl implements ScheduleDao {

	
	@Autowired
	SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	
	public void addSchedule(Schedule schedule) {
		
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println(schedule.getScheduledate()+"Schedule date is ");
		session.save(schedule);
		tr.commit();

	}

	public void editSchedule(Schedule schedule) {
		
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(schedule);
		tr.commit();
	}

	/*public void deleteSchedule(int scheduleid) {
		
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Schedule e=(Schedule)session.get(Schedule.class,scheduleid);
		session.delete(e);
		tr.commit();

	}*/

	public List<Schedule> getAllSchedules() {
		
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Schedule> schedules=session.createQuery("from Schedule",Schedule.class).list();
		tr.commit();
		return schedules;
	}

	public Schedule getScheduleById(int scheduleid) {
		
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Schedule schedule=(Schedule)session.get(Schedule.class,scheduleid);
		tr.commit();
		return schedule;

	}
}

