package com.hw3.model.vo;

public class Product {
	
	private String brand;
	private String name;
	private String color;
	private int price;
	
	public Product() {}
	
	public Product(String brand, String name, String color, int price) {
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public String toString() {
		String str = "brand=" + brand + ", " + "name=" + name + ", " + "color=" + color + ", " + "price=" + price;
		return str;
	}
	
	public boolean equals(Product obj) {
		if(getBrand() == obj.getBrand() && getName() == obj.getName() && getColor() == obj.getColor() && getPrice() == obj.getPrice()) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		int sum = 0;
		
		sum += brand.hashCode() + name.hashCode() + color.hashCode() + String.valueOf(price).hashCode();
		
		return sum;
	}
	
	public Product clone(Product product1) {
		Product copy = product1;
		return copy;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

}
