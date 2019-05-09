package com.mphasis.cruisestar.daos;

import java.util.List;

import com.mphasis.cruisestar.entities.Schedule;
/*import com.mphasis.cruisestar.entities.Ship;*/

public interface ScheduleDao {

	public void addSchedule(Schedule schedule);
	
	public List<Schedule> getAllSchedules();
	
	public Schedule getScheduleById(int scheduleid);
	
	/*public List<Ship> getShipByScheduleId(int scheduleid);
	*/
}
