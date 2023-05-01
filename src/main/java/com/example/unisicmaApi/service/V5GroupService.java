package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.V5Group;
import com.example.unisicmaApi.repository.V5GroupRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class V5GroupService {
	
	@Autowired
	V5GroupRepository v5Grouprepository;

	public boolean saveV5(V5Group v5Group) {
		
		log.traceEntry();
		
		   v5Grouprepository.save(v5Group);
			
			log.traceExit();
		return true;
	}

}
