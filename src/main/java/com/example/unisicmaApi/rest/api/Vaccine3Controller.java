package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine3;
import com.example.unisicmaApi.service.Vaccine3Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine3Controller {
	
	@Autowired
	Vaccine3Service vaccine3Service;
	
	@PostMapping(path ="/saveChild/v3",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine3 vaccine3){
		log.traceEntry();
        vaccine3Service.saveV3(vaccine3);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
