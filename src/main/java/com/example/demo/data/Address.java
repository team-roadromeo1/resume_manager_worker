package com.example.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class Address {

    public Address(Long id, @NotNull(message = "House number can not be empty.") int house_no,
            @NotBlank(message = "Address detail can not be empty") String address_details, String landmark,
            String other_landmark, @NotBlank(message = "City name can not be empty") String city,
            @NotNull(message = "Pin code can not be empty") long pin_code,
            @NotBlank(message = "Country name can not be empty") String country) {
        this.id = id;
        this.house_no = house_no;
        this.address_details = address_details;
        this.landmark = landmark;
        this.other_landmark = other_landmark;
        this.city = city;
        this.pin_code = pin_code;
        this.country = country;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
    @OneToMany(mappedBy = "address")
    private PersonData personData;

}
