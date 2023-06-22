package com.example.demo.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "education")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Education {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@NotBlank(message = "Education name must not be empty")
	@Column(name = "name")
	private String name;
	
	@NotBlank(message = "Education type must not be empty")
	@Column(name = "type")
	private String type;
	
	@NotBlank(message = "University name must not be empty")
	@Column(name = "university")
	private String university;
	
	@Max(value = 2022, message = "Starting date can not be in future")
	@Min(value = 1850, message = "Staritng date can not be before 1850's")
	@Column(name = "starting_year")
	private int startingYear;
	

	@Max(value = 2022, message = "Ending date can not be in future")
	@Min(value = 1850, message = "Ending date can not be before 1850's")
	@Column(name = "ending_year")
	private int endingYear;
	
	@Column(name = "percentage")
	private double percentage; 

	// @OneToMany(mappedBy = "education")
	// private PersonData personData;
}
