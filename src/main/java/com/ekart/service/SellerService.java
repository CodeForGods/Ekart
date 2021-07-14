package com.ekart.service;

import java.util.List;

import com.ekart.dto.ProductsDTO;
import com.ekart.dto.SellerDTO;

public interface SellerService {
	
	public String registerSeller(SellerDTO seller) throws Exception;
	
	public String loginSeller(SellerDTO seller) throws Exception;
	
	public List<ProductsDTO> getProducts(String emailId) throws Exception;
	
	
}
