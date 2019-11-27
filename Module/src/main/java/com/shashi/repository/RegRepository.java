package com.shashi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashi.model.RegEmployee;


public interface RegRepository extends JpaRepository<RegEmployee, Long> {

	 RegEmployee findByUsername(String username); 

}
