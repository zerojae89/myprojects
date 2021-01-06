package com.kh.example.practice2.model.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	
	public static void main(String[] args) {
		Product p = new Product();
		
		p.setpName("키보드");
		p.setprice(30000);
		p.setbrand("Apple");
		
		p.information();
	}

}
