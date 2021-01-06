package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1() {
		/*
		 *  �̿ϼ�!!
		 */
		int num;

		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		num = sc.nextInt();
		
		for(int i = 1;;) {
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				break;
			}
			
			System.out.print(i++ + " ");
			
			if(i >= num) {
				System.out.print(i);
				break;
			}
		}
		
//		if(num >= 1) {
//			for(int i = 1; i <= num; i++) {
//				System.out.print(i + " ");
//			}
//		} else {
//			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
//		}
		
	}
	
	public static void practice2() {
		/*
		 *  1�� ������ �����ϳ� 1 �̸��� ���ڰ� �Էµƴٸ�
		 *  "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڰ�
		 *  ���� �Է��� �� �ֵ��� �Ѵ�.
		 *  
		 *  1. ����� �Է� �޴´�.
		 *  2. �Է¹��� ���� ���� 1 �̻����� Ȯ��
		 *  	2-1. 1 �̻��� ������ �ݺ� ����!
		 *  	2-2. 1 �̻��� �ƴϸ� ��� �ݺ�
		 */
		int num = 0;
		for(;;) {
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			if(num >= 1) {
				for(int i = 1; i <= num; i++) {
					System.out.print(i + "  ");
				}
				break;
			}
			System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
		}
	}
	
	public static void practice3() {
		int num;
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ���. : ");
		num = sc.nextInt();
		
		for(; num > 0; num--) {
			System.out.print(num + " ");
		}
	}
	
	public static void practice4() {
		int num = 0;
		
		for(;num <= 0;) {
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ���. : ");
			num = sc.nextInt();
			
			if(num >= 1) {
				break;
			}
			
			System.out.print("�߸��� ���� �Է��Ͽ����ϴ�.");
		}
		
		for(; num > 0; num--) {
			System.out.print(num + " ");
		}
	}
	
	public static void practice5() {
		/*
		 *  1 ���� ����ڰ� �Է��� ���� �������� �������� ���ϰ� ���
		 *  ������ -> �ϳ��� ������ ����Ͽ� ���� ���� ���ο� ���� ��� ���ϰ�
		 *            �� ����� �ش� ������ �ٽ� ����.
		 */
		int x = 0;
		int num;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num - 1; i++) {
			System.out.print(i + " + ");
			x = x + i;
		}
		x = x + num;
		System.out.println(num + " = " + x);
	}
	
	public static void practice6() {
		/*
		 *  ����ڷ� ���� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ���
		 *  ����ڰ� ���� �Է��ϸ� ���� ���� ������ ū �� ������ ���.
		 *  ����� �Է��� 1 �̻��� ���ڸ� �Է��ϵ��� �Ѵ�.
		 */
		
		// ����� �Է� -> 2���� ����
		int n1, n2;
		System.out.print("ù ��° ���� : ");
		n1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		n2 = sc.nextInt();
		
		// 1 �̻��� ���� �Է� ���� ������ ����
		// 1 �̸��� ���� �Է��� ��� "1 �̻��� ���ڸ� �Է��ϼ���" ���
		if(n1 >= 1 && n2 >= 1) {
			// ���� ù��° ����� �Է��� ū ���� ��쿡 n2 ���� ���
			if(n1 <= n2) {
				// �Է¹��� �� �� ������ ���ڸ� ��� -> �ݺ���
				// ù��°(n1) : 4		�ι�°(n2) : 8
				for(int i = n1;i <= n2; i++) {
					System.out.print(i + "  ");
				}
			} else {
				// �Է¹��� �� �� ������ ���ڸ� ��� -> �ݺ���
				// ù��°(n1) : 8		�ι�°(n2) : 4
				for(int i = n2;i <= n1; i++) {
					System.out.print(i + "  ");
				}
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
		}
	}
	
	public static void practice7() {
		/*
		 *  ����ڷ� ���� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ���
		 *  ����ڰ� ���� �Է��ϸ� ���� ���� ������ ū �� ������ ���.
		 *  ����� �Է��� 1 �̻��� ���ڸ� �Է��ϵ��� �Ѵ�.
		 *  (����ڰ� ���� �߸� �Է��ϸ� �ùٸ� ���� �Է��� ������ ��ĵ ����)
		 */
		
		// ����� �Է� -> 2���� ����
		int n1, n2;
		
		for(;;) {
			System.out.print("ù ��° ���� : ");
			n1 = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			n2 = sc.nextInt();
			
			// 1 �̻��� ���� �Է� ���� ������ ����
			// 1 �̸��� ���� �Է��� ��� "1 �̻��� ���ڸ� �Է��ϼ���" ���
			if(n1 >= 1 && n2 >= 1) {
				// ���� ù��° ����� �Է��� ū ���� ��쿡 n2 ���� ���
				if(n1 <= n2) {
					// �Է¹��� �� �� ������ ���ڸ� ��� -> �ݺ���
					// ù��°(n1) : 4		�ι�°(n2) : 8
					for(int i = n1;i <= n2; i++) {
						System.out.print(i + "  ");
					}
				} else {
					// �Է¹��� �� �� ������ ���ڸ� ��� -> �ݺ���
					// ù��°(n1) : 8		�ι�°(n2) : 4
					for(int i = n2;i <= n1; i++) {
						System.out.print(i + "  ");
					}
				}
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
			}
		}
	}
	
	public static void practice8() {
		/*
		 *  ����ڷκ��� �Է� ���� ������ �������� ���.
		 */
		int n1;
		System.out.print("���� : ");
		n1 = sc.nextInt();
		
		System.out.printf("==== %d �� ====\n", n1);
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d �� %d = %d\n", n1, i, n1 * i);
		}
	}
	
	public static void practice9() {
		/*
		 *  ����ڷκ��� �Է� ���� ������ �������� ���.
		 */
		int n1;
		System.out.print("���� : ");
		n1 = sc.nextInt();
		
		if(n1 >= 1 && n1 <= 9) {
			for(int n = n1; n <= 9; n++) {
				System.out.printf("==== %d �� ====\n", n);
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d �� %d = %d\n", n, i, n * i);
				}
			}
		} else {
			System.out.println("1 ~ 9 ������ ���ڸ� �Է��ϼ���.");
		}
	}
	
	public static void practice10() {
		/*
		 *  ����ڷκ��� �Է� ���� ������ �������� ���.
		 *  (����� �Է��� �߸��� ��� ��� �Է¹��� �� �ֵ��� �Ѵ�.)
		 */
		int n1;
		
		for(;;) {
			System.out.print("���� : ");
			n1 = sc.nextInt();
			if(n1 >= 1 && n1 <= 9) {
				break;
			}
			System.out.println("1 ~ 9 ������ ���� �Է��ϼ���.");
		}
		
		for(int n = n1; n <= 9; n++) {
			System.out.printf("==== %d �� ====\n", n);
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d �� %d = %d\n", n, i, n * i);
			}
		}
	}
	
	public static void practice11() {
		/*
		 *  ����ڷκ��� ���� ���ڿ� ������ �Է¹޾� ����������
		 *  ���ڰ� Ŀ���ų� �۾����� ���α׷� ����
		 *  (��, ��µǴ� ���ڴ� 10��)
		 *  
		 *  ���� ���� : 4
		 *  ���� : 3
		 *  4  7  10  13  16  19  22  25  28  31
		 */
		int stNum, diffNum;
		
		System.out.print("���� ���� : ");
		stNum = sc.nextInt();
		
		System.out.print("���� : ");
		diffNum = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d  ", stNum);
			stNum = stNum + diffNum;
		}
	}
	
	public static void practice12() {
		/*
		 *  1. ���� �� ���� �����ڸ� �Է¹޴´�.
		 *  2. "exit" ��� ���ڿ��� �Էµ� �� ���� ���ѹݺ� �Ѵ�.
		 *     "exit" ��� ���ڿ��� �ԷµǸ� "���α׷��� �����մϴ�" ��� �� ����
		 *  3. �����ڰ� �������� �� �ι�° ������ 0 �̸�,
		 *     "0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���." ���
		 *  4. ���� ������ �Է� �� "���� �������Դϴ�. �ٽ� �Է��ϼ���." ���
		 *  5. 3�� 4���� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں���
		 *     �Է��ϵ��� �Ѵ�.
		 */
		int n1, n2, res;
		char op;	String input;
		for(;;) {
			System.out.print("������(+, -, *, /, %) : ");
			input = sc.next();
			
			if(input.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);		// �ݺ��� ���ᰡ �ƴ� ���α׷� ����� ���
			}
			op = input.charAt(0);	// exit �Է��� �ƴϸ� ù��° ���� op �� �Ҵ�
			System.out.print("���� 1 :");	n1 = sc.nextInt();
			System.out.print("���� 2 :");	n2 = sc.nextInt();
			
			// �������� ���� �����ڸ� �Է����� ���� ��� �ݺ� ����
			if(op == '+' || op == '-' || op == '*') {
				break;
			} else if(op == '/' || op == '%') {
				if(n2 != 0) {
					break;
				}
				System.out.println("0 ���� ������ �����ϴ�. �ٽ� �Է����ּ���.");
			} else {
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
		res = op == '+' ? n1 + n2 : op == '-' ? n1 - n2 : op == '/' ? n1 / n2 :
			op == '*' ? n1 * n2 : n1 % n2;
		System.out.printf("%d %c %d = %d", n1, op, n2, res);
	}
	
	public static void practice13() {
		/*
		 *  �� ��� 
		 *  *
		 *  **
		 *  ***
		 *  ****
		 */
		int cnt;
		System.out.print("���� �Է� : ");
		cnt = sc.nextInt();
		
		for(int i = 1; i <= cnt; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void practice14() {
		/*
		 *  �� ��� 
		 *  ****
		 *  ***
		 *  **
		 *  *
		 */
		int cnt;
		System.out.print("���� �Է� : ");
		cnt = sc.nextInt();
		
		for(int i = cnt; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		practice14();
		// practice13();
		// practice12();
		// practice11();
		// practice10();
		// practice9();
		// practice8();
		// practice7();
		// practice6();
		// practice5();
		// practice4();
		// practice3();
		// practice2();
		// practice1();
		sc.close();
	}

}
