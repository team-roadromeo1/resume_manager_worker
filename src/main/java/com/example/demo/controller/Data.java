package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.PersonData;
import com.example.demo.mapping.UrlMapper;
import com.example.demo.service.DataManager;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping(value = UrlMapper.globalUrl)
public class Data {

	@Autowired
	DataManager manager;

	@ApiOperation(value = "Get all users", notes = "It will fetch all the users.")
	@io.swagger.annotations.ApiResponses(value = { @ApiResponse(code = 200, message = "Succesful operation"),
			@ApiResponse(code = 404, message = "Record Not Found") })
	@RequestMapping(value = "/data/", method = RequestMethod.GET)
	public ResponseEntity<?> getAllData() {
		return ResponseEntity.ok(manager.getData());
	}

	@ApiOperation(value = "Get the data from Id")
	@io.swagger.annotations.ApiResponses(value = { @ApiResponse(code = 200, message = "Successful Operation"),
			@ApiResponse(code = 404, message = "Record not found") })
	@RequestMapping(value = "/data/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getData(@PathVariable("id") String id) {
		return ResponseEntity.ok(manager.getData(id));
	}

	@ApiOperation(value = "Save the data")
	@io.swagger.annotations.ApiResponses(value = { @ApiResponse(code = 201, message = "Record Created") })
	@RequestMapping(value = "/save/", method = RequestMethod.POST)
	public ResponseEntity<?> saveData(@Valid @RequestBody PersonData data) {
		return ResponseEntity.ok(manager.saveData(data));
	}

	@ApiOperation(value = "Update the whole record.")
	@io.swagger.annotations.ApiResponses(value = { @ApiResponse(code = 200, message = "Record Updated.") })
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PATCH)
	public ResponseEntity<?> updateData(@Valid @RequestBody PersonData data, @PathVariable("id") String id) {
		return ResponseEntity.ok(manager.alterData(data, id));
	}

	// custom put method implementation....
	@ApiOperation(value = "Update the skills.")
	@io.swagger.annotations.ApiResponses(value = {
			@ApiResponse(code = 200, message = "Record patched.")
	})
	@RequestMapping(value = "/update/skills/{id}", method = RequestMethod.PATCH)
	public ResponseEntity<?> updateSkills(@RequestBody String[] skils, @PathVariable("id") String id) {
		return ResponseEntity.ok(manager.alterSkills(skils, id));
	}

	@ApiOperation(value = "Delete all records.")
	@io.swagger.annotations.ApiResponses(value = { @ApiResponse(code = 200, message = "All Records deleted.") })
	@RequestMapping(value = "/delete/", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteAllData() {
		return ResponseEntity.ok(manager.dropAllData());
	}

	@ApiOperation(value = "Delete records from an Id.")
	@io.swagger.annotations.ApiResponses(value = { @ApiResponse(code = 200, message = "Record deleted.") })
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteData(@PathVariable("id") String id) {
		return ResponseEntity.ok(manager.dropData(id));
	}
}
