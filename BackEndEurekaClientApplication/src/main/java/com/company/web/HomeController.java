package com.company.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.User;
import com.company.service.StoreService;

@RestController
public class HomeController {

	@Autowired
	private StoreService storeService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestBody User user){
		String message = storeService.storeUser(user);
		return message;
	}
}
