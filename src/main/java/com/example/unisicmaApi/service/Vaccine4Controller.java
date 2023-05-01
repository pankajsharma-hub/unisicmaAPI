package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine4;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine4Controller {
	
	@Autowired
	Vaccine4Service vaccine4Service;
	
	@PostMapping(path ="/saveChild/v4",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveChildInfo(@RequestBody Vaccine4 vaccine4){
		log.traceEntry();
        boolean isAdded = vaccine4Service.saveV4(vaccine4);
		log.traceExit();
		return isAdded ? "Success":"Failed";
	}

}
