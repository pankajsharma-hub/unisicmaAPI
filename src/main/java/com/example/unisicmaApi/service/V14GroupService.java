package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.V14Group;
import com.example.unisicmaApi.repository.V14GroupRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class V14GroupService {
	
	@Autowired
	V14GroupRepository v14GroupRepository;

	public boolean saveV14(V14Group v14Group) {
		log.traceEntry();
		
		   v14GroupRepository.save(v14Group);
			
			log.traceExit();
		return true;
	}
	
	

}
