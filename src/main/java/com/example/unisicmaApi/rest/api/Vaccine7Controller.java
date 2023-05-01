package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine7;
import com.example.unisicmaApi.service.Vaccine7Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine7Controller {
	
	@Autowired
	Vaccine7Service vaccine7Service;
	
	@PostMapping(path ="/saveChild/v7",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine7 vaccine7){
		log.traceEntry();
         vaccine7Service.saveV7(vaccine7);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
