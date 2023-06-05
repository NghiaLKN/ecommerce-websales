package com.chuyendeweb.service;

import java.util.List;

import com.chuyendeweb.entity.Customer;

public interface IAccountService extends IGeneralService<Customer, String> {
	boolean sendActivedUser(Customer user);
	void updateUser(Customer user);
	List<Customer> findByRoles(boolean admin);

}
