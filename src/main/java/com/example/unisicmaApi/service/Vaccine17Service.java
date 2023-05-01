package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine17;
import com.example.unisicmaApi.repository.Vaccine17Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine17Service {
	
	@Autowired
	Vaccine17Repository vaccine17Repository;

	public boolean saveV17(Vaccine17 vaccine17) {
		log.traceEntry();
		
		   vaccine17Repository.save(vaccine17);
			
			log.traceExit();
		return true;
	}

}
