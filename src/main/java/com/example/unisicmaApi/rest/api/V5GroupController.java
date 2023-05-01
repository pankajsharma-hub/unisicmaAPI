package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.unisicmaApi.models.V5Group;
import com.example.unisicmaApi.service.V5GroupService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class V5GroupController {
	
	@Autowired
	V5GroupService v5GroupService;
	
	@PostMapping(path ="/saveChild/v5",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody V5Group v5Group){
		log.traceEntry();
         v5GroupService.saveV5(v5Group);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
