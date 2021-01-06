package com.kh.exam01;

public class Sample1 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = !b1;
		System.out.print(b1);
		System.out.print(" " + b2 + "\n");
		
		// ++ -> +1 ����, -- -> -1 ����
		int n1 = 10;
		System.out.println(++n1);	// ���� ��� �� ���(����)
		
		int n2 = 20;
		System.out.println(n2++);	// ��� �� ���� ���(����)
		System.out.println(n2);
		
		int n3 = 15;
		System.out.println(--n3);	// ���� ��� �� ���(����)
		
		int n4 = 25;
		System.out.println(n4--);	// ��� �� ���� ���(����)
		System.out.println(n4);
		
		// ������� : +, -, *, /, %(������)
		System.out.println("�� : " + 10 / 3);
		System.out.println("������ : " + 10 % 3);
		System.out.println("�������� 0 �̸� 3�� ��� 12 % 3 -> " + 12 % 3);
		System.out.println("�������� 1 �̸� Ȧ�� 11 % 2 -> " + 11 % 2);
		
		// �񱳿��� : ==(����), !=(�ٸ���), >(���ʰ��� ũ��), <(���ʰ��� �۴�)
		//          >=(���ʰ��� ũ�ų� ����), <=(���ʰ��� �۰ų� ����)
		// �񱳿����� ����� ����(true, false)���� ���´�.
		System.out.println(10 == 10);
		System.out.println(10 == 20);
		System.out.println(10 != 20);
		System.out.println(10 > 20);
		System.out.println(10 < 20);
		System.out.println(10 >= 20);
		System.out.println(10 <= 20);
		
		// ������ : ������ ����� ����
		//     &&(and ����) : �� �ǿ������� ������ true �϶� true�� �ȴ�.
		//     ||(or ����) : �� �ǿ����� �� �ϳ��� ������ true �϶� true�� �ȴ�.
		System.out.println("true && true -> " + (true && true));
		System.out.println("true && false -> " + (true && false));
		System.out.println("false && true -> " + (false && true));
		System.out.println("false && false -> " + (false && false));
		
		System.out.println("true || true -> " + (true || true));
		System.out.println("true || false -> " + (true || false));
		System.out.println("false || true -> " + (false || true));
		System.out.println("false || false -> " + (false || false));
		
		// ��Ʈ���� : 2���� ���� ���� ������ ����
		//     &(bit and ����) : �� ��Ʈ�� ���� 1�϶� 1�� �ȴ�.
		//     |(bit or ����)  : �� ��Ʈ�� �� �� �ϳ��� ��Ʈ�� 1�϶� 1�� �ȴ�.
		//     ^(bit xor ����) : �� ��Ʈ�� ���� ������ 0, �ٸ��� 1 �� �ȴ�.
		//                      ��Ÿ�� ����
		//     >>(����Ʈ ����) : ������ �������� ��Ʈ �̵�(1��Ʈ �̵��� 2�� ���� ȿ��)
		//     <<(����Ʈ ����) : ���� �������� ��Ʈ �̵�(1��Ʈ �̵��� 2�� ���� ȿ��)
		//     >>>(����Ʈ ����) : ������ �������� ��Ʈ �̵�(��ȣ��Ʈ�� ���� ��� ���� 0���� ä��)
		// 10 & 6 -> 1010 & 0110 -> 0010 -> 2
		// 10 | 6 -> 1010 | 0110 -> 1110 -> 14
		// 10 ^ 6 -> 1010 ^ 0110 -> 1100 -> 12
		System.out.println(10 & 6);
		System.out.println(10 | 6);
		System.out.println(10 ^ 6);
		System.out.println(-10 | -6);
		System.out.println(-10 & -6);
		// 1010 -> 101(5) -> 10(2)
		System.out.println(10 >> 1);
		System.out.println(5 >> 1);
		// 1010 -> 10100(20) -> 101000(40)
		System.out.println(10 << 1);
		System.out.println(20 << 1);
		System.out.println("a " + (-10 >> 1));
		System.out.println("b " + (-10 >>> 1));
		
		// ���� ���� ������ : ���, ��Ʈ ������ ������ ���Ա��� �����ϴ� ������
		int x = 0;
		x = x + 10;
		System.out.println(x);
		
		int y = 0;
		y += 10;	// 1�� �����ϴ� ���� ++y ����ϸ� ������, 2 �̻� ���� ����
		// �ϴ� ���꿡 ���� �ڵ� �ۼ��� �� ���� ���
		System.out.println(y);
		
		// ���� ������
		// ���ǽ� ? ��1 : ��2;
		// ���ǽ��� ���̸� ��1 ����, ���ǽ��� �����̸� ��2 ����
		int z = 8;
		boolean b3;
		
		//   ���ǽ�      ? ��1   : ��2;
		b3 = z % 2 == 0 ? true : false;
		System.out.printf("���� %d�� ¦���� %b\n", z, b3);
		
		// ���� ���� ��ø
		String s;
		s = z < 10 ? z % 2 == 1 ? "z�� 10���� �۰� Ȧ��" : "z�� 10���� �۰� ¦��" : "z�� 10�ʰ�";
		System.out.println(s);
	}

}
