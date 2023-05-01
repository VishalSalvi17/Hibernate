package com.citiustech.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.citiustech.mapping.Employee;
import com.citiustech.mapping.Project;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Project Strted....");
		Configuration con = new Configuration().addAnnotatedClass(Employee.class);
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		System.out.println(factory);

		// Creating Employee
		Employee emp1 = new Employee() ;
		emp1.setEid(1);
		emp1.setEname("Vihal");
		

		//Creating Employee
		Employee emp2 = new Employee();
		emp2.setEid(2);
		emp2.setEname("Saurabh");
		
		//creating project
		Project p1 = new Project();
		p1.setPid(101);
		p1.setPname("Ola");
		
		
		//Creating Project
		Project p2 = new Project();
		p2.setPid(102);
		p2.setPname("Uber");
		
		//creating list of employee
		List<Employee> list1 = new ArrayList<Employee>();
		
		//add all employee in list1
		list1.add(emp1);
		list1.add(emp2);
		
		//creating list of project
		List<Project> list2 = new ArrayList<Project>();
		
		//add all projects in list2
		list2.add(p1);
		list2.add(p2);

		emp1.setProjects(list2);
		p2.setEmployees(list1);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(p1);
		session.save(p2);
		
		//Fetching data
		
//		Question q = (Question) session.get(Question.class, 1);
//		System.out.println(q.getQuestion());
//		
//		for (Answer answer : q.getAnswers()) {
//			System.out.println(answer.getAnswer());
//			
//		}
		tx.commit();
		session.close();
		System.out.println("Done");

	}

}
