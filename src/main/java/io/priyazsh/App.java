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

		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();

		session.close();
	}
}
