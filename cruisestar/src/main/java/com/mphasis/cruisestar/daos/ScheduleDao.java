package com.mphasis.cruisestar.daos;

import java.util.List;

import com.mphasis.cruisestar.entities.Schedule;

public interface ScheduleDao {

	public void addSchedule(Schedule schedule);
	
	public List<Schedule> getAllSchedules();
	
	public void getScheduleById(int scheduleid);
	
	
}
