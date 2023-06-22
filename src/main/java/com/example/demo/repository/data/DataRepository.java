package com.example.demo.repository.data;

import com.example.demo.data.PersonData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends CrudRepository<PersonData, Long> {
	
}
