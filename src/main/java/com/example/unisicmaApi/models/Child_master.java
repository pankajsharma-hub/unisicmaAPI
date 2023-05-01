package com.example.unisicmaApi.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.LocalDate;

import lombok.Data;






@Data
@UserDefinedType
class vaccine{
	 String date_at;
	 String weight_at_vaccination;
	 String anm_id_at_vaccination;
	 String facility_id;
	 String barcode_no;
	
	}
@Data
@Table("child_master_portal")
public class Child_master {

	@PrimaryKey
	private String rch_child_id;
	
	private String anm_id;
	private String anm_name;
	private String anm_mobile;
	private float birth_weight;
	private String child_dob;
	private String child_name;
	private String child_sex;
	private String delivery_facility_id;
	private String enrollment_date;
	private String father_mobile;
	private String father_name;
	private String mother_mobile;
	private String mother_name;
	
	private String rch_mother_id;
	private String resident_block;
	private String resident_district;
	private String resident_facility_id;
	private String resident_phc;
	private String resident_sc;
	private String resident_state;
	private String resident_village;
	
	private vaccine v1;
	private vaccine v2;
	private vaccine v3;
	private vaccine v4;
	private vaccine v5;
	private vaccine v6;
	private vaccine v7;
	private vaccine v8;
	private vaccine v9;
	private vaccine v10;
	private vaccine v11;
	private vaccine v12;
	private vaccine v13;
	private vaccine v14;
	private vaccine v15;
	private vaccine v16;
	private vaccine v17;
	private vaccine v18;
	private vaccine v19;
	private vaccine v20;
	private vaccine v21;
	
	
	private String next_vaccine_id;
	private LocalDate next_vaccine_session1;
	
	
}
