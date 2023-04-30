package com.example.demo.data;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Project {

	@NotBlank(message = "Project Name can not be blank")
	private String name;

	@Max(value = 2023, message = "Project starting date can not be in future.")
	@Min(value = 1850, message = "Project starting date can not be before 1850's.")
	private int startingYear;
	private int endingYear;
	private boolean currentlyWorking;
	@NotBlank(message = "Project Description can not be blank.")
	private String description;
	private List<@NotBlank(message = "List of technologies can not be empty.") String> tech_used;
	private String source;

}
