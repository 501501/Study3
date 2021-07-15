package com.jeongsol.s2;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		
		System.out.println("ForTest1 Start");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력");
		int count = sc.nextInt();
		
		for (int i=0;i<count;i=i+1) {
			System.out.println("Hello"+i);
		}
		
		// 0 - 20 미만 사이에 짝수만 출력
		for (int i=0; i<20; i=i+1) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		for (int i=0; i<20; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("ForTest1 Finish");
		}
	}


