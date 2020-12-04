package com.ashsoft;

import java.io.File;

import com.ashsoft.binding.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception{
		
		Product product = new Product();
		product.setProductId(111);
		product.setProductName("Keyboard");
		product.setProductPrice(5000.0);
		
		ObjectMapper mapper =  new ObjectMapper();
		
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("product.json"), product);
		String jsonStr= mapper.writeValueAsString(product);
		System.out.println(jsonStr);

	}

}
