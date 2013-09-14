package com.porul.inventory;

/**
* @author Rajkumar Vellore
* @since 14 Sep 2013
*
*/

public class Product {
	private String productId;
	private String productName;
	private String Maker;
	private double price;
	private float quantity;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getMaker() {
		return Maker;
	}
	public void setMaker(String maker) {
		Maker = maker;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

}
