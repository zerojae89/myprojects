package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public  void setprice(int price) {
		this.price = price;
	}
	
	public  void setbrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return this.pName;
	}
	
	public int getprice() {
		return this.price;
	}
	
	public String getbrand() {
		return this.brand;
	}
	
	public void information() {
		System.out.println("상품명 : " + getpName());
		System.out.println("가격 : " + getprice());
		System.out.println("브랜드 : " + getbrand());
	}

}
