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
		//Message message1 = new Message(123,"message1_text");
		//session.persist(message1);

		//retrieving object graph of Book by its "id" (isbn)
		Message message = session.get(Message.class, 123);
		System.out.println(message.getId() + ": " + message.getText());

		session.getTransaction().commit();
		session.close();	
	}
}
