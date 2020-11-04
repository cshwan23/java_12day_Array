# java_12day_Array
Array



package com.daum.erp;

import java.util.Scanner;

public class Test_07 {
 
		public static void main(String[] args) {

//			양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.
			
			Scanner scanner = new Scanner(System.in);
			
//			int intArray[] = new int[5]; 배열 생성

			int max = 0;
			int min = 1000;
			System.out.print("양수 5개를 입력하세요.");
			
			for(int i = 0; i<5; i++) {
				intArray[i] = scanner.nextInt();//입력 받은 정수를 배열에 저장
				if(intArray[i] < min) //intArray[i]가 현재 가장 큰 수보다 크면
					min = intArray[i];  //intArray[i]를 max로 변경
			
			}
			System.out.print("가장 작은 수는 " + min + "입니다.");
			scanner.close();
			
//			양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.
			
			Scanner scanner = new Scanner(System.in);
			
			int intArray[] = new int[99];
			int answerRandom = (int)(Math.random()*99)+0;
			System.out.print("수를 입력하세요.");
			int my_answer = 0;
			my_answer = scanner.nextInt();
			String result = "정답입니다 " + answerRandom;
			String resultUp = "더 높습니다 ";
			String resultDown = "더 낮습니다  ";
			
			
			while(true) {
			
				my_answer = scanner.nextInt();
				
			
			if  (my_answer>answerRandom) {
				
				System.out.println(resultDown);
				
			}else if  (my_answer<answerRandom){
			
				System.out.println(resultUp);
			
			}else{
				System.out.println(result);
				break;
				
			}	
			}
			scanner.close();
			
			
			 "1.예금" 선택 후 금액을 입력하면 예금액이 합산됩니다.
			 "2.출금" 선택 후 금액을 입력하면 예금액이 차감됩니다.
			 "3.잔고" 선택 시 잔고가 출력됩니다.
			 "4.종료" 선택 시 종료됩니다.
			 "1234 이외의 숫자" 다시 입력해주세요 메시지 출력됩니다.
//내가 푼 정답.1
			입금액
			int myAccount = 0;
			출금액
			int withDraw = 0;
			int myChoose = 0;
			int remain = 0;
			
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("선택>");
			
			
			while (true) {
				myChoose = scanner.nextInt();
				
				if (myChoose == 1) {
					System.out.println("예금 액을 입력하세요");
					myAccount = scanner.nextInt();
					remain = remain + myAccount;
					System.out.println(myAccount + "원이 예금 되었습니다");
					System.out.println("1.예금 2.출금 3.잔고 4.종료");
				}
				 if (myChoose == 2){  
					System.out.println("출금 액을 입력하세요");
					withDraw = scanner.nextInt();
					if(withDraw <= remain) {
					
					remain = remain - withDraw;
					System.out.println(withDraw + "원이 출금 되었습니다");
					}else {
						System.out.println("잔액이 부족합니다");
					}
					
					System.out.println("1.예금 2.출금 3.잔고 4.종료");
				}
				 if (myChoose ==3) {
					System.out.println("현재 잔고액은 "+ remain +  "원 입니다");
					System.out.println("1.예금 2.출금 3.잔고 4.종료");
				}
				  if (myChoose == 4) {
					System.out.println("종료 되었습니다");
					break;
			}
				  if(myChoose > 4){
			
					System.out.println("번호를 다시 입력해주세요"+"\n"+"1.예금 2.출금 3.잔고 4.종료");
			
			   }
			}
			scanner.close();
			
//내가 푼 정답.2
			
			int menuNo;
			int sum = 0;
			int inputNum = 0;
			boolean run = true;
			
			while(run) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1.예금|2.출금|3.잔고|4.종료");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("선택>");
				
				menuNo = scanner.nextInt();
	
				switch(menuNo) {
				
				case 1:
					System.out.println("예금액>");
					sum += scanner.nextInt();
					break;
				case 2:
					System.out.println("출금액>");
					inputNum = scanner.nextInt();
					if(sum > inputNum ) {
						sum -= inputNum;
					}else{
						System.out.println("잔액이 부족합니다.");
					}
					break;
				case 3:
					System.out.println("잔고액>");
					System.out.println(sum);
					break;
				case 4:
					System.out.println("종료>");
					run = false;
					break;
				default:
					System.out.println("다시입력>");
					break;
				}
			}
			System.out.println("종료되었습니다.");
			scanner.close();
			
//배열 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 평균을 구하는 프로그램을 작성하라.
			
//	int intArray[] = new int[5]; 5개의 숫자를 담는 배열
	int sum = 0;
	
	System.out.print(intArray.length + "개의 정수를 입력하세요>>");
	
	for(int i = 0; i<intArray.length; i++) {
	
		        intArray[i] = scanner.nextInt(); 키보드에서 입력받은 정수를 저장 
	}
			
	for(int i = 0 ; i<intArray.length ;  i++) {
				
				sum += intArray[i];
				
	}
	
	System.out.print("평균은 " + (double)sum/intArray.length);
	scanner.close();		
			
			
// 임의의 양수 10개를 배열을 이용해서
// 생성 후 3의 배수인 것 갯수와 합을 출력하세요.
	
	int tenArray[] = new int[10];
	int tot = 0;
	int cnt = 0;
	
	System.out.print(tenArray.length+"개의 정수를 입력하세요>>");
	for( int i = 0; i <10 ; i++   ) {
		
		tenArray[i] = scanner.nextInt();
		
	}
	for (int i = 0 ; i < 10 ; i++) {
		
		 if ((tenArray[i]%3) == 0 ) {
			 
			 cnt++;
			 
			 tot += tenArray[i]; 
			 
			 }
	 }
	
	 System.out.print("3의 배수 "+ cnt +"개, 합은 "+ tot);
	 scanner.close();
		

//	 로또번호생성기(1~45)
//	 실제 로또는 나왔던 번호가 또 나오지 않는다
	
	int lottoArray[] = new int[6];
//	45개 생성.
	
	
	for(int i = 0; i < 6; i++) {
	
		lottoArray[i] = (int)(Math.random()*45)+1;

			 for(int j = 0 ; j < 6; j ++) {
                
				while(true) {
					
					if (lottoArray[i] == lottoArray[j]) {
							
							i = i-1;
							
							break;
							
					}else{
						
							break;
					}
					
				}
				
			}
	}
	for(int i = 0; i<6;i++) {
	System.out.print(lottoArray[i]+"\t");
	}
	
	
	for - each
	
	int num[] = {1,2,3,4,5};
	
	int sum = 0;
	for(int k : num) {
		sum += k;
	}
	System.out.println("합=>" + sum);
	
	String []name = {"사과","배","바나나","체리","딸기","포도"};
	for (String s: name) {
		System.out.print(s + "");
	}
	System.out.print("\n");
	for(Week day: Week.value()) {
		System.out.print(day + "요일");
	}
		
	
//	2차원 배열...
	
	
	
	
	
	
	
	


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

	
			
	}
	

}
