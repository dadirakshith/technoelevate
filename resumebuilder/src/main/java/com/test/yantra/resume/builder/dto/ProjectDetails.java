package com.test.yantra.resume.builder.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="project_details")
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 150)
	private String projectName;
	
	
	@Column
	private String [] frontendTechnology;
	
	@Column
	private String [] backendTechnology;
	
	@Column
	private String [] designPatterns;
	
	@Column
	private String [] databaseInfo;  
	
	@Column
	private String [] developmentTools;
	
	@Column
	private String duration;
	
	@Column
	private String teamSize;
	
	@Column
	private String projectDescription;
	
	@Column
	private String rolesAndResponsibalities;

}
