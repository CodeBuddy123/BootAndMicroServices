package com.ashsoft.binding;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
	
	
	@JsonProperty("pid") //changes the keyname in the JSON format
	private Integer productId;
	
	
	@JsonProperty("pname")
	private String productName;
	
	@JsonProperty("pprice")
	private Double productPrice;
	
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
}
