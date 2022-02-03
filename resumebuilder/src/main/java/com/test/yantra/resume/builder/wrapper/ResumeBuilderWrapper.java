package com.test.yantra.resume.builder.wrapper;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.test.yantra.resume.builder.dto.EducationalDetails;
import com.test.yantra.resume.builder.dto.PersonalDetails;
import com.test.yantra.resume.builder.dto.ProjectDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeBuilderWrapper {
	// @NotBlank(message = "Profile ID is Mandatory!!!")
	@NotEmpty(message = "Profile id is mandatory!!!!!")
	private String profileId;
	private String employeeId;
	private String resumeTypeId;
	private byte[] photo;

	private EducationalDetails educationalDetails;
	private PersonalDetails personalDetails;
	private List<TechnologyDetailsWrapper> technologyDetails;
	private List<ProjectDetails> projectDetails;
}
