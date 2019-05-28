package com.asminds.CURDMVC.daoIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asminds.CURDMVC.dao.Registerdao;
import com.asminds.CURDMVC.model.Register;

public class RegistermodelIMPL implements Registerdao{

	public boolean save(Register r) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(r);
		tr.commit();
		
		
		session.close();
		factory.close();
		System.out.println("Object Saved successfully.....!!");
		return true;
	}
}
