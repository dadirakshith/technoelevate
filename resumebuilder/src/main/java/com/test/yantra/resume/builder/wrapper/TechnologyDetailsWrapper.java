package com.test.yantra.resume.builder.wrapper;

import java.util.List;

import com.test.yantra.resume.builder.dto.TechnologyItems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechnologyDetailsWrapper
{
	
	private String type;
	private List<TechnologyItems> items;
}
