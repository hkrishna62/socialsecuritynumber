package com.tech.socialsecurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="socialsecuritynumber")
public class SocialSecurityNumber {
	
	
	@Id
	@Column(name="code")
	private Integer code;
	
	@Column(name="statename")
	private String stateName;

		



	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
	
	
	
	
	

}
