package com.technoelevate.firstbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technoelevate.firstbootproject.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> 
{

}
