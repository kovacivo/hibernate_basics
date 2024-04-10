package client;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import entity.Message;
import util.HibernateUtil;

public class MessageClient {

	private static final Logger logger = LogManager.getLogger(MessageClient.class);
	public static void main(String[] args) {
			
        Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();

		//persisting object graph of Book
		

		//session.persist(message);
		
		
		//retrieving object graph of Book by its "id" (isbn)	
		/*
		Book book = (Book) session.get(Book.class, "9781449334376");
		System.out.println(book);		
		*/  
		session.getTransaction().commit();
		session.close();	
	}
}
