package com.jeongsol.s2;

import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		System.out.println("ForTest8 Start");
		// 분, 초 출력
		// 0분 0초 
		// 0분 1초
		// 0분 2초
		// ...
		// 0분 59초
		// 1분 0초
		// 1분 1초
		// 1분 2초
		// ...
		// 1분 59초
		// 2분 0초
		// ...
		// 59분 59초
//		for(int min=0; min<60; min++) {
//			for(int sec=0;sec<60;sec++) {
//				System.out.println(min +"분 " + sec +"초");
//			}
//		}
		
		// 분, 초 입력 1, 10
		int myMin=0, mySec=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("분 입력 : ");
		myMin = sc.nextInt();
		System.out.println("초 입력 : ");
		mySec = sc.nextInt();
		
		for(int min=0;min<60;min++) {
			for(int sec=0;sec<60;sec++) {
				System.out.println(min + "분 " + sec + "초 ");
				if (sec==mySec && min==myMin) {
					System.out.println("종료");
					break;
				}
			}
			if (min==myMin)
				break;
		}
		
		
		System.out.println("ForTest8 Finish");
	}
}
