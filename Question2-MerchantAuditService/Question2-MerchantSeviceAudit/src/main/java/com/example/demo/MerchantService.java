package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MerchantService {
	
	private List<Merchant> merchants = new ArrayList<>();
    


	 void createMerchant(String name, String merchantId)
	 {
		  Merchant merchant = new Merchant( name, merchantId);
	        merchants.add(merchant);
	 }
	 
	 void deleteMerchant(String merchantId)
	 {
		   for(Merchant m1:merchants)
		   {
			   if(m1.getMerchantId().equals(merchantId))
			   {
				   merchants.remove(m1);
			   }
		   }
	         
	 }
	 
	 List<Merchant> getallMerchant( )
	 {
		   return merchants;
	         
	 }
	 
	 
}
