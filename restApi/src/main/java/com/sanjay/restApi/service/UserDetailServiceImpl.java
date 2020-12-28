package com.sanjay.restApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sanjay.restApi.UserDetail.MyUserDetail;
import com.sanjay.restApi.dao.UserDetailRepo;
import com.sanjay.restApi.entity.User;


@Service
public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDetailRepo userDetailRepo;
	
	public List<User> listUser()
	{
		return this.userDetailRepo.findAll();
		
	}
	
	public void userSave(User user) {
		userDetailRepo.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
      User user = userDetailRepo.findByUserName(userName);
		System.out.println("inside login service ");
	    if (user == null)
	    {
	        throw new UsernameNotFoundException("Could not find user");
	    }
	         
		return new  MyUserDetail(user);
		
	}

}
