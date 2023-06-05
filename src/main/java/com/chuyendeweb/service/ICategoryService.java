package com.chuyendeweb.service;

import java.util.List;

import com.chuyendeweb.entity.Category;

public interface ICategoryService extends IGeneralService<Category, Integer> {
	List<Category> getRamDomByCategory();
}
