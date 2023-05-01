package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine4;
import com.example.unisicmaApi.repository.Vaccine4Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine4Service {
	
	@Autowired
	Vaccine4Repository vaccine4Repository;

	public boolean saveV4(Vaccine4 vaccine4) {
		log.traceEntry();
		
		   vaccine4Repository.save(vaccine4);
			
			log.traceExit();
		return false;
	}

}
