package com.citiutech.HibernateBasic;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Configuration con = new Configuration().addAnnotatedClass(Employee.class);
        con.configure("hibernate.cfg.xml");
        SessionFactory factory = con.buildSessionFactory();
        System.out.println(factory);
        
        Employee vishal = new Employee(); 
        vishal.setEid(4);
        vishal.setEname("Manish");
        vishal.setEage(20);
        vishal.setEsalary(200.00);
        System.out.println(vishal);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(vishal);
        tx.commit();
        session.close();
    }
}
