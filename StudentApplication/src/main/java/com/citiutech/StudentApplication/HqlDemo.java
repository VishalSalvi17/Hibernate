package com.citiutech.StudentApplication;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.citiustech.model.Student;

public class HqlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Project Started...");
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session s = factory.openSession();
		
		String query = "from student";
		Query q = s.createQuery(query);
		
		List<Student> list = q.getResultList();
		
		for (Student student : list) {
			System.out.println(student.getName());
		}
		s.close();
		factory.close();

	}

}
