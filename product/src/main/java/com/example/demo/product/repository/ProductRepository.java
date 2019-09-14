package com.example.demo.product.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

	public List<String> findAllProducts() {
		List<String> productList = new ArrayList<String>();
		productList.add("Mobile");
		productList.add("Laptop");
		productList.add("others");
		return productList;
	}

}
