package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.company.user.User;

@Service
public class StoreDataService {

	//private static final String storeDataURL = "http://localhost:3333/register";
	private static final String storeDataURL = "http://localhost:4444/register";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String storeData(User user){
		String status = restTemplate.postForObject(storeDataURL.toString(), user, String.class);
		return status;
	}
	
}
