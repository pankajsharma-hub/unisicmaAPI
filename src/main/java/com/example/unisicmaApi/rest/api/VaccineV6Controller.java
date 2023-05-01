package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.unisicmaApi.models.VaccineV6;
import com.example.unisicmaApi.service.VaccineV6Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class VaccineV6Controller {
	
	@Autowired
	VaccineV6Service vaccineV6Service;
	
	@PostMapping(path ="/saveChild/v6",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody VaccineV6 vaccine6){
		log.traceEntry();
         vaccineV6Service.saveV6(vaccine6);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}


}
