package com.ekart.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekart.dto.ProductsDTO;
import com.ekart.dto.SellerDTO;
import com.ekart.entity.Seller;
import com.ekart.exception.SellerServiceException;
import com.ekart.repository.SellerRepository;

@Service(value = "sellerServiceImpl")
@Transactional
public class SellerServiceImpl implements SellerService {
	@Autowired
	SellerRepository sellerRepository;
	StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
	@Override
	public String registerSeller(SellerDTO seller) throws Exception {
		// TODO Auto-generated method stub
		Optional<Seller> opt = sellerRepository.findBySellerEmail(seller.getSellerEmail());
		if (opt.isEmpty()) {
			Seller s = new Seller();
			s.setSellerAddress(seller.getSellerAddress());
			s.setSellerEmail(seller.getSellerEmail());
			s.setSellerName(seller.getSellerName());
			String passEnc = encryptor.encryptPassword(seller.getSellerPassword());
			s.setSellerPassword(passEnc);
			sellerRepository.save(s);
			return "Registered Successfully";
		} else {
			throw new Exception("Customer Already exists");
		}
	}
	
	@Override
	public String loginSeller(SellerDTO seller) throws Exception {
		Optional<Seller> opt = sellerRepository.findBySellerEmail(seller.getSellerEmail());
		Seller s = opt.orElseThrow(()->new Exception("SELLER.NOT_FOUND"));
		if(encryptor.checkPassword(seller.getSellerPassword(), s.getSellerPassword())==true) {			
			return "Right";
		}
		else {
			throw new Exception("Seller.WRONG_CREDENTIALS");
		}
		
	}
	
	@Override
	public List<ProductsDTO> getProducts(String emailId) throws SellerServiceException {
		
		Optional<Seller> opt = sellerRepository.findBySellerEmail(emailId);
		Seller s  = opt.orElseThrow(()->new SellerServiceException("SellerService.NO_SELLER_FOUND"));
		
		System.out.println(s.getProducts());
		return null;

	}

	
	
}
