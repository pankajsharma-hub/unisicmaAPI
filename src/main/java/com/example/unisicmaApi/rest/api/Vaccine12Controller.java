package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine12;
import com.example.unisicmaApi.service.Vaccine12Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine12Controller {
	
	@Autowired
	Vaccine12Service vaccine12Service;
	
	@PostMapping(path ="/saveChild/v12",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine12 vaccine12){
		log.traceEntry();
         vaccine12Service.saveV12(vaccine12);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
