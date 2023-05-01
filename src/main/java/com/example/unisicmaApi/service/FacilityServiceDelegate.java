package com.example.unisicmaApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unisicmaApi.models.Facility_master;
import com.example.unisicmaApi.repository.Facility_masterRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class FacilityServiceDelegate {
	
	@Autowired
	Facility_masterRepository facility_masterRepository;

	public List<Facility_master> getAllFacilities(String facility_id) {
		log.traceEntry();
		log.traceExit();
		return (List<Facility_master>) facility_masterRepository.findAll();
		
	}

}
