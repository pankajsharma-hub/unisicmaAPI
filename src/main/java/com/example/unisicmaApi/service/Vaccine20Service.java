package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Vaccine20;
import com.example.unisicmaApi.repository.Vaccine20Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Vaccine20Service {
	@Autowired
	Vaccine20Repository vaccine20Repository;

	public boolean saveV20(Vaccine20 vaccine20) {
		log.traceEntry();
		
		   vaccine20Repository.save(vaccine20);
			
			log.traceExit();
		return true;
	}
}
