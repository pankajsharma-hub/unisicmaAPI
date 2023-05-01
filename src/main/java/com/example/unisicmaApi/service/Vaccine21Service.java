package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine21;
import com.example.unisicmaApi.repository.Vaccine21Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine21Service {
	
	@Autowired
	Vaccine21Repository vaccine21Repository;

	public boolean saveV21(Vaccine21 vaccine21) {
		log.traceEntry();
		
		   vaccine21Repository.save(vaccine21);
			
			log.traceExit();
		return true;
	}
	

}
