package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student extends BaseObject {
	private static final long serialVersionUID = 4181718483427458430L;
	
	private Long age;
	private String name;

	protected Student() {
		super();
	}

	public Student(Long age, String name, Date created, String createdBy) {
		super();
		super.setCreated(created);
		super.setCreatedBy(createdBy);
		this.age = age;
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Student[id=%d, age='%s', name='%s', createdBy='%s', created='%s']", super.getId(), age,
				name, super.getCreatedBy(), super.getCreated());
	}

}