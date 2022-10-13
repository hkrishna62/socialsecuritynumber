package com.tech.socialsecurity.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.socialsecurity.entity.SocialSecurityNumber;


@Repository
public interface SocialSecurityNumberRepo extends JpaRepository<SocialSecurityNumber, Integer> {

	SocialSecurityNumber findByCode(Integer code);



}
