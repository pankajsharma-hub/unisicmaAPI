package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine21;
import com.example.unisicmaApi.service.Vaccine21Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine21Controller {
	
	@Autowired
	Vaccine21Service vaccine21Service;
	
	@PostMapping(path ="/saveChild/v21",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine21 vaccine21){
		log.traceEntry();
         vaccine21Service.saveV21(vaccine21);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
