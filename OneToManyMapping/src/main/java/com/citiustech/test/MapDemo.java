package com.citiustech.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.citiustech.mapping.Answer;
import com.citiustech.mapping.Question;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Project Strted....");
		Configuration con = new Configuration().addAnnotatedClass(Question.class);
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		System.out.println(factory);

		// Creating Question
		Question question1 = new Question();
		question1.setQuestionId(1);
		question1.setQuestion("What is Java?");

		// Creating Answer
		Answer answer1 = new Answer();
		answer1.setAnswerId(101);
		answer1.setAnswer("Java is programming language");
		answer1.setQuestion(question1);

		// Creating Answer
		Answer answer2 = new Answer();
		answer2.setAnswerId(102);
		answer2.setAnswer("Java is OOP");
		answer2.setQuestion(question1);

		// Creating Answer
		Answer answer3 = new Answer();
		answer3.setAnswerId(103);
		answer3.setAnswer("Java is platform Independent");
		answer3.setQuestion(question1);

		List<Answer> list = new ArrayList<Answer>();
		list.add(answer1);
		list.add(answer2);
		list.add(answer3);

		question1.setAnswers(list);

		// Creating Question
		Question question2 = new Question();
		question2.setQuestionId(2);
		question2.setQuestion("What is Spring?");

		// Creating Answer
		Answer answer4 = new Answer();
		answer4.setAnswerId(201);
		answer4.setAnswer("Framework");
		answer4.setQuestion(question2);

		Answer answer5 = new Answer();
		answer5.setAnswerId(202);
		answer5.setAnswer("EE Application");
		answer5.setQuestion(question2);

		Answer answer6 = new Answer();
		answer6.setAnswerId(203);
		answer6.setAnswer("API");
		answer6.setQuestion(question2);

		List<Answer> list1 = new ArrayList<Answer>();
		list1.add(answer4);
		list1.add(answer5);
		list1.add(answer6);

		question1.setAnswers(list1);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(question1);
		session.save(question2);
		session.save(answer1);
		session.save(answer2);
		session.save(answer3);
		session.save(answer4);
		session.save(answer5);
		session.save(answer6);
		
		//Fetching data
		
		Question q = (Question) session.get(Question.class, 1);
		System.out.println(q.getQuestion());
		
		for (Answer answer : q.getAnswers()) {
			System.out.println(answer.getAnswer());
			
		}
		tx.commit();
		session.close();
		System.out.println("Done");

	}

}
