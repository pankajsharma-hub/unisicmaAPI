package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine18;
import com.example.unisicmaApi.repository.Vaccine18Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine18Service {
	
	@Autowired
	Vaccine18Repository vaccine18Repository;

	public boolean saveV18(Vaccine18 vaccine18) {
		log.traceEntry();
		
		   vaccine18Repository.save(vaccine18);
			
			log.traceExit();
		return true;
	}
	

}
