package com.mphasis.cruisestar.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cruisestar.daos.ScheduleDao;
import com.mphasis.cruisestar.entities.Schedule;
import com.mphasis.cruisestar.services.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleDao scheduleDao;

	public void setScheduleDao(ScheduleDao scheduleDao) {
		this.scheduleDao = scheduleDao;
	}

	public List<Schedule> getSchedules() {
		return scheduleDao.getAllSchedules();
	}

	public void addSchedule(Schedule s) {
		scheduleDao.addSchedule(s);
	}

	public Schedule getById(int scheduleid) {
		return scheduleDao.getScheduleById(scheduleid);
	}

	public void editSchedule(Schedule s) {
		scheduleDao.editSchedule(s);

	}

}
