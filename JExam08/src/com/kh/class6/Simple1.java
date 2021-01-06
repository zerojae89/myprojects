package com.kh.class6;

class sample {
	public String name;
	public int age;
	public char gender;
	
	public sample() {}
	public sample(String name) {
		this.name = name;
	}
	public sample(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public sample(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	
	
}
	
	public void printInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("성별 : " + this.gender);
	}

}
public class Simple1 {

	public static void main(String[] args) {
		sample s1 = new sample();
		sample s2 = new sample("홍길동");
		sample s3 = new sample("홍길동",30);
		sample s4 = new sample("홍길동",30,'남');
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		s4.printInfo();
		
	

	}

}

