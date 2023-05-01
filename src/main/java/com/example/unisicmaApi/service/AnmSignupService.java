package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Anm_signup;
import com.example.unisicmaApi.repository.ANMSignupRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class AnmSignupService {
	
	@Autowired
	ANMSignupRepository anmSignupRepository;

	public boolean saveAnm(Anm_signup anm_signup) {
		log.traceEntry();
		
		
		   anmSignupRepository.save(anm_signup);
			
			log.traceExit();

			return true;
	}
	
	

}
