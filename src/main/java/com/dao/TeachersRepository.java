package com.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Teacher;

public interface TeachersRepository extends BaseObjectRepository<Teacher>, CrudRepository<Teacher, Long> {
	List<Teacher> findByFirstName(String fName);
	List<Teacher> findByLastName(String lName);
	List<Teacher> findByJobTitle(String jTitle);
}
