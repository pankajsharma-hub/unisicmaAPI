package com.example.unisicmaApi.models;


import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;


@Table("anm_master")
@Data
public class Anm_master {

	@PrimaryKey
	private String anm_id;
	
	private String anm_address;
	private String anm_mobile;
	private String anm_name;
	private String current_facility_id;
	private String join_date;
		
}
