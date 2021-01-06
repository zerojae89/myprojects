package com.kh.practice.snack.model.vo;

public class Snack {

	private String kind; // 종류
	private String name; // 이름
	private String flavor; // 맛
	private int numOf; // 개수
	private int price; // 가격

	public Snack() {
	}

	public Snack(String kind, String name, String flavor, int numOf, int price) {
	}

	public void setkind(String kind) {
		this.kind = kind;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setflavor(String flavor) {
		this.flavor = flavor;
	}

	public void setnumOf(int numOf) {
		this.numOf = numOf;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public String getkind() {
		return this.kind;
	}

	public String getname() {
		return this.name;
	}

	public String getflavor() {
		return this.flavor;
	}

	public int getnumOf() {
		return this.numOf;
	}

	public int getprice() {
		return this.price;
	}

	public String information() {
		return getkind() + "(" + getname() + " - " + getflavor() + ") " + getnumOf() + "개 " + getprice() + "원";
	}
}
