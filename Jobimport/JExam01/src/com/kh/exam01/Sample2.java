package com.kh.exam01;

public class Sample2 {

	public static void main(String[] args) {
		int x = 0;
		long y = 0;
		double z = 12.34;
		y = 12345678;
		x = (int)y;
		
		// System.out.print(x, "\n")  ����! print�� �ݵ�� �ϳ��� ���� ���
		System.out.print(x + "\n");
		System.out.print(y + "\n");
		
		System.out.printf("int �� : %d, long �� : %d\n", x, y);
		System.out.printf("�Ҽ��� 1�ڸ����� ��� : %.1f\n", z);
		System.out.printf("�Ҽ��� 1�ڸ����� ��� : %10.1f\n", z);
		System.out.printf("�Ҽ��� 1�ڸ����� ��� : %10.1f\n", 123.4);
	}

}
