package com.example.demo.data;

import java.util.List;

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

	public Project(Long id, @NotBlank(message = "Project Name can not be blank") String name,
			@Max(value = 2023, message = "Project starting date can not be in future.") @Min(value = 1850, message = "Project starting date can not be before 1850's.") int startingYear,
			int endingYear, boolean currentlyWorking,
			@NotBlank(message = "Project Description can not be blank.") String description,
			List<@NotBlank(message = "List of technologies can not be empty.") String> tech_used, String source) {
		this.id = id;
		this.name = name;
		this.startingYear = startingYear;
		this.endingYear = endingYear;
		this.currentlyWorking = currentlyWorking;
		this.description = description;
		this.tech_used = tech_used;
		this.source = source;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
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
	@OneToMany(mappedBy = "project")
	private PersonData personData;
}
