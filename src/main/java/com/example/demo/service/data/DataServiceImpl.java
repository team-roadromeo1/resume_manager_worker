package com.example.demo.service.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.data.PersonData;
import com.example.demo.data.ResponseFormat;
import com.example.demo.repository.DataRepository;

@Service
public class DataServiceImpl implements  DataService{
	
	@Autowired
	DataRepository repo;
	@Autowired
	ResponseFormat format;
		
	@Override
	public List<PersonData> getAllData(){

		List<PersonData> personDataList = new ArrayList<PersonData>();
		repo.findAll().forEach(personDataList::add);

		return  personDataList;
	}

	@Override
	public PersonData getData(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public ResponseFormat saveData(PersonData data) {
		
		
		repo.save(data);
		
		format.setStatus(HttpStatus.OK.value());
		format.setMessage("Data Saved Successfully");
		format.setTimeStamp(System.currentTimeMillis());
		return format;
	}

	@Override
	public ResponseFormat alterData(PersonData data, Long id) {
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
