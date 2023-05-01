package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine16;
import com.example.unisicmaApi.repository.Vaccine16Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine16Service {
	
	@Autowired
	Vaccine16Repository vaccine16Repository;

	public boolean saveV16(Vaccine16 vaccine16) {
		log.traceEntry();
		
		   vaccine16Repository.save(vaccine16);
			
			log.traceExit();
		return true;
	}

}
