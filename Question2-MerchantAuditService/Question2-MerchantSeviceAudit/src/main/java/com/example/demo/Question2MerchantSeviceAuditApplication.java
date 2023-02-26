package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Question2MerchantSeviceAuditApplication implements CommandLineRunner {

	 @Autowired
	  private MerchantService merchantService;
	    
	
	public static void main(String[] args) {
		SpringApplication.run(Question2MerchantSeviceAuditApplication.class, args);
		System.out.println("HI");
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
        merchantService.createMerchant("1", "Amar");
        merchantService.createMerchant("2", "Patil");
        merchantService.deleteMerchant("1" );
        System.out.println(merchantService.getallMerchant());
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}

	}
}
