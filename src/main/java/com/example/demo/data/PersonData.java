package com.example.demo.data;

import java.util.List;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;


@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PersonData {
	
	
	private static final String email_pattern = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	private static final String phone_pattern = "(^$|[0-9]{10})";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
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
	

	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "pd_id", referencedColumnName = "id")
	private  @Valid  List<Address> address;

	private List<@Valid Education> education;

	private List<@NotBlank(message = "Skills list can not be empty") String> skills; 
	
	private List<@Valid Experience> experiences;
	
	private List<@Valid Project> projects;
}
