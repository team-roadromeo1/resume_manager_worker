package com.example.demo.data;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "education")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Education {
	
	@NotBlank(message = "Education name must not be empty")
	private String name;
	
	@NotBlank(message = "Education type must not be empty")
	private String type;
	
	@NotBlank(message = "University name must not be empty")
	private String university;
	
	@Max(value = 2022, message = "Starting date can not be in future")
	@Min(value = 1850, message = "Staritng date can not be before 1850's")
	private int startingYear;
	

	@Max(value = 2022, message = "Ending date can not be in future")
	@Min(value = 1850, message = "Ending date can not be before 1850's")
	private int endingYear;
	
	
	private float percentage; 
}
