package com.illusionwaregames.webapp.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.illusionwaregames.webapp.data.Product;
import com.illusionwaregames.webapp.service.ProductService;

@Controller
public class ProductListController {

	@Autowired
	private ProductService productService; 
	
	private List<Product> inventoryOfProducts;
	
	private long userId = 10;
	
	@PostConstruct
	public void init() {
		inventoryOfProducts = productService.getProductsByUserId(userId);
	}
	
	@ModelAttribute("listOfProducts")
	public List<Product> productsOfInventory() {
		return inventoryOfProducts;
	}
}
