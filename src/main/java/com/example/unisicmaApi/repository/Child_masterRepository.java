package com.example.unisicmaApi.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.unisicmaApi.models.Child_master;

public interface Child_masterRepository extends CrudRepository<Child_master, String>{

	@Query("Select * from child_master_portal where anm_id = ?0 allow filtering")
	List<Child_master> findAllByAnm(String anm_id);

	@Query("Select * from child_master where resident_state = ?0 and resident_district = ?1 and resident_phc = ?2 and resident_sc = ?3 and anm_id= ?4 allow filtering")
    List<Child_master> findAllById(String resident_state, String resident_district, String resident_phc,
			String resident_sc,String anm_id);

}
