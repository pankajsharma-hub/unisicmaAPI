package com.example.unisicmaApi.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.unisicmaApi.models.Anm_master;

public interface Anm_masterRepository extends CrudRepository<Anm_master, String>{

	@Query("Select * from anm_master where anm_id= ?0 allow filtering")
	List<Anm_master> findByAnmId(String anm_id);



	

}
