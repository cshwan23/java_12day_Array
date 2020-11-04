


package com.daum.erp;

import java.util.Scanner;

public class Test_08 {
 
		public static void main(String[] args) {
//
//2차원 배열에 학년별로 1,2학기 성적으로 저장하고, 4년간 전체 평점 평균을 출력하라.
			
//			
//		double score[][] = {{3.3,3.4},   // 1학년 1학기 평점,1학년 2학기 평점
//							{3.5,3.6}, 	 // 2학년 1학기 평점, 2학년 2학기 평점
//							{3.7,3.8},   // 3학년 1학기 평점, 2학년 2학기 평점
//							{4.1,4.2}};  // 4학년 1학기 평점, 2학년 2학기 평점
//		
//		double sum = 0;
//		for(int year = 0; year < score.length; year++) {
//			
//			 for(int term=0; term<score[year].length; term++) {
//				 
//				 sum += score[year][term];// 전체 평점 합
//				 
//		int n = score.length
				 
			 
	
		
// 비정방형 배열
// 다음 그림과 같이 비정방형 배열을 만들어 값을 초기화하고 출력하시오.
//10 11 12
//20 21
//30 31 32 
//40 41
//			int intArray[][] = new int[4][];//큰 방 하나 만든다. 4개의 학년으로 이루어진.
//			// 각 학년별로 작은 방을 또 만든다
//			intArray[0] = new int[3];   // 1 학년 작은 방 // 1학년은 3반으로 이루어져 있다.
//			intArray[1] = new int[2];	// 2 학년 작은 방 // 2학년은 2반으로 이루어져 있다.
//			intArray[2] = new int[3];	// 3 학년 작은 방 // 3학년은 3반으로 이루어져 있다.
//			intArray[3] = new int[2];	// 4 학년 작은 방 // 4학년은 2반으로 이루어져 있다.
//			
//			//왜 for문을 쓰는가 ? 왜 돌려야 하는가?	//일단 크게 4학년으로 학년별로 들어가본다.
//			for (int i = 0; i< intArray.length ; i++) {
//				
//				//왜 한번더 for문으로 들어가는가?  // 각 학년에 반을 나누어 들어가 본다
//				for (int j = 0; j < intArray[i].length ; j++) {
//					
//					//왜 각 학년과 학반으로 들어가는가?  //그리고 사칙연산법은 무엇을 의미하는가?
//					intArray[i][j] = (i+1)*10 + j;								
//				}			
//			}
//			//왜 또 for문으로 들어가는가?
//			for (int i = 0; i < intArray.length; i++) {
//				
//				for(int j = 0; j < intArray[i].length; j++) {
//					
//					System.out.print(intArray[i][j]+ " ");
//					
//				}
//				
//				System.out.println("");
//			}
//		
		
///메소드에서의 배열 리턴
			
//정수형 배열을 리턴하는 메소드
			
// 정수 4개를 가지는 일차원 배열을 생성하고 1,2,3,4로 초기화 한 다음, 배열을 리턴하는 makeArray()를 작성하고,
// 이 메소드로부터 배열을 전달받아 값을 출력하는 프로그램을 작성하라.
			
			int intArray[]; 
			intArray = makeArray();
			for (int i = 0 ; i < intArray.length; i++) {
				System.out.print(intArray[i]+"");
			}
			
			
			
			double sum = 0.0;
			
			for (int i = 0; i <args.length ; i++) {
				
				sum += Double.parseDouble(args[i]);
			
			}
			
			System.out.println("합계 : " +sum);
			
			


	}
			static int[] makeArray() { 
			
			//배열 생성
			int temp[] = new int[4]; //배열 생성
			
			//배열의 원소를 0,1,2,3으로 초기화
			for (int i = 0; i < temp.length; i++) {
				temp[i] = (i+1)*10;				
			}

			return temp;

				}
			
	

}
