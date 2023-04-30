package com.example.demo.data;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Document(collection = "Address")
@Entity
@Data
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @NotNull(message = "House number can not be empty.")
    private int house_no;
    @NotBlank(message = "Address detail can not be empty")
    private String address_details;
    private String landmark;
    private String other_landmark;
    @NotBlank(message = "City name can not be empty")
    private String city;
    @NotNull(message = "Pin code can not be empty")
    private long pin_code;
    @NotBlank(message = "Country name can not be empty")
    private String country;
    @OneToOne(mappedBy = "address")
    private PersonData personData;

}
