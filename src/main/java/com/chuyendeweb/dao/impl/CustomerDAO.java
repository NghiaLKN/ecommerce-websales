package com.chuyendeweb.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chuyendeweb.dao.ICustomerDAO;
import com.chuyendeweb.entity.Customer;

@Repository
public class CustomerDAO extends GeneraDAO<Customer, String> implements ICustomerDAO {

	@Override
	public List<Customer> findByRoles(boolean roles) {
		String sql = "From Customer c WHERE c.admin =?0";
		return this.getResultList(sql, roles);
	}

}
