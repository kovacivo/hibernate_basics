package client;


import entity.Address;
import entity.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import org.hibernate.Transaction;
import util.HibernateUtil;

public class Client {

	private static final Logger logger = LogManager.getLogger(Client.class);
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();

        try {
			txn.begin();
			//Person having 1 Address
			Address address = new Address("200 E Main St", "Seattle", "85123");
			Person person = new Person("Ruby", address);

			session.persist(person);
			//---------------------------------------------------------------------------------------

			//Person having 2 Address (homeAddress and billingAddress) using AttributeOverrides
        			/*
        			Address homeAddress = new Address("200 E Main St", "Seattle", "85123");
        			Address billingAddress = new Address("2751  Sigley Road", "Charlotte", "28273");
        			Person person = new Person("Ruby", homeAddress, billingAddress);

        			session.save(person);
	        		*/

            session.getTransaction().commit();
        } catch (Exception e) {
			if( txn != null) { txn.rollback(); }
			e.printStackTrace();
		}
	}
}
