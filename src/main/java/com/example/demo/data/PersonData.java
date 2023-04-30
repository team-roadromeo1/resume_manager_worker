package com.example.demo.data;

import java.util.List;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "data")
@Entity
@Data
public class PersonData {
	
	
	private static final String email_pattern = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	private static final String phone_pattern = "(^$|[0-9]{10})";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@NotBlank(message = "First Name can not be empty")
	private String firstName;
	
	@NotBlank(message = "Last Name can not be empty")
	private String lastName;
	
	@NotBlank(message = "Email can not be empty")
	@Pattern(regexp = email_pattern, message = "Email should be in proper format")
	private String emailId;
	
	@NotBlank(message = "Phone number can not be empty")
	@Pattern(regexp = phone_pattern, message = "Phone number should be of  10 digits.")	
	private String phone;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private  @Valid  Address address;

	private List<@Valid Education> education;

	private List<@NotBlank(message = "Skills list can not be empty") String> skills; 
	
	private List<@Valid Experience> experiences;
	
	private List<@Valid Project> projects;
}
