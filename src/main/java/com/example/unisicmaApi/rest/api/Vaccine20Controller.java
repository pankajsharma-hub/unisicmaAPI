package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine20;
import com.example.unisicmaApi.service.Vaccine20Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine20Controller {
	@Autowired
	Vaccine20Service vaccine20Service;
	
	@PostMapping(path ="/saveChild/v20",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine20 vaccine20){
		log.traceEntry();
         vaccine20Service.saveV20(vaccine20);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}
}
