package Entities;

public class Product {

	public int price;
	public int quantity;
	public  String nameProduct;
	public int totalValue;
	
	public Product(int price, int quantity, String name, int totalValue) {
		this.price = price;
		this.quantity = quantity;
		this.nameProduct = name;
		this.totalValue = totalValue;
		
	}
	
	public String getName() {
		return nameProduct;
	}

	public void setName(String nameProduct) {
		this.nameProduct = nameProduct;
		
   }	
	
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
		
   }	
	
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		
   }
	
	public int getTotalValue() {
		return this.price * this.quantity;
	}
	
	public void setTotalValue(int price, int quantity) {
		this.totalValue = this.price * this.price;
		
	}
		
   }


