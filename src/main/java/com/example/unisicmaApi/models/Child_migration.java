package com.example.unisicmaApi.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table("child_migration")
@Data
public class Child_migration {

	@PrimaryKey
	private String rch_child_id;
	

	private String date_of_migration;
	private String migrating_facility_id;
	
}
