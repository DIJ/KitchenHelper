package com.illusionwaregames.webapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.illusionwaregames.webapp.data.Product;
import com.illusionwaregames.webapp.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> getProductsByUserId(long userId) {
		List<Product> inventoryOfProducts = new ArrayList<Product>();
		inventoryOfProducts
				.add(new Product().withName("ProductName").withQuantity(10)
						.withInsertionDate("10-12-2012")
						.withExpirationDate("10-12-2013")
						.withExpirationStatus("Fresh"));
		return inventoryOfProducts;
	}

}
