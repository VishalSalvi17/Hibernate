package com.citiutech.HibernateBasic;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
//@Table(name="Employee")
public class Employee {
	@Id
	private int eid;
	private String ename;
	private int eage;
	private double esalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, int eage, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getEage() {
		return eage;
	}
	
	public void setEage(int eage) {
		this.eage = eage;
	}
	
	public double getEsalary() {
		return esalary;
	}
	
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", esalary=" + esalary + "]";
	}
}
