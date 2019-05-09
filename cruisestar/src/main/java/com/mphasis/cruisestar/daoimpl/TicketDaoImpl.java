package com.mphasis.cruisestar.daoimpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.cruisestar.daos.TicketDao;
import com.mphasis.cruisestar.entities.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void reserveTicket(Ticket ticket) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ticket);
		transaction.commit();

	}

	public void cancelTicket(int ticketid) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Ticket p = (Ticket)session.get(Ticket.class,ticketid);
		p.setStatus("cancelled");
		session.update(p);
		transaction.commit();
	
	}

	public Ticket getTicketById(int ticketid) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Ticket tickets = (Ticket)session.get(Ticket.class, ticketid);
		transaction.commit();
		return tickets;

	}
}
