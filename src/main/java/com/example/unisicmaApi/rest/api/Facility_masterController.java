package com.example.unisicmaApi.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Facility_master;
import com.example.unisicmaApi.service.FacilityServiceDelegate;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/facility_details")
@Log4j2
public class Facility_masterController {
	
	@Autowired
	FacilityServiceDelegate facilityServiceDelegate;
	
	
	@GetMapping
	public List<Facility_master> getAllChildren(@RequestParam(required = false,name = "facility_id")String facility_id){
		log.traceEntry("{}",facility_id);
		List<Facility_master> children = facilityServiceDelegate.getAllFacilities(facility_id);
		return log.traceExit(children);
	}

}
