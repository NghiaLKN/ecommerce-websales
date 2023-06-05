package com.chuyendeweb.dao;

import java.util.List;

import com.chuyendeweb.entity.Customer;
import com.chuyendeweb.entity.Order;
import com.chuyendeweb.service.impl.CartService;

public interface IOrderDAO extends IGeneralDAO<Order, Integer> {

	void create(Order o, CartService cart);
	List<Order> findByUser(Customer user);

}
