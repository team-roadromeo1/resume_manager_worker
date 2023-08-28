package com.example.manager.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
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

	@ApiModelProperty(hidden = true)
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
	
	@Column(name = "starting_year")
	private int startingYear;
	

	@Column(name = "ending_year")
	private int endingYear;
	
	@Column(name = "percentage")
	private double percentage; 

}
