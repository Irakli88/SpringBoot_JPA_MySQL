package com.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Student;

public interface StudentRepository extends BaseObjectRepository<Student>, CrudRepository<Student, Long> {
	List<Student> findByAge(Long age);
	List<Student> findByName(String name);
}