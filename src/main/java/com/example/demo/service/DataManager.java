package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.data.PersonData;
import com.example.demo.data.ResponseFormat;
import com.example.demo.repository.DataRepository;

@Service
public class DataManager {
	
	@Autowired
	DataRepository repo;
	@Autowired
	ResponseFormat format;
		
	
	public List<PersonData> getData(){
		return repo.findAll();
	}
	
	public PersonData getData(String id) {
		return repo.findById(id).get();
	}
	
	public ResponseFormat saveData(PersonData data) {
		
		
		repo.save(data);
		
		format.setStatus(HttpStatus.OK.value());
		format.setMessage("Data Saved Successfully");
		format.setTimeStamp(System.currentTimeMillis());
		return format;
	}
	
	public ResponseFormat alterData(PersonData data, String id) {
		data.setId(id);
		repo.save(data);
		format.setStatus(HttpStatus.OK.value());
		format.setMessage("Data Updated Successfully.");
		format.setTimeStamp(System.currentTimeMillis());
		return format;
	}
	
	public ResponseFormat alterSkills(String[] skills, String id) {
		PersonData data = repo.findById(id).get();
		data.setSkills(Arrays.asList(skills));	
		repo.save(data);
		format.setStatus(HttpStatus.OK.value());
		format.setMessage("Skills Updated Successfully.");
		format.setTimeStamp(System.currentTimeMillis());
		return format;
	}
	
	public ResponseFormat dropAllData() {
		repo.deleteAll();
		format.setStatus(HttpStatus.OK.value());
		format.setMessage("All Data Deleted Successfully");
		format.setTimeStamp(System.currentTimeMillis());
		return format;
	}
	
	public ResponseFormat dropData(String id) {
		repo.deleteById(id);
		format.setStatus(HttpStatus.OK.value());
		format.setMessage("Data deleted successfully for : " + id);
		format.setTimeStamp(System.currentTimeMillis());
		return format;
	}
	
	
}
