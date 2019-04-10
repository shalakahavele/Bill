package com.fujitsu.orm.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fujitsu.beans.Bill;
import com.fujitsu.beans.Payment;



public class HibernateMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// create configuration
		Configuration cfg=new Configuration();
		
		// read hibernate properties from hibernate.cfg.xml
		Configuration c= cfg.configure();
		
		// obtain session factory through configuration
		SessionFactory factory=c.buildSessionFactory();
		
		// get session from sessionfactory
		// represents database connection
		Session session=factory.openSession();
		
		// get transaction through session
		Transaction tx=session.beginTransaction();
		
		// database operations logic
		// 1.insert new product
		
		Bill b= new Bill();
		b.setBillId(120);
		b.setTotal_amt(2014);
		b.setBill_date(LocalDate.of(2019, 04, 15));
		b.getPaymentId();
		
		session.save(b);
		// commit transaction
		tx.commit();
		
		//close session-close database connection
		session.close();

	}

}
