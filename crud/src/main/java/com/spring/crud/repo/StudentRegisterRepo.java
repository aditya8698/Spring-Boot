package com.spring.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.entity.Student;

@Repository
public interface StudentRegisterRepo extends JpaRepository<Student, Integer> {

}
