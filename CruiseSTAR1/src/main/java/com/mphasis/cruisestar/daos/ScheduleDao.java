package com.mphasis.cruisestar.daos;

import java.util.List;

import com.mphasis.cruisestar.entities.Schedule;


public interface ScheduleDao {

	public void addSchedule(Schedule schedule);
	
	public void editSchedule(Schedule schedule);
	
	public List<Schedule> getAllSchedules();
	
	public Schedule getScheduleById(int scheduleid);
	
}
