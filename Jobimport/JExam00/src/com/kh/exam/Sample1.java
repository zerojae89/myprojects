package com.kh.exam;

public class Sample1 {

	public static void func1() {
		// ������ ���� ���
		System.out.print("���ڿ� ���" + 1);
		System.out.print("���ڿ� ���" + 2);
		System.out.print("���ڿ� ���" + 3);
	}
	
	public static void func2() {
		// ������ �ִ� ���
		System.out.println("���ڿ� ���" + 1);
		System.out.println("���ڿ� ���" + 2);
		System.out.println("���ڿ� ���" + 3);
	}
	
	public static void func3() {
		// ����, ���ڿ� ����
		// ���ڴ� ��������ǥ(Ȭ����ǥ)�� ����Ѵ�. -> '
		// ���ڿ��� ū����ǥ(�ֵ���ǥ)�� ����Ѵ�. -> "
		char c1 = 'c'; 		// �߸��� ��� -> char c2 = "c";
		String s1 = "c";	// �߸��� ��� -> String s2 = 'c';
	}
	
	public static void func4() {
		// ����, ���ڿ� ��
		// �⺻������ �񱳿����� ������ �ڷ����� ���� �ùٸ��� �񱳸� �Ѵ�.
		// ���� == ���ڿ� �񱳸� ����� �������� ���Ѵ�.
		// �ùٸ� �� -> ���� == ����				�� ��ü�� ����
		// �ùٸ� �� -> ���ڿ�.equals("���ڿ�");	������ ����
		char c1 = 'c';			char c2 = 'c';
		String s1 = "s";		String s2 = "s";
		System.out.println(c1 == c2);
		System.out.println(s1.equals(s2));
		
	}
	
	public static void func5() {
		int num = 13;
		
		if(num % 2 == 0) {
			System.out.println(num + "�� ¦�� �Դϴ�.");
		} else {
			System.out.println(num + "�� Ȧ�� �Դϴ�.");
		}
	}
	
	public static void func6() {
		int num = 21;
		
		if(num % 7 == 0) {
			System.out.println(num + "�� 7�� ��� �Դϴ�.");
		} else {
			System.out.println(num + "�� 7�� ����� �ƴմϴ�.");
		}
	}
	
	public static void func7() {
		/*
		 *  ���� ������ ���� ����
		 *  90 �� �̻� ~ 100 �� ����		A ���
		 *  80 �� �̻� ~ 90 �� �̸�			B ���
		 *  70 �� �̻� ~ 80 �� �̸�			C ���
		 *  60 �� �̻� ~ 70 �� �̸�			D ���
		 *  50 �� �̻� ~ 60 �� �̸�			E ���
		 *  0 �� �̻� ~ 50 �� �̸�			F ���
		 */
		int jumsu = 94;
		
		switch(jumsu / 10) {
			case 10:	case 9:
				System.out.println("A ����Դϴ�.");	break;
			case 8:
				System.out.println("B ����Դϴ�.");	break;
			case 7:
				System.out.println("C ����Դϴ�.");	break;
			case 6:
				System.out.println("D ����Դϴ�.");	break;
			case 5:
				System.out.println("E ����Դϴ�.");	break;
			case 4:		case 3:		case 2:		case 1:		case 0:
				System.out.println("F ����Դϴ�.");	break;
		}
	}
	
	public static void func8() {
		int num = 5;
		char op = '.';	// �ʱ�ȭ�� ���� ���� ��� ������ �ٿ��� ���� �߻�
		// if ���� else ������ �����Ǿ� �ֱ� ������ op�� �ʱ�ȭ ���� ����
		// �� �ֱ� ������ ����.
		
		if(num == 1) {
			op = '+';
		} else if(num == 2) {
			op = '-';
		} else if(num == 3) {
			op = '*';
		} else if(num == 4) {
			op = '/';
		}
		
		System.out.println(num + " " + op + " " + num);
	}
	
	public static void func9() {
		int num = 4;
		
		switch(num) {
			case 1:
				System.out.println("case 1 ���");
				break;
			case 2:
				System.out.println("case 2 ���");
				break;
			case 3:
				System.out.println("case 3 ���");
				break;
			default:
				System.out.println("default ���");
		}
	}
	
	public static void func10() {
		int num = 0;
		while(true) {
			System.out.println(num);
			
			if(num % 3 == 0) {
				num = num + 2;
				continue;
			}
			num = num + 1;
			if(num >= 100) {
				break;
			}
		}
	}
	
	public static void func11() {
		// 10�� �ݺ�
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "��");
		}
		
		// 10�� �ݺ�(�迭 �ε���)
		for(int i = 0; i <= 10 - 1; i++) {
			System.out.println(i + "��");
		}
		
		// 10�� �ݺ�(�迭 �ε���)
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "��");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func11();
		// func10();
		// func9();
		// func8();
		// func7();
		// func6();
		// func5();
		// func4();
		// func3();
		// func2();
		// func1();
	}

}
