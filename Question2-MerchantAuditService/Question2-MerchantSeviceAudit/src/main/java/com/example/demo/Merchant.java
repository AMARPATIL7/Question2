package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Merchant {
	@Id
	String merchantId;
	String name; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	public Merchant()
	{
		
	}
	public Merchant(String name, String merchantId) {
		super();
		this.name = name;
		this.merchantId = merchantId;
	}
	@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", name=" + name + "]";
	}

	
}
