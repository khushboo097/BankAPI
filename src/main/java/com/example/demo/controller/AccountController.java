package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AccountHolder;
import com.example.demo.service.BankService;

@RestController
public class AccountController {

	@Autowired
	private BankService bankService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String firstName,@RequestParam String lastName,@RequestParam int age,@RequestParam int balance) {
		AccountHolder p = bankService.create(firstName, lastName, age,balance);
		return p.toString();
	}
	@RequestMapping("/get")
	public AccountHolder getAccountHolder(@RequestParam String firstName) {
		return bankService.getByFirstName(firstName);
	}
	@RequestMapping("/getAll")
	public List<AccountHolder> getAll() {
		return bankService.getAll();
	}
	@RequestMapping("/update")
	public String update(@RequestParam String firstName,@RequestParam String lastName,@RequestParam int age,@RequestParam int balance) {
		AccountHolder p = bankService.update(firstName, lastName, age, balance);
		return p.toString();
	}
	
	@RequestMapping("/delete")
		public String delete(@RequestParam String firstName) {
		bankService.delete(firstName);
		return "Deleted "+ firstName;
	}
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		bankService.deleteAll();
		return "Deleted all records";
		
	}
}
