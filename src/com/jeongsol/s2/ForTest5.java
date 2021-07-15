package com.jeongsol.s2;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		System.out.println("ForTest5 Start");
		// 과목 수 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("과목 수 입력");
		int count = sc.nextInt();
		int sum = 0;
		int score = 0;
		
		// 과목 수 만큼 점수 입력
		for (int i=0;i<count;i++) {		
			System.out.println(i+1+"번째 점수 입력");
			score = sc.nextInt();
			sum += score;
		}
		
		// 총점 평균 계산 후 출력
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +sum/(double)count);
		
		System.out.println("ForTest5 Finish");
	}

}
