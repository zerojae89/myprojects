package com.kh.exam01;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		int age = 0;
		double weight = 0.0;
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		
		System.out.print("ü���� �Է��ϼ���(Kg) : ");
		weight = sc.nextDouble();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("����� ü���� " + weight + "Kg �Դϴ�.");
		System.out.println("����� �̸��� " + name + " �Դϴ�.");
		
		sc.close();
	}

}
