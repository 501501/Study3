package com.jeongsol.s4;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요");
		int count = sc.nextInt();
		int [] nums = new int[count];
		// 각 인덱스 번호에 숫자 입력
		for (int i=0;i<count;i++) {
			System.out.println(i+1+"번 번호 입력");
			nums[i] = sc.nextInt();
		}
		
		// index 0으로 시작, 1씩
		for (int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		// 총점과 평균 출력
		int sum = 0;
		double avg = 0;
		for (int i=0;i<nums.length;i++) {
			sum += nums[i];
		}
		
		avg = sum / (double)nums.length;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
	}

}
