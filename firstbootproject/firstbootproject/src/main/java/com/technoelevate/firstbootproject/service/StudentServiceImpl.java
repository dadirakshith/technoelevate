package com.technoelevate.firstbootproject.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.firstbootproject.dto.Student;
import com.technoelevate.firstbootproject.exceptions.StudentNotFountException;
import com.technoelevate.firstbootproject.pojo.StudentPOJO;
import com.technoelevate.firstbootproject.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(com.technoelevate.firstbootproject.pojo.StudentPOJO newStudent) 
	{

		Student newStudentDto = new Student();
		BeanUtils.copyProperties(newStudent, newStudentDto);
		Student studentSaved = studentRepository.save(newStudentDto);
		return studentSaved;
	}

	@Override
	public Student getStudentById(int id)
	{
		Optional<Student> searchedStudent = studentRepository.findById(id);
		if(searchedStudent.isPresent())
		{
			return searchedStudent.get();
		}
		return null;
	}

	@Override
	public Student updateMarks(StudentPOJO updatedObject) throws StudentNotFountException 
	{

		Optional<Student> optStudent = studentRepository.findById(updatedObject.getId());
		if(optStudent.isPresent())
		{
			Student s = optStudent.get();
			BeanUtils.copyProperties(updatedObject, s);
			return studentRepository.save(s);
			
		}
		else
		{
			throw new StudentNotFountException("Give Proper ID to UPDTAE!!!");
		}


	}

	@Override
	public Student deleteStudent(int id) throws StudentNotFountException
	{
		Optional<Student> searchedStudent = studentRepository.findById(id);
		if(searchedStudent.isPresent())
		{
			studentRepository.deleteById(id);
			return searchedStudent.get();
		}
		else
		{
			throw new StudentNotFountException("Give Proper ID to Delete!!!");
		}
	}

}
