package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.model.User;
import com.company.repository.StoreRepository;

@Service
public class StoreService implements IStoreService{

	@Autowired
	private StoreRepository storeRepository;
	
	@Override
	public String storeUser(User user) {
		// TODO Auto-generated method stub
		storeRepository.save(user);
		return "Data saved to database.";
	}

	
}
