package com.spring.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.entity.Student;
import com.spring.crud.repo.StudentRegisterRepo;

@Service
public class StudentService implements IstudentService{

	@Autowired
	StudentRegisterRepo repo;

	@Override
	public Integer addStudent(Student s) {
		
		Student s1 = repo.save(s);
		
		return s1.getId();
	}
	
	
	
}
