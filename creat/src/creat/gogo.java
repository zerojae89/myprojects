package creat;

import java.util.Random;
import java.util.Scanner;


public class gogo {
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {int num, guess;
	int count = 0;
	
	Random rand = new Random();
	num = rand.nextInt(100) + 1;
	
	while(true) {
		while(true) {
			System.out.print("1 ~ 100 사이의 값을 맞춰보세요: ");
			guess = sc.nextInt();
			if(!(guess >=1 && guess <= 100)) {
				System.out.println("1 ~ 100 사이의 값을 입력하세요!");
			}else {
				break;
			}
		}
		
		count +=1;
		if(guess < num) {
			System.out.println("UP!!");
		}else if (guess > num) {
			System.out.println("DOWN!!");
		}else {
			System.out.println("정답입니다.");
			System.out.println(count+" 회만에 맞추었습니다.");
			break;
		}
	}
	
	
}

public static void practice6(){
	int compCode, userCode;
	int cntPlay = 0, cntWin = 0, cntLose = 0, cntDraw = 0;
	String userName;
	
	Random rand = new Random();
	
	System.out.print("당신의 이름을 입력하세요 : ");
	userName = sc.next();
	
	while(true) {
		/*
		 *  가위 : 0	바위 : 1	보 : 2
		 */
		compCode = rand.nextInt(3);		// 0 ~ 2 까지의 난수값 생성
		while(true) {
			System.out.print("가위 바위 보 입력 : ");
			switch(sc.next()) {
				case "가위":
					userCode = 0;	break;
				case "바위":
					userCode = 1;	break;
				case "보":
					userCode = 2;	break;
				case "exit":
					userCode = -2;	break;	// userCode에 flag 기능까지 활용
				default:
					userCode = -1;			// userCode에 flag 기능까지 활용
					System.out.println("잘못 입력하였습니다.\n");
				
		}
		if(userCode != -1) {
			break;
		}
	}
	
	if(userCode == -2) {	// 종료코드
		System.out.println(cntPlay + "전 " + cntWin + "승 " + cntDraw + "무 " + cntLose + "패");
		System.exit(0);		// break;
	}
	
	System.out.println("컴퓨터 : " + (compCode == 0 ? "가위" : compCode == 1 ? "바위" : "보"));
	System.out.println(userName + " : " + (userCode == 0 ? "가위" : userCode == 1 ? "바위" : "보"));
	
	cntPlay += 1;		//가위
	if(compCode == 0) {
		if(userCode == 0) {
			System.out.println("비겼습니다.");
			cntDraw += 1;
		} else if(userCode == 1) {
			System.out.println("이겼습니다.");
			cntWin += 1;
		} else if(userCode == 2) {
			System.out.println("졌습니다.");
			cntLose += 1;
		}
	} else if(compCode == 1) {		//바위
		if(userCode == 0) {
			System.out.println("졌습니다.");
			cntLose += 1;
		} else if(userCode == 1) {
			System.out.println("비겼습니다.");
			cntDraw += 1;
		} else if(userCode == 2) {
			System.out.println("이겼습니다.");
			cntWin += 1;
		}
	} else if(compCode == 2) {
		if(userCode == 0) {
			System.out.println("이겼습니다.");
			cntWin += 1;
		} else if(userCode == 1) {
			System.out.println("졌습니다.");
			cntLose += 1;
		} else if(userCode == 2) {
			System.out.println("비겼습니다.");
			cntDraw += 1;
		}
	}
}
}




}

 


