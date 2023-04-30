package com.example.demo.data;


import lombok.Data;

@Data
public class Address {
	private int house_no;
	private String address;
	private String landmark;
	private String other_landmark;
	private String city;
	private long pincode;
	private String country;
}
