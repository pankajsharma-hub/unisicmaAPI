package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.unisicmaApi.models.V9Group;
import com.example.unisicmaApi.service.V9GroupService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class V9GroupController {
	
	@Autowired
	V9GroupService v9GroupService;
	
	@PostMapping(path ="/saveChild/v9",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody V9Group v9Group){
		log.traceEntry();
         v9GroupService.saveV9(v9Group);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
