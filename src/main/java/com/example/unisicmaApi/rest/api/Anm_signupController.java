package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Anm_signup;
import com.example.unisicmaApi.service.AnmSignupService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/anm")
@Log4j2
public class Anm_signupController {
	
	@Autowired
	AnmSignupService anmSignupService;
	
	@PostMapping(path ="/signup",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveChildInfo(@RequestBody Anm_signup anm_signup){
		log.traceEntry();
         anmSignupService.saveAnm(anm_signup);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

}
