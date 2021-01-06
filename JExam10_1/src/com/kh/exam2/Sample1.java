package com.kh.exam2;

public class Sample1 {

	class Animal{
		private int age;
		private double tall;
		private double weight;
		
		public Animal(int age, double tall, double weight) {
			this.age  = age;
			this.tall = tall;
			this.weight = weight;
			
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