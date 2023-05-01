package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine2;
import com.example.unisicmaApi.repository.Vaccine2Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine2Service {
	
	@Autowired
	Vaccine2Repository vaccine2Repository;

	public boolean saveV2(Vaccine2 vaccine2) {
		log.traceEntry();
		
		   vaccine2Repository.save(vaccine2);
			
			log.traceExit();
		return true;
	}
	

}
