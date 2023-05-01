package com.example.unisicmaApi.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.unisicmaApi.models.Vaccine_master;
import com.example.unisicmaApi.service.Vaccine_masterService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api")
@Log4j2
public class Vaccine_masterController {
	@Autowired
	Vaccine_masterService vaccineService;
	
	@GetMapping("/getVaccines")
	public List<Vaccine_master> getVaccineDetails(){
		log.traceEntry();
		List<Vaccine_master> vaccine_details = vaccineService.getVaccines();
		return log.traceExit(vaccine_details);
	}

	

}
