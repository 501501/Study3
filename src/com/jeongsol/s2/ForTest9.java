package com.jeongsol.s2;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("ForTest9 Start");
		// FPS
		// 탄창
		// 한 탄창에 30발
		// 단발 모드 1발, 점사 모드 3발
		// 1. 단발? 2. 점사?
		// 1 - 탕 30번
		// 2 - 타타탕 10번
		Scanner sc = new Scanner(System.in);
		
//		for(int tan=0;tan<3;tan++) {
//			System.out.println("1. 단발 : 2. 점사");
//			int select = sc.nextInt();
//			if(select==1) {
//				for(int i=0;i<30;i++) {
//					System.out.println("탕");
//				}
//			} else {
//				for (int i=0;i<10;i++) {
//					System.out.println("타타탕");
//				}
//			}
//		}
		
		for(int tan=0;tan<3;tan++) {
			System.out.println("1. 단발 : 2. 점사");
			int select = sc.nextInt();
			String sound = "탕";
			//int count = 30;
			if (select != 1) {
				sound = "타타탕";
				//count = 10;
			}
			
			for (int i=0;i<30;i++) {
				System.out.println(sound);
			}
		}
		System.out.println("ForTest9 Finish");
	}

}
