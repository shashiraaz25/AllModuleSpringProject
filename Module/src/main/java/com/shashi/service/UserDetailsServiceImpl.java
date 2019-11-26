package com.shashi.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;

import com.shashi.model.RegEmployee;
import com.shashi.repository.RegRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	private RegRepository regrepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 RegEmployee regemployee = regrepository.findByUsername(username);
	        if (regemployee == null) throw new UsernameNotFoundException(username);

	        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
	        for 
	        (Role role : RegEmployee.getRoles())
	        {
	            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
	        }

	        return new org.springframework.security.core.userdetails.User(regemployee.getName(), regemployee.getPassword(), grantedAuthorities);
	    }
}
