package com.illusionwaregames.webapp.service;

import java.util.List;

import com.illusionwaregames.webapp.data.Product;

public interface ProductService {

	List<Product> getProductsByUserId(long userId);

}
