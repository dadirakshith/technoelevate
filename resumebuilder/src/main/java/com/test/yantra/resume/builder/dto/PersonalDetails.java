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
public class PersonalDetails{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String primarySkill;
	
	@Column
	private String[] summary;
	
	@Column
	private String totalExperience;
	
	@Column
	private String relevantExperience;
	
	@Column(length = 15)
	private String profileId;
	 
}
