package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine12;
import com.example.unisicmaApi.repository.Vaccine12Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine12Service {
	
	@Autowired
	Vaccine12Repository vaccine12Repository;

	public boolean saveV12(Vaccine12 vaccine12) {
		log.traceEntry();
		
		   vaccine12Repository.save(vaccine12);
			
			log.traceExit();
		return true;
	}
	

}
