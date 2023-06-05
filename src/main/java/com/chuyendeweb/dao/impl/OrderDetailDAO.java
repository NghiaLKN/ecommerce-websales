package com.chuyendeweb.dao.impl;

import org.springframework.stereotype.Service;

import com.chuyendeweb.dao.IOrderDetailDAO;
import com.chuyendeweb.entity.OrderDetail;
@Service
public class OrderDetailDAO extends GeneraDAO<OrderDetail, Integer> implements IOrderDetailDAO{

}
