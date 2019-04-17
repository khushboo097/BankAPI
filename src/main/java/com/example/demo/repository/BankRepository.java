package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.AccountHolder;

@Repository
public interface BankRepository extends MongoRepository<AccountHolder,String> {
	
	public AccountHolder findByFirstName(String firstName);
	public List<AccountHolder> findByAge(int age);
	
}
