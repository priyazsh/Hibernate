package io.priyazsh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");

		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);

		Student s = new Student();
		s.setId(1);
		s.setName("Priyansh");
		s.setCity("Indore");
		s.setRollno(29);
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		session.persist(s);
		tnx.commit();
		session.close();
	}
}
