package com.test.yantra.resume.builder.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class EducationalDetails{


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 100)
	private String qualification;
	
	@Column(length = 100) 
	private String specialization;
	
	@Column
	private int passOutYear;
	
	@Column
	private int percentage;
	
	@Column(length = 80)
	private String university;

}
