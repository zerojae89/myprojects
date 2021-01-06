package com.kh.practice.student.controller;

import java.util.Scanner;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	private Scanner sc = new Scanner(System.in);

	public Student[] sArr;
	public static final int CUT_LINE1 = 60; // 클래스(정적) 변수(상수), 클래스명.변수명으로 호출
	public final int CUT_LINE2 = 60; // 인스턴스 변수(상수), 객체명.변수명으로 호출

	public StudentController() {
		// 5개 객체배열을 샘플데이터 값으로 초기화하는 생성자
//		sArr[0] = new Student("김길동", "자바", 100);
//		sArr[1] = new Student("박길동", "디비", 50);
//		sArr[2] = new Student("이길동", "화면", 85);
//		sArr[3] = new Student("정길동", "서버", 60);
//		sArr[4] = new Student("홍길동", "자바", 20);
	}

	public Student[] printStudent() {
		return sArr;
	}

	public int sumScore() {
		int sum = 0;
		for (int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}

	public double[] avgScore() {
		double[] avg = new double[2];
		avg[0] = this.sumScore();
		avg[1] = avg[0] / sArr.length;
		return avg;
	}

	public void add(String name, String subject, int score) {
		if (sArr == null) {
			sArr = new Student[1];
			sArr[0] = new Student(name, subject, score);
		} else {
			Student[] tmp = new Student[sArr.length + 1];
			System.arraycopy(sArr, 0, tmp, 0, sArr.length);
			tmp[tmp.length - 1] = new Student(name, subject, score);
			sArr = tmp; // 얕은 복사
		}
	}

	public void modify(String name, String subject, int score) {
		int index; // 수정할 인덱스를 입력받을 지역변수 선언
		for(int i = 0; i <sArr.length; i++) {
			if(sArr[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println(name + "에 해당하는 학생이 존재하지 않습니다.");
		}else {
			sArr[index].setSubject(subject);
			sArr[index].setScore(score);
			System.out.println(name + "에 해당하는 정보를 수정했습니다.");
		}
			
	}

	public void delete(String name) {
		int count1 = 0; 
		// 입력받은 이름과 배열객체값이 중복되는 횟수를 세기 위한 변수
		// 중복횟수를 세어서, (sArr의 길이 - 중복횟수) 길이로 tmp 배열을 생성한다
		int count2 = 0;
		// 반복문을 돌려서, tmp[i]에 삭제될 값을 제외한 데이터들을 저장하기 위한 변수
		
		// 중복횟수 count1에 저장
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].getName().equals(name)) {
				count1++;
			}
		}
		
		// 중복횟수만큼 뺀 길이로 tmp 배열 생성
		Student[] tmp = new Student[sArr.length - count1];
		
		// tmp[i]에 삭제가 안되는 데이터만을 넣기 위한 반복문. count2를 이용하여 구성.
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].getName().equals(name)) { // 입력받은 name(이름)이 sArr[i]번째의 이름과 같으면
				count2++; // count2를 1씩 증가시키고
			} else {
				tmp[i - count2] = sArr[i]; // 같지 않은 경우에만,tmp[i-count2]에 sArr[i]값을 입력.
			}
		}
		
		// sArr을 tmp 길이만큼 변경해주고, arraycopy 이용하여 tmp의 내용을 복사.
		sArr = new Student[tmp.length];
		System.arraycopy(tmp, 0, sArr, 0, tmp.length);
	}

	public void printAll() {
		if (sArr == null) {
			System.out.println("\n표시할 성적이 없습니다.\n");
		} else {
			for (int i = 0; i < sArr.length; i++) {
				System.out.println("\n" + sArr[i].inform());
			}
		}
	}
}
