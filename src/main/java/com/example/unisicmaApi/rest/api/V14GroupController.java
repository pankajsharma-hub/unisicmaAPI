package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.V14Group;
import com.example.unisicmaApi.service.V14GroupService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class V14GroupController  {
	
	@Autowired
	V14GroupService v14GroupService;
	
	@PostMapping(path ="/saveChild/v14",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody V14Group v14Group){
		log.traceEntry();
         v14GroupService.saveV14(v14Group);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
