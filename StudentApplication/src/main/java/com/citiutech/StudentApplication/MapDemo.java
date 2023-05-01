package com.citiutech.StudentApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.citiustech.mapping.Answer;
import com.citiustech.mapping.Question;
import com.citiustech.model.Student;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Project Strted....");
		Configuration con = new Configuration().addAnnotatedClass(Student.class);
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		System.out.println(factory);
		
		//Creating Question
		Question question1  = new Question();
		question1.setQuestionId(6);
		question1.setQuestion("What is Git?");
		
		//Creating Answer
		Answer answer1 = new Answer();
		answer1.setAnswerId(106);
		answer1.setAnswer("Git");
		
//		//Creating Question
//		Question question2  = new Question();
//		question2.setQuestionId(4);
//		question2.setQuestion("What is Spring?");
//		
//		//Creating Answer
//		Answer answer2 = new Answer();
//		answer2.setAnswerId(104);
//		answer2.setAnswer("Framework");
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(question1);
		session.save(answer1);
//		session.save(question2);
//		session.save(answer2);
		tx.commit();
		session.close();
		System.out.println("Done");

	}

}
