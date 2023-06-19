package Entities;

public class Stock {
	
	private String productName;
	private int productType;
	private double productPrice;
	private int productQuantity;
	public int sales;
	
	public Stock(String name, int type, double price, int quantity, int sales) {
		this.productName = name;
		this.productType = type;
		this.productPrice = price;
		this.productQuantity = quantity;
		this.sales = sales;
	}
	
	public Stock() {
		
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double valueStock() {
		return productPrice * productQuantity;
	
}
	public double sales(int sales, int productQuantity, double productPrice) {
	    this.sales = sales;
	    setProductQuantity(getProductQuantity() - sales);
	    return sales * productPrice;
	}
}