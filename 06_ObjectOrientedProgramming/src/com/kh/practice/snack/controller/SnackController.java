package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack s;
	
	
	public String saveDate(String kind, String name, String flavor, int numOf, int price) { 
			s = new Snack(kind, name, flavor, numOf, price);
	//		s.setKind(kind);		s.setName(name);
	//		s.setFlavor(flavor);	
	//		s.setNumOf(numOf);		s.setPrice(price);
			return "저장 완료되었습니다.";
		}
	
	
	public String confirmDate() {
		
		
		return s.information();
	}

}
