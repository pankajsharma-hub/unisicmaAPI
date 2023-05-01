package com.example.unisicmaApi.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.Child_master;
import com.example.unisicmaApi.service.ChildServiceDelegate;


import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/children")
@Log4j2
public class Child_masterController {
	
	@Autowired
	ChildServiceDelegate childServiceDelegate;

	@PostMapping(path = "/saveDetails",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String saveChildInfo(@RequestBody List<Child_master> child){
		log.traceEntry();
	
		boolean isAdded = childServiceDelegate.saveChidInfo(child);
		log.traceExit();
		return isAdded ? "Success":"Failed";
	}
	
	
	@PostMapping(path ="/saveChild",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveChildInfo(@RequestBody Child_master child){
		log.traceEntry();
        boolean isAdded = childServiceDelegate.saveChild(child);
		log.traceExit();
		return isAdded ? "Success":"Failed";
	}
	
	@GetMapping("/allChildren")
	public List<Child_master> getAllChildren(@RequestParam(required = true,name = "anm_id")String anm_id ){
		log.traceEntry("{}",anm_id);
		List<Child_master> children = childServiceDelegate.getAllChildrenByAnm(anm_id);
		return log.traceExit(children);
	}
	
	@RequestMapping(path = "/allChildren/id", method = RequestMethod.GET)
    public List<Child_master> getAllChildren(@RequestParam String resident_state, @RequestParam String resident_district,@RequestParam String resident_phc,
    		@RequestParam String resident_sc,@RequestParam String anm_id){
		log.traceEntry("{}",resident_state);
		log.traceEntry("{}",resident_district);

		log.traceEntry("{}",resident_phc);
		log.traceEntry("{}",resident_sc);

		List<Child_master> children = childServiceDelegate.getAllChildren(resident_state,resident_district,resident_phc,resident_sc,anm_id);
		return log.traceExit(children);
	}
	
}
