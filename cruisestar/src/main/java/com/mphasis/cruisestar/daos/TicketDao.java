package com.mphasis.cruisestar.daos;

import com.mphasis.cruisestar.entities.Ticket;

public interface TicketDao {

	public void reserveTicket(Ticket ticket);
	
	public void cancelTicket(int ticketid);
	
	public Ticket getTicketById(int ticketid);
	
	
}
