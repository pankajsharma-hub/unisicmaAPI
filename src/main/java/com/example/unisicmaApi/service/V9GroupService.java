package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.V9Group;
import com.example.unisicmaApi.repository.V9GroupRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class V9GroupService {
	
	@Autowired
	V9GroupRepository v9GroupRepository;

	public boolean saveV9(V9Group v9Group) {
		

		log.traceEntry();
		
		   v9GroupRepository.save(v9Group);
			
			log.traceExit();
		return true;
	}
	
	

}
