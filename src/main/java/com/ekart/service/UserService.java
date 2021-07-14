package com.ekart.service;

import java.util.List;

import com.ekart.entity.UserAddress;

public interface UserService {
	
	public List<UserAddress> getUserAddress(Integer userId) throws Exception;
	
}
