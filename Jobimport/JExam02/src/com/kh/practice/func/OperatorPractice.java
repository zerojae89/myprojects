package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	// Scanner�� close �� �� System.in �� close�� �Ǿ� �ݺ� ����� �ȵǴ� ������ ����
	// ���� ������ ��ü ���.
	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1() {
		/*
		 *  Ű����� �Է� ���� ������ ����� "�����"�� ��� �ƴϸ� "����� �ƴϴ�"�� ���
		 *  1. ����� �Է� �ޱ�
		 *  2. �Է� ���� ���� ���� ������� ��
		 *     A. ����� "����� ���"
		 *     B. ����� �ƴϸ� "����� �ƴϴ�" ���
		 */
		int num;
		String res;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		res = num < 0 ? "����� �ƴϴ�." : "�����.";
		
		System.out.println(res);
		
	}
	
	public static void practice2() {
		/*
		 *  Ű����� �Է� ���� ������ ����� "�����"�� ��� �ƴϸ� "����� �ƴϴ�"�� ���
		 *  ���� ���� 0�� ��� "0 �̴�"�� ���
		 *  1. ����� �Է� �ޱ�
		 *  2. �Է� ���� ���� ���� ������� ��
		 *     A. ����� "����� ���"
		 *     B. ����� �ƴϸ� "����� �ƴϴ�" ���
		 *     C. 0 �̸� "0 �̴�" ���
		 */
		int num;
		String res;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		res = num < 0 ? "����� �ƴϴ�." : num == 0 ? "0 �̴�." : "�����.";
		
		System.out.println(res);
	}
	
	public static void practice3() {
		int num;
		String res;
		
		System.out.print("���� : ");
		num = sc.nextInt();
		
		res = num % 2 == 0 ? "¦�� �Դϴ�." : "Ȧ�� �Դϴ�.";
		System.out.println(res);
	}
	
	public static void practice4() {
		int x, y;
		
		System.out.print("�ο� �� : ");
		x = sc.nextInt();
		
		System.out.print("���� �� : ");
		y = sc.nextInt();
		
		System.out.println("1�δ� ���� �� : " + y / x);
		System.out.println("���� ���� �� : " + y % x);
	}
	
	public static void practice5() {
		String name;
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
		
		System.out.print("���� : ");
		grade = sc.nextDouble();
		
		System.out.printf("%d �г� %d �� %d �� %s %s�� ������ %.2f�̴�.", lvl, cls, num,
				name, gender == 'M' ? "���л�" : "���л�", grade);
	}
	
	public static void practice6() {
		int age;
		String s;
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		s = age <= 13 ? "���" : age > 13 && age <= 19 ? "û�ҳ�" : "����";
		System.out.println(s);
	}
	
	public static void practice7() {
		int x, y, z, tot;
		double avg;
		String s;
		
		System.out.print("���� : ");
		x = sc.nextInt();
		
		System.out.print("���� : ");
		y = sc.nextInt();
		
		System.out.print("���� : ");
		z = sc.nextInt();
		
		tot = x + y + z;
		avg = tot / 3.0;
		
		System.out.println("�հ� : " + tot);
		System.out.printf("��� : %.1f\n", avg);
		
		s = x >= 40 && y >= 40 && z >= 40 && avg >= 60 ? "�հ�" : "���հ�";
		
		System.out.println(s);
	}
	
	public static void practice8() {
		String s;
		
		System.out.print("�ֹι�ȣ �Է�(- ���� �Է�) : ");
		s = sc.next().charAt(7) == '1' ? "����" : "����";
		System.out.println(s);
	}
	
	public static void practice9() {
		int num1, num2, x;
		boolean b;
		
		System.out.print("���� 1 : ");
		num1 = sc.nextInt();
		
		System.out.print("���� 2 : ");
		num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		x = sc.nextInt();
		
		b = x <= num1 || x > num2 ? true : false;
		
		System.out.println(b);
		
	}
	
	public static void practice10() {
		int num1, num2, num3;
		boolean b;
		
		System.out.print("���� 1 : ");
		num1 = sc.nextInt();
		
		System.out.print("���� 2 : ");
		num2 = sc.nextInt();
		
		System.out.print("���� 3 : ");
		num3 = sc.nextInt();
		
		b = num1 == num2 && num2 == num3;
		
		System.out.println(b);
	}

	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice5();
		// practice6();
		// practice7();
		// practice8();
		// practice9();
		// practice10();
		sc.close();
	}

}
