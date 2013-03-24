package com.illusionwaregames.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.illusionwaregames.webapp.service.ProductService;

@Controller
public class ProductStorageController {

	@Autowired
	private ProductService productService;
	
}
