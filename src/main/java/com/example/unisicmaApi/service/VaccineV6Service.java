package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.VaccineV6;
import com.example.unisicmaApi.repository.VaccineV6Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class VaccineV6Service {
	
	@Autowired
	VaccineV6Repository vaccineV6Repository;

	public boolean saveV6(VaccineV6 vaccine6) {
		log.traceEntry();
		
		   vaccineV6Repository.save(vaccine6);
			
			log.traceExit();
		return true;
	}
	

}
