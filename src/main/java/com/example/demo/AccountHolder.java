package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AccountHolder {

	@Id
	String id;
	String firstName;
	String lastName;
	int age;
	int balance;

	public AccountHolder(String firstName,String lastName,int age,int balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.balance=balance;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String toString() {
		return "First Name: " + firstName+ "\nLast Name: "+lastName+"\nAge: "+age+"\nAccount Balance: "+balance;
		
	}

}
