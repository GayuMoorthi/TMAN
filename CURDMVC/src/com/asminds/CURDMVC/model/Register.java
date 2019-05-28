package com.asminds.CURDMVC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {

	@Id
	@GeneratedValue	(strategy=GenerationType.AUTO)
	public int id;
	public String name;
	public String dept;
	public String clg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Register() {
		super();
	}
	public Register(int id, String name, String dept, String clg) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.clg = clg;
	}	
}
