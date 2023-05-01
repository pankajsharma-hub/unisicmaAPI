package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine10;

import com.example.unisicmaApi.service.Vaccine10Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine10Controller {
	
	@Autowired
	Vaccine10Service v10Service;
	
	@PostMapping(path ="/saveChild/v10",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine10 vaccine10){
		log.traceEntry();
        v10Service.saveV10(vaccine10);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
