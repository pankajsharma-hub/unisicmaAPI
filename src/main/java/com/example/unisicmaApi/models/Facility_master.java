package com.example.unisicmaApi.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table("facility_master")
@Data
public class Facility_master {

	@PrimaryKey
	private String facility_id;
	
	private String block;
	private String district;
	private String facility_name;
	private String facility_type;
	private String phc;
	private String sc;
	private String state;
	private String village;
}
