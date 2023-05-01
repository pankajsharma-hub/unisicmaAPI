package com.example.unisicmaApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.unisicmaApi.models.Vaccine_master;
import com.example.unisicmaApi.repository.VaccineRepository;

import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
public class Vaccine_masterService {
	@Autowired
	VaccineRepository vaccineRepository;

	public List<Vaccine_master> getVaccines(){
		log.traceEntry();
		log.traceExit();
		return (List<Vaccine_master>) vaccineRepository.findAll();
		
	}

}
