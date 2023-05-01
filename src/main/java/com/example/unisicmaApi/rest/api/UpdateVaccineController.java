package com.example.unisicmaApi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unisicmaApi.models.UpdateVaccines;
import com.example.unisicmaApi.repository.UpdateVaccineRepository;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api")
@Log4j2
public class UpdateVaccineController {
	
	@Autowired
	UpdateVaccineRepository update;
	
	@PostMapping(path ="/updateVaccine",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateVaccination(@RequestBody UpdateVaccines updateVaccines){
		log.traceEntry();
        update.save(updateVaccines);
		log.traceExit();
		//return isAdded ? "Success":"Failed";
	}

	

}
