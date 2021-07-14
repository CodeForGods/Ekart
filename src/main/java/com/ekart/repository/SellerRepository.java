package com.ekart.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ekart.entity.Seller;

public interface SellerRepository extends CrudRepository<Seller, Integer>{
	
	Optional<Seller> findBySellerEmail(String emailId);
	
}
