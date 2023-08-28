package com.example.manager.util;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.manager.data.Address;
import com.example.manager.data.Person;

@Component
public class TestData {

    public Person getPersonData(Long id){ 
        Person personData = new Person(id, "John", "Doe", "john1test@email.com", "1234567890", Set.of(new TestData().getAddressData(Long.valueOf(1))));           
        return personData; 
    }

    public Address getAddressData(Long id){
        Address addressData = new Address(id, 1, "test street", "test block", "near test building", "testvile", 123456, "testland");
        return addressData;
    }

    public List<Address> getAddressData(int len){

        List<Address> list = new ArrayList<>(len);
        
        for(int i = 1;i<=len;i++){
            list.add(new Address(Long.valueOf(i), i+1, "test street" + i, "test block- " + i, "near test building phase-" + i, "testvile", 101202+i, "testland"));
        }
        return list;
    }

    public List<Person> getPersonData(int len){
        List<Person> list = new ArrayList<>(len);

        for(int i = 1; i <= len; i++){
            list.add(new Person(Long.valueOf(i), "John", "Doe", "john" + i + "doe@email.com", "1234567890", Set.of(new TestData().getAddressData(Long.valueOf(1)))));
        }
        return list;
    }

}
