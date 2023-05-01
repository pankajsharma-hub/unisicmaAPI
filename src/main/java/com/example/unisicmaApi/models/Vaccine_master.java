package com.example.unisicmaApi.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Data
@Table("vaccine_barcode")
public class Vaccine_master {
	@PrimaryKey
	private String barcode_no;
	
	private String vaccination_date;
	
	private String vaccine_id;
	private String vaccine_name;
	private String batch_no;
	
	private String expiry_date;
	private String manufacturing_date;
	private String manufacturer;
	

	

}
