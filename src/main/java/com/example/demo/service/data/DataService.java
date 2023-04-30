package com.example.demo.service.data;

import com.example.demo.data.PersonData;
import com.example.demo.data.ResponseFormat;

import java.util.List;

public interface DataService {

    public List<PersonData> getAllData();
    public PersonData getData(String Id);
    public ResponseFormat saveData(PersonData personData);
    public ResponseFormat alterData(PersonData personData, String Id);
    public ResponseFormat dropAllData();
    public ResponseFormat dropData(String Id);

}
