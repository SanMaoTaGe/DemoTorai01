package com.gaga.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 作用: 1. 提供session 2. 保证SessionFactory全局只有一个
 *
 */
public class HibernateUtils {

	private static Configuration configuration = null;
	private static SessionFactory sessionFactory = null;

	/**
	 * 保证SessionFactory全局只有一个
	 */
	static {
		configuration = new Configuration();
		configuration.configure();

		sessionFactory = configuration.buildSessionFactory();
	}

	private HibernateUtils() {

	}

	public static Session openSession() {
		Session session = sessionFactory.openSession();
		return session;
	}
	
	public static Session  getCurrentSession() {
		Session session = sessionFactory.getCurrentSession();
		
		return session;
		
	}

}