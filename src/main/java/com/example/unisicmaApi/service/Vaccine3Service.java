package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine3;
import com.example.unisicmaApi.repository.Vaccine3Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine3Service {
	
	@Autowired
	Vaccine3Repository vaccine3Repository;

	public boolean saveV3(Vaccine3 vaccine3) {
		log.traceEntry();
		
		   vaccine3Repository.save(vaccine3);
			
			log.traceExit();
		return true;
	}
	

}
