package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine16;
import com.example.unisicmaApi.service.Vaccine16Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine16Controller {
	
	@Autowired
	Vaccine16Service vaccine16Service;
	
	@PostMapping(path ="/saveChild/v16",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine16 vaccine16){
		log.traceEntry();
         vaccine16Service.saveV16(vaccine16);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
