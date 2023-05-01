package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine19;
import com.example.unisicmaApi.repository.Vaccine19Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine19Service {
	
	@Autowired
	Vaccine19Repository vaccine19Repository;

	public boolean saveV19(Vaccine19 vaccine19) {
		log.traceEntry();
		
		   vaccine19Repository.save(vaccine19);
			
			log.traceExit();
		return true;
	}


}
