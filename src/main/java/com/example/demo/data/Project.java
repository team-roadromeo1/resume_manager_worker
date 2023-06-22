package com.example.demo.data;

import java.util.List;

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
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@NotBlank(message = "Project Name can not be blank")
	@Column(name = "name")
	private String name;

	@Max(value = 2023, message = "Project starting date can not be in future.")
	@Min(value = 1850, message = "Project starting date can not be before 1850's.")
	@Column(name = "starting_year")
	private int startingYear;

	@Column(name = "ending_year")
	private int endingYear;
	
	@Column(name = "currently_working")
	private boolean currentlyWorking;
	
	@NotBlank(message = "Project Description can not be blank.")
	@Column(name = "description")
	private String description;
	
	// @Column(name = "")
	// private List<@NotBlank(message = "List of technologies can not be empty.") String> tech_used;
	
	@Column(name = "source")
	private String source;
	
	// @OneToMany(mappedBy = "project")
	// private PersonData personData;
}
