package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		int age = 0;
		double tall = 0.0;
		String name, gender;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		gender = sc.next();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		tall = sc.nextDouble();
		
		System.out.println("Ű " + tall + "cm�� " + age + "��"
				+ gender + "�� " + name + "�� �ݰ����ϴ�.^^");
		
		sc.close();
	}

}
