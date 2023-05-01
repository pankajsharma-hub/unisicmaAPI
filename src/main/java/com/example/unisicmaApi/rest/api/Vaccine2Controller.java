package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine2;
import com.example.unisicmaApi.service.Vaccine2Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine2Controller {
	
	@Autowired
	Vaccine2Service vaccine2Service;
	
	@PostMapping(path ="/saveChild/v2",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine2 vaccine2){
		log.traceEntry();
         vaccine2Service.saveV2(vaccine2);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
