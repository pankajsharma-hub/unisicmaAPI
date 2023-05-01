package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Vaccine17;
import com.example.unisicmaApi.service.Vaccine17Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Vaccine17Controller {
	
	@Autowired
	Vaccine17Service vaccine17Service;
	
	@PostMapping(path ="/saveChild/v17",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Vaccine17 vaccine17){
		log.traceEntry();
         vaccine17Service.saveV17(vaccine17);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
