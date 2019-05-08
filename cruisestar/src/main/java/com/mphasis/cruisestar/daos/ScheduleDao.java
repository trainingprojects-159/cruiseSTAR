package com.mphasis.cruisestar.daos;

import com.mphasis.cruisestar.entities.Schedule;

public interface ScheduleDao {

	public void addSchedule(Schedule schedule);
	public void editSchedule(Schedule schedule);
	public void deleteSchedule(int scheduleid);
	public Schedule getAllSchedules();
	public void getScheduleById(int scheduleid);
}
