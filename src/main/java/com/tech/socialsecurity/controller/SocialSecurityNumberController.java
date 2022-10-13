package com.tech.socialsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.socialsecurity.entity.SocialSecurityNumber;
import com.tech.socialsecurity.service.SocialSecurityNumberService;

@RestController
public class SocialSecurityNumberController {
	
	@Autowired
	private SocialSecurityNumberService socialSecurityNumberService; 
	
	
	@GetMapping("/ssn/{code}")
	public ResponseEntity<String> getStateName(@PathVariable("code") Integer code ){
		
		String codeDigit=String.valueOf(code);
		
		char codeDigit1=codeDigit.charAt(0);
		
		code=Integer.parseInt(String.valueOf(codeDigit1));
		
		SocialSecurityNumber state=socialSecurityNumberService.getStateDetails(code);
		
		System.out.println(" state   " +state.getStateName());
		
		String stateinfo=state.getStateName();
		
		System.out.println(" stateinfo   " +stateinfo);
		
		if(stateinfo.equals("New Jersey")) {
			
			System.out.println(" state   " +state.getStateName());
			return new ResponseEntity<>(state.getStateName(), HttpStatus.OK);
		}
		else {
		
		System.out.println(" state " +state);
		
		return  new ResponseEntity<>("Invalid State", HttpStatus.NOT_ACCEPTABLE);
		}
		
	}
	
	
	@PostMapping(value="/saveSocialSecurity")
	public ResponseEntity<String> saveSocialSecurity(@RequestBody SocialSecurityNumber socialSecurityNumber){
		
		System.out.println("saveSocialSecurity :::   " + socialSecurityNumber);
		
		socialSecurityNumber= socialSecurityNumberService.saveSocialSecurity(socialSecurityNumber);
		
		
		return new ResponseEntity<>(" record inserted ", HttpStatus.OK);
		
		
	}


    // 1	Alaska
    // 2	Ohio
    //  3	New York
    // 4	Rode Island
    // 5	Los Angels
     // 6	New Jersey

}
