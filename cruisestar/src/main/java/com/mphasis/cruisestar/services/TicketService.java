package com.mphasis.cruisestar.services;

import com.mphasis.cruisestar.entities.Ticket;

public interface TicketService {
	

	public Ticket bookTicket(Ticket ticket);
	
	public void cancelledTicket(int ticketid);
	
	public Ticket getTicketsById(int ticketid);

}
