package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.service.StoreDataService;
import com.company.user.User;

@RestController
public class WebUIController {

	@Autowired
	StoreDataService storeDataService;
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public String registerUser(@ModelAttribute("user") User user, Model model){
		String message = storeDataService.storeData(user);
		model.addAttribute("username",user.getUserName());
		return message;
	}
	
}
