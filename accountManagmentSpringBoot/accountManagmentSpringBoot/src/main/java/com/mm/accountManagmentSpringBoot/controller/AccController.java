package com.mm.accountManagmentSpringBoot.controller;

import java.util.Collection;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mm.accountManagmentSpringBoot.model.Account;
import com.mm.accountManagmentSpringBoot.repository.AccountRepo;

@RestController
@RequestMapping("/")
public class AccController {
	
	@Autowired
	private AccountRepo accountRepo;
	
	@RequestMapping(value = "account", method = RequestMethod.GET)
	public Collection <Account> list() {
		return (Collection<Account>) accountRepo.findAll();
	}
	
	@RequestMapping(value = "account", method = RequestMethod.POST)
	public Account create(@RequestBody Account account) {
		return accountRepo.saveAndFlush(account);
	}
	
	@RequestMapping(value = "account/{id}", method = RequestMethod.GET)
	public Account get(@PathVariable Long id) {
		return accountRepo.findOne(id);
	}
	
	@RequestMapping(value = "account/{id}", method = RequestMethod.PUT)
	public Account update(@PathVariable Long id, @RequestBody Account account) {
		Account existingAccount = accountRepo.findOne(id);
		BeanUtils.copyProperties(account, existingAccount);
		return accountRepo.saveAndFlush(existingAccount); 
	}
	
	@RequestMapping(value = "account/{id}", method = RequestMethod.DELETE)
	public Account delete(@PathVariable Long id) {
		Account existingAccount = accountRepo.findOne(id);
		accountRepo.delete(existingAccount);
		return existingAccount;
	}
	
}
