package com.example.unisicmaApi.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;
@Data
@Table("vaccine_barcode")
public class UpdateVaccines {
	
	@PrimaryKey
	private String barcode_no;
	
	private String batch_no;
	private String vaccination_date;
	private String manufacturing_date;
	private String manufacturer;
	private String expiry_date;
	private String vaccine_name;
	private String vaccine_id;
	

}
