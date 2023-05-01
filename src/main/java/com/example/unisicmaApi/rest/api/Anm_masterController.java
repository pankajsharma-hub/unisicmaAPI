package com.example.unisicmaApi.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Anm_master;
import com.example.unisicmaApi.service.AnmServiceDelegate;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/anm")
@Log4j2
public class Anm_masterController {
	
	@Autowired
	AnmServiceDelegate anmServiceDelegate;
	
	@GetMapping("/login")
	public List<Anm_master> getAnmDetail(@RequestParam(required = true,name = "anm_id")String anm_id){
		log.traceEntry("{}",anm_id);
		List<Anm_master> anm_details = anmServiceDelegate.getAnmDetail(anm_id);
		return log.traceExit(anm_details);
	}
	
	@GetMapping("/allAnms")
	public List<Anm_master> getAnmDetails(){
		log.traceEntry();
		List<Anm_master> anm_details = anmServiceDelegate.getAnmDetails();
		return log.traceExit(anm_details);
	}

}
