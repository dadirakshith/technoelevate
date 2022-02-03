package com.technoelevate.firstbootproject.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.firstbootproject.dto.Student;
import com.technoelevate.firstbootproject.exceptions.StudentNotFountException;
import com.technoelevate.firstbootproject.pojo.StudentPOJO;
import com.technoelevate.firstbootproject.response.StudentResponse;
import com.technoelevate.firstbootproject.service.StudentService;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {
	@Autowired
	private StudentService service;

	@PostMapping("addStudent")
	public ResponseEntity<StudentResponse> addStudent(@RequestBody @Valid StudentPOJO studentPOJO)
	{
		Student savedStudent = service.addStudent(studentPOJO);
		if (savedStudent != null)
			return new ResponseEntity<>(new StudentResponse(false, "Student Data Added", savedStudent), HttpStatus.OK);
		else
			return new ResponseEntity<>(new StudentResponse(true, "Student Data NOT Added", savedStudent),
					HttpStatus.BAD_REQUEST);

	}
	
	@GetMapping("get")
	public ResponseEntity<StudentResponse> getStudentById(@RequestParam int id)
	{
		Student searchedStudent = service.getStudentById(id);
		if(searchedStudent != null)
			return new ResponseEntity<>(new StudentResponse(false, "Present", searchedStudent),HttpStatus.OK);
		else
			return new ResponseEntity<StudentResponse>(new StudentResponse(true, "Not Present", searchedStudent),HttpStatus.OK);
	}
	
	@PutMapping("update")
	public ResponseEntity<StudentResponse> updateStudentmarksById(@RequestBody StudentPOJO updatedObject) throws StudentNotFountException
	{
		Student updatedStudent = service.updateMarks(updatedObject);
		
		return new ResponseEntity<StudentResponse>(new StudentResponse(false, "Updated!!!", updatedStudent),HttpStatus.OK);
	}
	
	@DeleteMapping("delete")
	public ResponseEntity<StudentResponse> deleteStudentById(@RequestParam("id")int id) throws StudentNotFountException
	{
		Student deletedStudent = service.deleteStudent(id);
		
		return new ResponseEntity<StudentResponse>(new StudentResponse(false, "Deleted!!!", deletedStudent), HttpStatus.OK);
	}
	
	
}
