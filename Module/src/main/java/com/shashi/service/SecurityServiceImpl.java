package com.shashi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
    private AuthenticationManager authenticationManager;
	
	
	
	@Override
	public void autoLogin(String email, String password) {
		// TODO Auto-generated method stub

	}



}
