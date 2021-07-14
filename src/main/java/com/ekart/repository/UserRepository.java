package com.ekart.repository;

import org.springframework.data.repository.CrudRepository;

import com.ekart.entity.User;

public interface UserRepository  extends CrudRepository<User, Integer>{
	

}
