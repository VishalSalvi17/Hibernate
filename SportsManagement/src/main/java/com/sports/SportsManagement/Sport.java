package com.sports.SportsManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sports")
public class Sport {
	private int id;
	private String sname;

	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sport(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
