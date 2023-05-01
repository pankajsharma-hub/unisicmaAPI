package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine19;
import com.example.unisicmaApi.service.Vaccine19Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine19Controller {
	@Autowired
	Vaccine19Service vaccine19Service;
	
	@PostMapping(path ="/saveChild/v19",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine19 vaccine19){
		log.traceEntry();
         vaccine19Service.saveV19(vaccine19);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
