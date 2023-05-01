package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine8;
import com.example.unisicmaApi.repository.Vaccine8Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine8Service {
	
	@Autowired
	Vaccine8Repository vaccine8Repository;

	public boolean saveV8(Vaccine8 vaccine8) {
		log.traceEntry();
		
		   vaccine8Repository.save(vaccine8);
			
			log.traceExit();
		return true;
	}
	}


