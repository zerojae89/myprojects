package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	private int [] lotto = new int[6];
	
	{
		// 중복하지 않은 1~45난수로 lotto 배열 초기화
		Random rand = new Random();
		for(int i = 0; i < this.lotto.length; i++) {
			lotto[i] = rand.nextInt(45)+1;
		}
	}
	public void information() {
		for (int i = 0 ; i<this.lotto.length -1;i++) {
			System.out.print(this.lotto[i] + ", ");
		}
		System.out.println(this.lotto[this.lotto.length-1]);
	}

}
