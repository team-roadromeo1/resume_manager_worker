package com.example.manager.data;

import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "experince")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Experience {

  @ApiModelProperty(hidden = true)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  @NotBlank(message = "Designation can not be blank.")
  @Column(name = "designation")
  private String designation;

  @NotBlank(message = "Company name can not be blank.")
  @Column(name = "company")
  private String company;

  @Column(name = "starting_year")
  private int startingYear;

  @Column(name = "ending_year")
  private int endingYear;

  @Column(name = "currently_working")
  private boolean currentlyWorking;

  @NotBlank(message = "Description can not be empty.")
  @Column(name = "description")
  private String description;
}
