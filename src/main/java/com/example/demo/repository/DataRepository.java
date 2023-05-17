package com.example.demo.repository;

import com.example.demo.data.PersonData;
import org.springframework.data.repository.CrudRepository;


public interface DataRepository extends CrudRepository<PersonData, Long> {
	
}
