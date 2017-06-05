package com.company.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.model.User;

@Repository
@Transactional
public interface StoreRepository extends JpaRepository<User, Long>{

}
