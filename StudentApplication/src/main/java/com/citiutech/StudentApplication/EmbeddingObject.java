package com.citiutech.StudentApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.citiustech.model.Certificate;
import com.citiustech.model.Student;

public class EmbeddingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Project Strted....");
		Configuration con = new Configuration().addAnnotatedClass(Student.class);
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		System.out.println(factory);

		// create student
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Vishal");
		student1.setCity("Mumbai");

		// create certiicate
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Java");
		certificate1.setDuration("4 Month");
		student1.setCerti(certificate1);
		
		// create student
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Saurabh");
		student2.setCity("Pune");

		// create certiicate
		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Hibernate");
		certificate2.setDuration("2 Month");
		student2.setCerti(certificate2);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		tx.commit();
		session.close();
		System.out.println("Done");
	}

}
