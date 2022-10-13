package com.tech.socialsecurity.service;

import java.util.Optional;

import com.tech.socialsecurity.entity.SocialSecurityNumber;

public interface SocialSecurityNumberService {

	SocialSecurityNumber getStateDetails(Integer code);



	SocialSecurityNumber saveSocialSecurity(SocialSecurityNumber socialSecurityNumber);



	

}
