package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {

	private Snack s = new Snack();

	public SnackController() {
	}

	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		// 데이터를 setter를 이용해 저장하고, 저장완료 되었다는 문구를 반환!
		s.setkind(kind);
		s.setname(name);
		s.setflavor(flavor);
		s.setnumOf(numOf);
		s.setprice(price);
		return "저장 완료되었습니다.";
	}

	public String confirmData() {
		// 저장 완료된 데이터를 반환!
		return s.information();
	}
}
