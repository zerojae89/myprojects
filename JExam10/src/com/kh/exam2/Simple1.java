package com.kh.exam2;

/*
 * 동물 슈퍼 클래스 생성
 * 
 * 개, 고양이, 호랑이, 소, 쥐,말 등등등 서브 클래스 생성
 * 
 * 멤버 필드 (private)
 *  나이, 신장, 몸무게
 *  
 *  멤머 메서드
 *  	달리기, 걷기, 울음소
 */

class Animal{
	private int age;
	private double tall;
	private double weight;
	
	public Animal(int age, double tall, double weight) {
		this.age  = age;
		this.tall = tall;
		this.weight = weight;
		
	}
}
	public void run() {
		System.out.println("동물이 달립니다.");
	}
	
	public void walk() {
		System.out.println("동물이 걷습니다.");
	}
	
	public void eat ()	{
		System.out.println("동물이 음식을 먹습니다.");
	}
	
	public void cry() {
		System.out.println("동물이 울음소리를 내고 있습니다.");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	}

class Dog extends Animal() {
	public Dog(int age, double tall, double weight) {
		super(age, tall, weight);
	}
}
	@override
	public void run() {
		System.out.println("개가신나게 달립니다.");
	}
class Cat extends Animal() {
	public Cat(int age, double tall, double weight) {
		super(age, tall, weight);
	}
}




public class Simple1 {

	public static void main(String[] args) {
		Dog dog = new Dog(1, 100.0, 2.5);
		Cat cat = new Cat(2, 65.5, 1.5);
		
		
	

	}

}
