package com.freeingreturns.ws.utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.freeingreturns.ws.utils.errorhandling.FRDatabaseException;

public class HibernateUtils {
	public static final SessionFactory sessionFactory;
	
	static {
		Configuration conf = new Configuration();
		conf.configure();
		
		try {
			sessionFactory = conf.buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
			throw new FRDatabaseException("Could not configure database");
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
