package com.example.unisicmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.V1;
import com.example.unisicmaApi.repository.V1Repository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class V1Service {

	@Autowired
	V1Repository v1Repository;

	public boolean saveV1(V1 v1) {
		
		log.traceEntry();
		
		   v1Repository.save(v1);
			
			log.traceExit();

		
		return true;
	}
}
