package com.shashi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashi.model.RegEmployee;
import com.shashi.repository.RegRepository;
@Service
public class RegServiceImpl implements RegService {

	@Autowired
	public RegRepository regrepository;
	
	
	@Override
	public void save(RegEmployee regemployee) {
		/*
		 * regemployee.setPassword(bCryptPasswordEncoder.encode(regemployee.getPassword(
		 * )));
		 */
	
		regrepository.save(regemployee);
    }

}
