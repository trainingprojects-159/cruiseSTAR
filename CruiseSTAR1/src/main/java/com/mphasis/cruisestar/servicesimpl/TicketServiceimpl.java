package com.mphasis.cruisestar.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cruisestar.daos.TicketDao;
import com.mphasis.cruisestar.entities.Ticket;
import com.mphasis.cruisestar.services.TicketService;
@Service
public class TicketServiceimpl implements TicketService {

	@Autowired
	TicketDao ticketDao;

	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}
	
	
	public void bookTicket(Ticket ticket) {
		 
		ticketDao.reserveTicket(ticket);
 
	}

	public void cancelledTicket(int ticketid) {
		ticketDao.cancelTicket(ticketid);
	}

	public Ticket getTicketsById(int ticketid) {

		return ticketDao.getTicketById(ticketid);
	}

}
