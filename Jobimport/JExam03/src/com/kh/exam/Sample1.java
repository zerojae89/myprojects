package com.kh.exam;

import java.util.Scanner;

public class Sample1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void func1() {
		/*
		 *  ����� �Է����� ���� ���� �Է� ���� �� ���/���� �����Ͽ� ���
		 */
		int num;
		String res = "����� �ƴϴ�.";
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		if(num > 0) {
			res = "�����";
		}

		System.out.println(res);
	}
	
	public static void func2() {
		int num;
		String res;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
//		if(num > 0) {
//			res = "�����";
//		} else if (num == 0) {
//			res = "0 �̴�";
//		} else {
//			res = "������";
//		}
		
		if(num > 0) {
			res = "�����";
		} else {
			// 0 �� ������ ������
			if(num == 0) {
				res = "0 �̴�";
			} else {
				res = "������";
			}
		}

		System.out.println(res);
	}
	
	public static void func3() {
		String name, gender_name;
		int lvl, cls, num;
		char gender;
		double grade;
		
		System.out.print("�̸� : ");
		name = sc.next();
		
		System.out.print("�г� : ");
		lvl = sc.nextInt();
		
		System.out.print("�� : ");
		cls = sc.nextInt();
		
		System.out.print("��ȣ : ");
		num = sc.nextInt();
		
		System.out.print("����(M/F) : ");
		gender = sc.next().charAt(0);
		
		System.out.print("����(�Ҽ��� �ι�° �ڸ�) : ");
		grade = sc.nextDouble();
		
//		if(gender == 'M') {
//			gender_name = "���л�";
//		} else if(gender == 'F') {
//			gender_name = "���л�";
//		} else {
//			gender_name = "�߸��� ���� �ڵ�";
//		}
		
		switch(gender) {
			case 'M':
				gender_name = "���л�";	break;
			case 'F':
				gender_name = "���л�";	break;
			default:
				gender_name = "�߸��� ���� �ڵ�";
		}
		
		System.out.printf("%d�г� %d�� %d�� %s %s ������ %.2f �̴�.\n",
				lvl, cls, num, name, gender_name, grade);
	}
	
	public static void func4() {
		int age;
		String res;
		
		System.out.print("���� �Է�(1 ~ 120) : ");
		age = sc.nextInt();
		
		if(age > 0 && age <= 120) {
			if(age <= 13) {
				res = "���";
			} else if(age > 13 && age <= 19) {
				res = "û�ҳ�";
			} else {
				res = "����";
			}
		} else {
			res = "1 ~ 120 ������ ���� �Է��ϼ���.";
		}
		
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func1();
	}

}
