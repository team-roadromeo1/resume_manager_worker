package com.example.demo.service.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.data.Person;
import com.example.demo.data.ResponseFormat;
import com.example.demo.repository.person.PersonRepository;

@Service
public class PersonSeviceImpl implements  PersonService{
	

	@Autowired
	private PersonRepository repo;
	@Autowired
	private ResponseFormat format;
		
	@Override
	public List<Person> getAllData(){

		List<Person> personDataList = new ArrayList<Person>();
		repo.findAll().forEach(personDataList::add);
		return  personDataList;
	}

	@Override
	public Person getData(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public ResponseFormat saveData(Person data) {
		
		
		repo.save(data);
		
		format.setStatus(HttpStatus.CREATED.value());
		format.setMessage("Data Saved Successfully");
		format.setTimeStamp(System.currentTimeMillis());
		return format;
	}

	@Override
	public ResponseFormat alterData(Person data, Long id) {
		data.setId(id);
		repo.save(data);
		format.setStatus(HttpStatus.OK.value());
		format.setMessage("Data Updated Successfully.");
		format.setTimeStamp(System.currentTimeMillis());
		return format;
	}

	@Override
	public ResponseFormat dropAllData() {
		repo.deleteAll();
		format.setStatus(HttpStatus.OK.value());
		format.setMessage("All Data Deleted Successfully");
		format.setTimeStamp(System.currentTimeMillis());
		return format;
	}

	@Override
	public ResponseFormat dropData(Long id) {
		repo.deleteById(id);
		format.setStatus(HttpStatus.OK.value());
		format.setMessage("Data deleted successfully for : " + id);
		format.setTimeStamp(System.currentTimeMillis());
		return format;
	}
	
	
}
