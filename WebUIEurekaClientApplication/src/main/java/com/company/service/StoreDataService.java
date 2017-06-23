package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.company.user.User;

@Service
public class StoreDataService {

	@Autowired
	private EurekaClient eurekaClient;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	public String storeData(User user){
		RestTemplate restTemplate = new restTemplateBuilder.build();
		InstanceInfo instanceInfo = client.getNextServerFromEureka("backend", false);
		String url = instanceInfo.getHomePageUrl();
		String status = restTemplate.postForObject(url + "/register", user, String.class);
		return status;
	}
	
}
