package com.citiutech.StudentApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.citiustech.model.Address;
import com.citiustech.model.Student;

public class FetchDemo {
	public static void main(String[] args){
		//get
		Configuration con = new Configuration().addAnnotatedClass(Student.class);
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session  session = factory.openSession();
		
		//get student
		Student student = (Student)session.get(Student.class, 1);
		System.out.println(student);
		
		//get address
		Address address = (Address)session.load(Address.class, 1);
		System.out.println(address);
		System.out.println(address.getCity());
		
		session.close();
		factory.close();
	}
}
