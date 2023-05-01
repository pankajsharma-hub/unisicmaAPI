package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine11;
import com.example.unisicmaApi.repository.Vaccine11Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine11Service {
	
	@Autowired
	Vaccine11Repository vaccine11Repository;

	public boolean saveV11(Vaccine11 vaccine11) {
		log.traceEntry();
		
		   vaccine11Repository.save(vaccine11);
			
			log.traceExit();
		return true;
	}
	
	

}
