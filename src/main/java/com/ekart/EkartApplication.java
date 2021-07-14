package com.ekart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ekart.dto.SellerDTO;
import com.ekart.service.SellerServiceImpl;
import com.ekart.service.UserServiceImpl;

@SpringBootApplication
public class EkartApplication implements CommandLineRunner {
		@Autowired
		UserServiceImpl userServiceImpl;
		@Autowired
		SellerServiceImpl sellerServiceImpl;
	public static void main(String[] args) {
		SpringApplication.run(EkartApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		SellerDTO seller = new SellerDTO();
		seller.setSellerAddress("GUrgaonFaridabad");
		seller.setSellerEmail("devEncrypted@ias");
		seller.setSellerName("DeveshEncrypted");
		seller.setSellerPassword("dera1@123");
		System.out.println(sellerServiceImpl.getProducts("x3x@x.com"));
	}
}
