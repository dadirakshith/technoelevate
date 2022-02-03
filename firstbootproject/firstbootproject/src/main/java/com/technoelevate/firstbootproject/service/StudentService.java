package com.technoelevate.firstbootproject.service;

import com.technoelevate.firstbootproject.dto.Student;
import com.technoelevate.firstbootproject.exceptions.StudentNotFountException;
import com.technoelevate.firstbootproject.pojo.StudentPOJO;

public interface StudentService
{
	Student addStudent(StudentPOJO newStudent);

	Student getStudentById(int id);

	Student updateMarks(StudentPOJO updatedObject) throws StudentNotFountException;

	Student deleteStudent(int id) throws StudentNotFountException;
}
