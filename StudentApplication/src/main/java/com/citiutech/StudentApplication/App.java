package com.citiutech.StudentApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.citiustech.model.Address;
import com.citiustech.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args){
		System.out.println("Project Strted....");
		Configuration con = new Configuration().addAnnotatedClass(Student.class);
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		System.out.println(factory);

		// creating student
		Student st = new Student();
		st.setId(1);
		st.setName("Vishal");
		st.setCity("Pune");
		System.out.println(st);

		// creating object of address class
		Address ad = new Address();
		ad.setStreet("street1");
		ad.setCity("Mumbai");
		ad.setOpen(true);
		ad.setX(1234.456);
		ad.setAddedDate(new Date());
		
//		FileInputStream fs = new FileInputStream("src/main/java/CitiusTech-Logo.webp");
//		byte[] data = new byte[fs.available()];
//		fs.read(data);
//		ad.setImage(data);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("Done");
	}
}
