package com.example.unisicmaApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.example.unisicmaApi.models.Child_master;

import com.example.unisicmaApi.repository.Child_masterRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ChildServiceDelegate {
	
	@Autowired
	Child_masterRepository child_masterRepository;

	public boolean saveChidInfo(List<Child_master> child) {
		log.traceEntry();
		child_masterRepository.saveAll(child);
		log.traceExit();
		return true;
	}


	public List<Child_master> getAllChildrenByAnm(String anm_id) {
		log.traceEntry();
		log.traceExit();
		
	 return child_masterRepository.findAllByAnm(anm_id);
	}

public boolean saveChild(Child_master child) {
		log.traceEntry();
		
	
	   child_masterRepository.save(child);
		
		log.traceExit();

		return true;
	}


public List<Child_master> getAllChildren(String resident_state, String resident_district, String resident_phc,
		String resident_sc,String anm_id) {
	log.traceEntry();
	log.traceExit();
	 return child_masterRepository.findAllById(resident_state,resident_district,resident_phc,resident_sc,anm_id);

}


	
	
	

}
