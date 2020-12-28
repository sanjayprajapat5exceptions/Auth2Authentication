package com.sanjay.restApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjay.restApi.entity.User;
@Repository
public interface UserDetailRepo extends JpaRepository<User, Long>  {

	public User findByUserName(String userName);

	

	

}
