package com.tech.socialsecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.socialsecurity.entity.SocialSecurityNumber;
import com.tech.socialsecurity.repository.SocialSecurityNumberRepo;

@Service
public class SocialSecurityNumberServiceImpl implements SocialSecurityNumberService {
	
	@Autowired
	private SocialSecurityNumberRepo socialSecurityNumberRepo;


	@Override
	public SocialSecurityNumber getStateDetails(Integer code) {
		
		return socialSecurityNumberRepo.findByCode(code);
	}


	@Override
	public SocialSecurityNumber saveSocialSecurity(SocialSecurityNumber socialSecurityNumber) {
		
		return socialSecurityNumberRepo.save(socialSecurityNumber);
	}

	

	

}
