package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher extends BaseObject {

	private static final long serialVersionUID = 2444004117072883652L;

	protected Teacher(){
		super();
	}
	
	public Teacher(String firstName, String lastName, String jobTitle, Date created, String createdBy) {
		super();
		super.setCreated(created);
		super.setCreatedBy(createdBy);
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
	}
	
	private String firstName;
	private String lastName;
	private String jobTitle;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
