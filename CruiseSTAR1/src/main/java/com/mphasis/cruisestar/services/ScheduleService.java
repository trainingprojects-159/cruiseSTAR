package com.mphasis.cruisestar.services;

import java.util.List;

import com.mphasis.cruisestar.entities.Schedule;

public interface ScheduleService {

	public List<Schedule> getSchedules();
	public void addSchedule(Schedule s);
	public void editSchedule(Schedule s);
	public Schedule getById(int scheduleid);
	
}
