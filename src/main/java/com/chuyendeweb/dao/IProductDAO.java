package com.chuyendeweb.dao;

import java.util.List;

import com.chuyendeweb.entity.Product;

public interface IProductDAO extends IGeneralDAO<Product, Integer> {

     	List<Product> findByKeywords(String keywords);
     	List<Product> findByCategoryId(Integer id);
     	List<Product> findItemByHot(String key);
     	List<Product> findByIdsInCookie(String id);
	

}
