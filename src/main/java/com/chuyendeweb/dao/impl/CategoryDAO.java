package com.chuyendeweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.chuyendeweb.dao.ICategoryDAO;
import com.chuyendeweb.entity.Category;


@Repository
public class CategoryDAO extends GeneraDAO<Category, Integer> implements ICategoryDAO {

}
