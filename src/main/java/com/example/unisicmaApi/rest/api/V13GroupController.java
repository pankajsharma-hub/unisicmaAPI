package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.V13Group;

import com.example.unisicmaApi.service.V13GroupService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class V13GroupController {
	
	@Autowired
	V13GroupService v13GroupService;
	
	@PostMapping(path ="/saveChild/v13",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody V13Group v13Group){
		log.traceEntry();
         v13GroupService.saveV13(v13Group);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
