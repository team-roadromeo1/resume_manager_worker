package com.example.demo.data;


import javax.persistence.*;
//import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PersonData {
	
	
	private static final String email_pattern = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	private static final String phone_pattern = "(^$|[0-9]{10})";
	
	@ApiModelProperty(hidden = true)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@NotBlank(message = "First Name can not be empty")
	@Column(name = "first_name")
	private String firstName;
	
	@NotBlank(message = "Last Name can not be empty")
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank(message = "Email can not be empty")
	@Pattern(regexp = email_pattern, message = "Email should be in proper format")
	@Column(name = "email")
	private String emailId;
	
	@NotBlank(message = "Phone number can not be empty")
	@Pattern(regexp = phone_pattern, message = "Phone number should be of  10 digits.")	
	@Column(name = "phone")
	private String phone;
	
}
