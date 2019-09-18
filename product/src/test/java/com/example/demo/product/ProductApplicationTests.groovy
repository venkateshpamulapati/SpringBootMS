package com.example.demo.product;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

import org.springframework.http.MediaType;

import com.example.demo.product.base.TransactionalWebIntegrationTest;
import com.example.demo.product.base.WebAppIntegrationBaseSpecification;

import groovy.json.JsonSlurper

@TransactionalWebIntegrationTest
public class ProductApplicationTests extends WebAppIntegrationBaseSpecification{
	def'get products'(){
		given:'we have list of products available in db'
		when:'User want to display the available products'
		def getProductDeatils = this.mockMvc.perform(get("/api/product")
				.contentType(MediaType.APPLICATION_JSON))

		then:'show the products'
		def getJson = new JsonSlurper().parseText(getProductDeatils.andReturn().response.contentAsString)
		getProductDeatils.andExpect(status().is(200))
	}
}
