package com.porul.inventory;

/**
 * @author Rajkumar Vellore
 * @since 14-Sep-2013
 *
 */



import java.util.HashMap;

public class Inventory {

	public Product _p;
	public HashMap<String, Product> inventory = new HashMap<String, Product>();;

	public Inventory() {
		
		_p = new Product();
		_p.setProductId("0770813000046");
		_p.setProductName("Home-Made Blackberry Fruit Spread");
		_p.setMaker("Huber");
		_p.setPrice(80.00);
		_p.setQuantity(23);
		inventory.put(_p.getProductId(), _p);

		_p = new Product();
		_p.setProductId("0609268308011");
		_p.setProductName("Steam Iron");
		_p.setMaker("Durabrand");
		_p.setPrice(85.00);
		_p.setQuantity(34);
		inventory.put(_p.getProductId(), _p);

		_p = new Product();
		_p.setProductId("0041554523911");
		_p.setProductName("Lash Styler");
		_p.setMaker("Maybelline");
		_p.setPrice(30.55);
		_p.setQuantity(52);
		inventory.put(_p.getProductId(), _p);

		_p = new Product();
		_p.setProductId("0856790002072");
		_p.setProductName("Whitening Enzyme Mask");
		_p.setMaker("Bello");
		_p.setPrice(10.00);
		_p.setQuantity(2);
		inventory.put(_p.getProductId(), _p);

		_p = new Product();
		_p.setProductId("0024314500438");
		_p.setProductName("Irish Soda Bread");
		_p.setMaker("Edner");
		_p.setPrice(12.00);
		_p.setQuantity(130);
		inventory.put(_p.getProductId(), _p);

		_p = new Product();
		_p.setProductId("5027141539621");
		_p.setProductName("L6 Orange Mobile Phone");
		_p.setMaker("Motorola");
		_p.setPrice(220.00);
		_p.setQuantity(56);
		inventory.put(_p.getProductId(), _p);

		_p = new Product();
		_p.setProductId("0045416013886");
		_p.setProductName("Greeting Card");
		_p.setMaker("Gibson");
		_p.setPrice(8.00);
		_p.setQuantity(29);
		inventory.put(_p.getProductId(), _p);

		_p = new Product();
		_p.setProductId("0059600070173");
		_p.setProductName("Fruitopia");
		_p.setMaker("The Coca-Cola Company");
		_p.setPrice(2.00);
		_p.setQuantity(3000);
		inventory.put(_p.getProductId(), _p);

		_p = new Product();
		_p.setProductId("0039073198871");
		_p.setProductName("Classic Maple Ham");
		_p.setMaker("Kretsch");
		_p.setPrice(16.00);
		_p.setQuantity(34);
		inventory.put(_p.getProductId(), _p);

		_p = new Product();
		_p.setProductId("0011110355430");
		_p.setProductName("Epsom salt");
		_p.setMaker("Kroger");
		_p.setPrice(2.99);
		_p.setQuantity(77);
		inventory.put(_p.getProductId(), _p);

		_p = new Product();
		_p.setProductId("0026616605453");
		_p.setProductName("Cordless Phone Battery Backup");
		_p.setMaker("SW Bell");
		_p.setPrice(34.32);
		_p.setQuantity(45);
		inventory.put(_p.getProductId(), _p);

	}

	public HashMap<String, Product> getInventory() {
		return inventory;
	}

	public void setInventory(HashMap<String, Product> inventory) {
		this.inventory = inventory;
	}

	
	
}
