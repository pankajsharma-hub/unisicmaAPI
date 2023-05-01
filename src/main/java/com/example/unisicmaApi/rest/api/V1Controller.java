package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.V1;

import com.example.unisicmaApi.service.V1Service;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class V1Controller {
	
	@Autowired
	V1Service v1Service;
	
	@PostMapping(path ="/saveChild/v1",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody V1 v1){
		log.traceEntry();
         v1Service.saveV1(v1);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
