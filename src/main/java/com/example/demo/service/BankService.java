package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AccountHolder;
import com.example.demo.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankRepository bankRepository;
	//create
	public AccountHolder create(String firstName,String lastName,int age,int balance)
	{
		return bankRepository.save(new AccountHolder(firstName,lastName,age,balance));
	}
	//retrieve
	public List<AccountHolder> getAll(){
		return  bankRepository.findAll();
	}
	public AccountHolder getByFirstName(String firstName) {
		return bankRepository.findByFirstName(firstName);
	}
	
	//update
	public AccountHolder update(String firstName,String lastName,int age,int balance) {
		AccountHolder p = bankRepository.findByFirstName(firstName);
		p.setLastName(lastName);
		p.setAge(age);
		p.setBalance(balance);
		return bankRepository.save(p);
	}
	//delete
	public void deleteAll() {
		bankRepository.deleteAll();
	}
	
	public void delete(String firstName) {
		AccountHolder p = bankRepository.findByFirstName(firstName);
		bankRepository.delete(p);
	}
}
