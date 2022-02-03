package com.technoelevate.firstbootproject.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentPOJO
{
	
	private int id;
	
	@NotBlank(message = "Give value")
	@Pattern(regexp = "/^[A-Z]$",message = "Only Upper Case")
	@Size(min = 3, max=10, message = "not in range")
	private String firstName;
	private String lastName;
	private double marks;
}
