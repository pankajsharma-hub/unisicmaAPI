package com.example.unisicmaApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.unisicmaApi.models.Anm_master;
import com.example.unisicmaApi.repository.Anm_masterRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class AnmServiceDelegate {
	
	@Autowired
	Anm_masterRepository anm_masterRepository;

	public List<Anm_master> getAnmDetail(String anm_id) {
		log.traceEntry();
		log.traceExit();
		return anm_masterRepository.findByAnmId(anm_id);
	}

	public List<Anm_master> getAnmDetails() {
		log.traceEntry();
		log.traceExit();
		return (List<Anm_master>) anm_masterRepository.findAll();
	}
		
	}

	
					

