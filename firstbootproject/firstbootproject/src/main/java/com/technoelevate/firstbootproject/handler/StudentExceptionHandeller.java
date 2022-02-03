package com.technoelevate.firstbootproject.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.technoelevate.firstbootproject.exceptions.StudentNotFountException;
import com.technoelevate.firstbootproject.response.StudentResponse;

@RestControllerAdvice
public class StudentExceptionHandeller 
{
	@ExceptionHandler(StudentNotFountException.class)
	public ResponseEntity<StudentResponse> studentNotFoundException(StudentNotFountException exception)
	{
		return new ResponseEntity<StudentResponse>(new StudentResponse(true, exception.getMessage(), null),HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<StudentResponse> validationException(MethodArgumentNotValidException e)
	{
		FieldError error = e.getFieldError();
		return new ResponseEntity<StudentResponse>(new StudentResponse(true,error.getDefaultMessage(),null),HttpStatus.BAD_REQUEST);
	}

}
