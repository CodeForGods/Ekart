package com.ekart.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekart.entity.User;
import com.ekart.entity.UserAddress;
import com.ekart.repository.UserRepository;

@Service(value="userServiceImpl")
@Transactional
public class UserServiceImpl  implements UserService{
	
	@Autowired 
	UserRepository userRepository;
	@Override
	public List<UserAddress> getUserAddress(Integer userId) throws Exception{
		Optional<User> opt = userRepository.findById(userId);
		User user  = opt.orElseThrow(()-> new Exception("No user found"));
		System.out.println(user.getUserAddress());	
		return null;
	}
	

}
