package com.kh.practice.func;

import java.util.Scanner;

public class UserTest {

	public static Scanner sc = new Scanner(System.in);	//���� ������ ��ü ���.
	public static void practice1() {
		int a ;
		
		System.out.println("1�� �ǽ�����");
		System.out.println("���� : ");
		a = sc.nextInt();
		System.out.println(a > 0 ? "�����." : "����� �ƴϴ�.");
		
	}
	
	public static void practice2() {
		int b ;
		
		System.out.println("2�� �ǽ�����");
		System.out.println("���� : ");
		b = sc.nextInt();
		System.out.println(b >= 0 ? b == 0 ? "0�̴�." : "�����." : "������.");
		
	}
	
	public static void practice3() {
		int c ;
		
		System.out.println("3�� �ǽ�����");
		System.out.println("���� : ");
		c = sc.nextInt();
		System.out.println(c % 2 == 0 ? "¦����." : "Ȧ����.");
		
	}
	
	public static void practice4() {
		int d, e, f, g;
		
		System.out.println("4�� �ǽ�����");
		System.out.println("�ο��� : ");
		d = sc.nextInt();
		System.out.println("���� ���� : ");
		e = sc.nextInt();
		
		f = e / d;
		g = e % d; 
		
		
		System.out.printf("1�δ� ���� ���� : %d\n���� ���� ���� : %d", f, g);
		
	}
	
	public static void practice5() {
		String name, gen;
		int grd ,cls, num;
		double scr;
		
		System.out.println("5�� �ǽ�����");
		System.out.println("�̸� : ");
		name = sc.next();
		System.out.println("�г�(���ڸ�) : ");
		grd = sc.nextInt();
		System.out.println("��(���ڸ�) : ");
		cls = sc.nextInt();
		System.out.println("��ȣ(���ڸ�) : ");
		num = sc.nextInt();
		System.out.println("����(M/F) : ");
		gen = sc.next();
		System.out.println("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		scr = sc.nextDouble();
		System.out.printf("%d�г� %d�� %d�� %s %s�л��� ������ %.2f�̴�.", grd, cls, num, name, gen, scr);
		
	}
	
	public static void practice6() {
		int age ;
		
		System.out.println("6�� �ǽ�����");
		System.out.println("���� : ");
		age = sc.nextInt();
		System.out.println(age <= 13 ? "�" : age <= 19 ? "û�ҳ�" : "����");
		
	}
	
	public static void practice7() {
		int k, e, m, sum ;
		double avg;
		
		System.out.println("7�� �ǽ�����");
		System.out.println("���� : ");
		k = sc.nextInt();
		System.out.println("���� : ");
		e = sc.nextInt();
		System.out.println("���� : ");
		m = sc.nextInt();
		
		sum = k + e + m;
		avg = sum / 3;
		System.out.println("�հ� : " + sum);
		System.out.printf("��� : %.1f", avg);
		
		System.out.println(k >= 40 && e >= 40 && m >= 40 && avg >= 60 ? "�հ�" : "���հ�");
		
	}
	
	public static void practice8() {
		String id ;
		
		System.out.println("8�� �ǽ�����");
		System.out.println("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		id = String.valueOf(sc.next().charAt(7));    // ���� -> ���ڿ� ��ȯ ����.
		
		// ���ڿ��� �⺻ �񱳿����ڷ� ���ϸ� �ȵ�.
		System.out.println(id.equals("2") ? "����" : "����");
	}
	
	public static void practice9() {
		int num1, num2, a ;
	
		System.out.println("9�� �ǽ�����");
		System.out.println("����1 : ");
		num1 = sc.nextInt();
		System.out.println("����2 : ");
		num2 = sc.nextInt();
		System.out.println("�Է� : ");
		a = sc.nextInt();
		System.out.println(a >= num2 || a < num1 ? "true" : "false");
		
	}
	
	public static void practice10() {
		int num1, num2, num3 ;
		
		
		System.out.println("�Է�1 : ");
		num1 = sc.nextInt();
		System.out.println("�Է�2 : ");
		num2 = sc.nextInt();
		System.out.println("�Է�3 : ");
		num3 = sc.nextInt();
		System.out.println(num1 == num2 && num2 == num3 ? "true" : "false");
		
	}
	
	public static void main(String[] args) {
//		practice1(); 		//method call
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice7();
//		practice8();
//		practice9();
		practice10();
		
		sc.close();
	}

}
