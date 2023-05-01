package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.V13Group;
import com.example.unisicmaApi.repository.V13GroupRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class V13GroupService {
	
	@Autowired
	V13GroupRepository v13GroupRepository;

	public boolean saveV13(V13Group v13Group) {
		log.traceEntry();
		
		   v13GroupRepository.save(v13Group);
			
			log.traceExit();

		
		return true;
	}
	
	

}
