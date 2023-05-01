package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine11;
import com.example.unisicmaApi.service.Vaccine11Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine11Controller {
	
	@Autowired
	Vaccine11Service vaccine11Service;
	
	@PostMapping(path ="/saveChild/v11",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine11 vaccine11){
		log.traceEntry();
         vaccine11Service.saveV11(vaccine11);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}
	

}
