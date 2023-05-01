package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine7;
import com.example.unisicmaApi.repository.Vaccine7Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine7Service {
	
	@Autowired
	Vaccine7Repository vaccine7Repository;

	public boolean saveV7(Vaccine7 vaccine7) {
		log.traceEntry();
		
		   vaccine7Repository.save(vaccine7);
			
			log.traceExit();
		return true;
	}

}
