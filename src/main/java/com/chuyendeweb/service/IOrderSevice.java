package com.chuyendeweb.service;

import java.util.List;
import java.util.Map;

import com.chuyendeweb.entity.Order;
import com.chuyendeweb.entity.Product;
import com.chuyendeweb.service.impl.CartService;

public interface IOrderSevice extends IGeneralService<Order, Integer> {
	Order createOrder();
	void addOrderAndOrderDetail(Order o, CartService cart); // thêm mới đơn hàng vào db
	List<Order> getAllOrderByUser();
	Order findById(Integer id);
	Map<Integer, Product> getPurchasedItems();

}
