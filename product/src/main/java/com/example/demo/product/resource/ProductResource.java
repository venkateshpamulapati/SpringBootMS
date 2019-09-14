package com.example.demo.product.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.product.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductResource {

	@Autowired
	ProductService productService;

	@GetMapping(path = "")
	public List<String> findAllProducts() {
		return productService.findAllProducts();
	}

}
