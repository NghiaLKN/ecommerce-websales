package com.chuyendeweb.dao;

import java.util.List;

import com.chuyendeweb.entity.Customer;

public interface ICustomerDAO extends IGeneralDAO<Customer, String> {
	List<Customer> findByRoles(boolean roles);

}
