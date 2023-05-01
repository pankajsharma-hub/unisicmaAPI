package com.example.unisicmaApi.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Data
@Table("anm_signup")
public class Anm_signup {
	@PrimaryKey
	private String anm_id;
	private String password;
	private String mobile;

}
