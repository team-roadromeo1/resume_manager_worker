package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.data.Address;
import com.example.demo.data.Person;

@Component
public class TestData {
    
    public Person getPersonData(Long id){
        Person personData = new Person(id, "John", "Doe", "john1test@email.com", "1234567890");           
        return personData; 
    }

    public Address getAddressData(Long id){
        Address addressData = new Address(id, 1, "test street", "test block", "near test building", "testvile", 123456, "testland");
        return addressData;
    }
}
