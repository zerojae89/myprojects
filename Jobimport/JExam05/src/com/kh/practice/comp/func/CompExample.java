package com.kh.practice.comp.func;

import java.util.Scanner;
import java.util.Random;

public class CompExample {

	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1() {
		/*
		 *  �������� �Է¹޾� '��' �� '��' �� ������ ���
		 *  ��, ����� �Է��� �ƴϸ� "����� �ƴմϴ�." ���
		 */
		
		int n;
		char c1 = '��', c2 = '��';
		String crap = "�ڼ�";
		
		System.out.print("���� : ");
		n = sc.nextInt();
		
		if(n > 0) {
			// �ܼ� ������ ���� ���
			for(int i = 1; i <= n;) {
				System.out.print(c1);
				i++;
				if(i > n) {
					break;
				}
				System.out.print(c2);
				i++;
			}
			System.out.print("\n");
			
			// ¦Ȧ�� �����Ͽ� ���ڿ��� ���� ���
			for(int i = 0; i < n; i++) {
				System.out.print(crap.charAt(i % 2));
			}
			
			System.out.print("\n");
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}
	
	public static void practice2() {
		/*
		 *  �������� �Է¹޾� '��' �� '��' �� ������ ���
		 *  ��, ����� �Է��� �ƴϸ� "����� �ƴմϴ�." ��� �� ��� �Է¹ޱ�
		 */
		int n;
		String crap = "�ڼ�";
		
		while(true) {
			System.out.print("���� : ");
			n = sc.nextInt();
			if(n > 0) {
				break;
			}
			System.out.println("����� �ƴմϴ�.");
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(crap.charAt(i % 2));
		}
		System.out.print("\n");
	}
	
	public static void practice3() {
		/*
		 *  ����ڷκ��� ���ڿ��� ���ڸ� �Է� �ް� ���ڿ��� ���ڰ�
		 *  �� �� �ִ��� ���
		 *  ���ڿ� : banana
		 *  ���� : a
		 */
		String word;
		char c;
		int total = 0;
		
		System.out.print("���ڿ� : ");
		word = sc.next();
		
		System.out.print("���� : ");
		c = sc.next().charAt(0);
		
		// System.out.println("�Է��� ���ڿ��� ���̴� " + word.length());
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == c) {
				total += 1;
			}
		}
		System.out.println(word + " �ȿ� ���Ե� " + c + " ���� : " + total);
	}
	
	public static void practice4() {
		/*
		 *  3�� ������ �����ϳ� "�� �ϰڽ��ϱ�?" ��� �� 'Y' �Ǵ� 'y' �� �ԷµǸ�
		 *  ��� �����ϰ� 'N' �Ǵ� 'n' �� �ԷµǸ� ���α׷��� �����Ѵ�.
		 *  ��, ���� ���ڰ� �ƴ� ��� "�߸��� ����Դϴ�. �ٽ� �Է����ּ���."�� ���
		 */
		String word;
		char c;
		
		while(true) {
			int total = 0;
			System.out.print("���ڿ� : ");
			word = sc.next();
			
			System.out.print("���� : ");
			c = sc.next().charAt(0);
			
			for(int i = 0; i < word.length(); i++) {
				if(word.charAt(i) == c) {
					total += 1;
				}
			}
			System.out.println(word + " �ȿ� ���Ե� " + c + " ���� : " + total);
			
			while(true) {
				System.out.print("�� �ϰڽ��ϱ�? (y/n) : ");
				c = sc.next().charAt(0);
				if(c == 'y' || c == 'Y' || c == 'n' || c == 'N') { 
					break;
				} else {
					System.out.println("�߸��� ����Դϴ�. �ٽ� �Է��ϼ���.");
				}
			}
			
			if(c == 'N' || c == 'n') {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);		// break;
			}
		}
	}
	
	public static void practice5() {
		int num, guess;
		int count = 0;
		
		Random rand = new Random();
		// rand.nextInt(100)     -> 0 ~ 99 ���� ����
		// rand.nextInt(100) + 1 -> 0+1 ~ 99+1 ���� ����
		num = rand.nextInt(100) + 1;
		
		while(true) {
			while(true) {
				System.out.print("1 ~ 100 ������ ���� ���纸���� : ");
				guess = sc.nextInt();
				if(!(guess >= 1 && guess <= 100)) {
					System.out.println("1 ~ 100 ������ ���� �Է��ϼ���.");
				} else {
					break;
				}
			}
			
			// ����ڰ� �Է��� Ƚ���� ����ϱ� ���� ����
			count += 1;
			
			if(guess < num) {
				System.out.println("UP!!");
			} else if(guess > num) {
				System.out.println("DOWN!!");
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println(count + " ȸ ���� ���߾����ϴ�.");
				break;
			}
		}
	}
	
	public static void practice6() {
		/*
		 *  ���� ���� �� ���� �����
		 *  ����ڰ� "exit" �� �Է��ϱ� ������ ���� ���� ���� ��� �����ϰ�
		 *  �����ϴ� ������ �ºθ� ����Ͽ� �������� ���
		 */
		
		int compCode, userCode;
		int cntPlay = 0, cntWin = 0, cntLose = 0, cntDraw = 0;
		String userName;
		
		Random rand = new Random();
		
		System.out.print("����� �̸��� �Է��ϼ��� : ");
		userName = sc.next();
		
		while(true) {
			/*
			 *  ���� : 0	���� : 1	�� : 2
			 */
			compCode = rand.nextInt(3);		// 0 ~ 2 ������ ������ ����
			while(true) {
				System.out.print("���� ���� �� �Է� : ");
				switch(sc.next()) {
					case "����":
						userCode = 0;	break;
					case "����":
						userCode = 1;	break;
					case "��":
						userCode = 2;	break;
					case "exit":
						userCode = -2;	break;	// userCode�� flag ��ɱ��� Ȱ��
					default:
						userCode = -1;			// userCode�� flag ��ɱ��� Ȱ��
						System.out.println("�߸� �Է��Ͽ����ϴ�.\n");
				}
				if(userCode != -1) {
					break;
				}
			}
			
			if(userCode == -2) {	// ���� �ڵ�
				System.out.println(cntPlay + "�� " + cntWin + "�� " + cntDraw + "�� " + cntLose + "��");
				System.exit(0);		// break;
			}
			
			System.out.println("��ǻ�� : " + (compCode == 0 ? "����" : compCode == 1 ? "����" : "��"));
			System.out.println(userName + " : " + (userCode == 0 ? "����" : userCode == 1 ? "����" : "��"));
			
			cntPlay += 1;
			if(compCode == 0) {				// ����
				if(userCode == 0) {
					System.out.println("�����ϴ�.");
					cntDraw += 1;
				} else if(userCode == 1) {
					System.out.println("�̰���ϴ�.");
					cntWin += 1;
				} else if(userCode == 2) {
					System.out.println("�����ϴ�.");
					cntLose += 1;
				}
			} else if(compCode == 1) {		// ����
				if(userCode == 0) {
					System.out.println("�����ϴ�.");
					cntLose += 1;
				} else if(userCode == 1) {
					System.out.println("�����ϴ�.");
					cntDraw += 1;
				} else if(userCode == 2) {
					System.out.println("�̰���ϴ�.");
					cntWin += 1;
				}
			} else if(compCode == 2) {		// ��
				if(userCode == 0) {
					System.out.println("�̰���ϴ�.");
					cntWin += 1;
				} else if(userCode == 1) {
					System.out.println("�����ϴ�.");
					cntLose += 1;
				} else if(userCode == 2) {
					System.out.println("�����ϴ�.");
					cntDraw += 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		practice6();
		// practice5();
		// practice4();
		// practice3();
		// practice2();
		// practice1();
	}

}
