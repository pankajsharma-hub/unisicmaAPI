package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine10;
import com.example.unisicmaApi.repository.Vaccine10Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine10Service {
	
	@Autowired
	Vaccine10Repository vaccine10Repository;

	public boolean saveV10(Vaccine10 vaccine10) {
		log.traceEntry();
		
		   vaccine10Repository.save(vaccine10);
			
			log.traceExit();
		return true;
	
	}
	

}
