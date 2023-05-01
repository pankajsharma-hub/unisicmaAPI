package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine15;
import com.example.unisicmaApi.repository.Vaccine15Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine15Service {
	
	@Autowired
	Vaccine15Repository vaccine15Repository;

	public boolean saveV15(Vaccine15 vaccine15) {
		log.traceEntry();
		
		   vaccine15Repository.save(vaccine15);
			
			log.traceExit();
		return true;
	}

}
