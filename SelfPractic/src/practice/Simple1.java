package practice;

public class Simple1 {

	public static void main(String[] args) {
		MyMatch mm = new MyMatch();
//		mm.printGugudan(12);
		mm.add(4, 8);
		System.out.println(mm.add(4, 8));

	}

}

class MyMatch {
	
	void printGugudan(int dan) {
	//	if(!(2<=dan && dan <=9))
		//	return; // 입력받은 단(dan)이 2~9가 아니면 메서드 종료,돌아가
		
		for(int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
	
	int add(int x, int y) {
		return x * y;
	}
}