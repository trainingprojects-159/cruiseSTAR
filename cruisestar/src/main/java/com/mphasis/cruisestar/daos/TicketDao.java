package com.mphasis.cruisestar.daos;

import java.util.List;

import com.mphasis.cruisestar.entities.Ticket;

public interface TicketDao {

	public void reserveTicket(Ticket ticket);
	
	public void cancelTicket(int ticketid);
	
	public List<Ticket> getTicketById(int ticketid);
	
	
}
