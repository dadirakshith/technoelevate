package com.technoelevate.firstbootproject.response;


import com.technoelevate.firstbootproject.dto.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse
{
	private boolean error;
	private String message;
	private Student student;
}
