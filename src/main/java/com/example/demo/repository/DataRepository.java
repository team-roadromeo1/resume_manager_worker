package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.data.PersonData;


public interface DataRepository extends MongoRepository<PersonData, String>{
	
}
