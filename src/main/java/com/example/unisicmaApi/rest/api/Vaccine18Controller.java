package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine18;
import com.example.unisicmaApi.service.Vaccine18Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine18Controller {
	
	@Autowired
	Vaccine18Service vaccine18Service;
	
	@PostMapping(path ="/saveChild/v18",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine18 vaccine18){
		log.traceEntry();
         vaccine18Service.saveV18(vaccine18);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}
}
