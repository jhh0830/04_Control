package com.kh.chap01.condition;

import java.util.Scanner;

// if-else문, if-else if문
public class B_Else {
	
	/*
	 * * if-else문
	 * 한번에 두 개의 경우의 수를 나타낼 수 있는 선택문
	 * 
	 * 
	 * [ 표현법 ]
	 * if (조건식){
	 * 
	 * 		조건식 결과가 true 일 경우 실행할 구문;
	 * } else {
	 * 
	 *  	조건식 결과가 false 일 경우 실행할 구문;
	 * }
	 * > 조건식의 결과가 true 일 경우 
	 * if 블럭({ 여기 }) 안의 코드가 실행된 후 if-else문 자체를 빠져나감
	 * > 조건식의 결과가 false 일 경우
	 * 	else 블럭 ({ 여기 }) 안의 코드가 실행된 후 빠져나감
	 * 
	 *
	 */
	
	// 단독 if문 --> if-else문
	
	public void method1() {//metohd1 메소드 영역 시작
		
		// 사용자에게 정수값을 입력받은 후
		// 짝수인지 홀수 인지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		// if-else문 버전
		
		// 첫번째 경우의 수 : 짝수일 경우
		/*if(num % 2 == 0) {
			System.out.println("짝수입니다.");
			
		} else {
			// 두번째 경우의 수 : 짝수가 아닐경우
			
			System.out.println("홀수입니다.");
		}*/
		
		// 위의 코드를 보완해서
		// 양수이면서 짝수인경우, 양수이면서 홀수일경우를 판별
		// > 중첩 if문 이용
		
		
		// 우선 양수인지 먼저 판별
		if(num > 0) {
			//num 이 양수일 경우에만
			// 이 안에서 짝수인지 홀수인지 판별하기
			if(num%2 ==0) {
				//첫번째 경우의 수 : 짝수일경우
				System.out.println("양수이면서 짝수입니다.");
			} else {
				// 두번째 경우의 수 : 짝수가 아닐경우
				System.out.println("양수이면서 홀수입니다.");
			}
		}// if 블럭 끝
		else if(num < 0){
			System.out.println("음수입니다.");
		}else {
			System.out.println("0 입니다.");
		}
		
		
	}//metohd1 메소드 영역 끝
	
	/*
	 * * if-else if문
	 * 한번에 세개 이상의 경우의 수를 나타내고 싶을 때 쓰는 선택문
	 * 
	 * 
	 * [ 표현법 ]
	 * if(조건식1) {
	 * 
	 * 		조건식1 이 true 일 경우 실행할 코드;
	 * 		
	 * } else if(조건식2){
	 * 
	 * 		조건식2 가 true 일 경우 실행할 코드;
	 * } else if(조건식3) {
	 * 
	 * ...
	 * } else{
	 * 
	 *   앞에 제시한 조건들이 모두 false 일 경우
	 *   실행할 코드;
	 * }
	 *  
	 */
	
	public void method2() {// mthod2 메소드 영역 시작
		
		// 사용자로부터 정수를 입력받아
		// 양수인지, 0인지, 음수인지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		// if-else if문 버전
		
		if(num > 0) {// 양수일 경우
			System.out.println("양수입니다.");
			
		} else if(num == 0) {// 0일 경우
			System.out.println("0 입니다.");
		} else{// 양수도 아니고 0도 아닐경우
			System.out.println("음수입니다.");
		}
		
		
	} // mthod2 메소드 영역 끝
	
	public void method3() {// method3() 영역 시작
		
		// 나이를 입력받은 후
		// 어린이인지, 청소년인지, 성인인지를 판별 후 결과 출력
		
		// 어린이 : 13세 이하
		// 청소년 : 13세 초과 ~ 19세 이하
		// 성인 : 19세 초과
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		if(age < 13) {
			System.out.println("어린이입니다.");
	
		} else if( 13 <= age && age <= 19 ) {
			//> 위에 if 블럭을 건너뛰고 이시점까지 왔다라는것은
			// age 가 13 초과하는 경우임!!
			System.out.println("청소년 입니다.");
		} else if(age > 19){
			System.out.println("성인입니다.");
		
		
		} else if (age < 0 ) {
			System.out.println("음수입니다.");
			
		}
		
	} // method 3 메소드 영역 끝
	public void method4() {
		
		// 사용자에게 점수를 입력받은 후
		// 90점 이상인 경우 "A등급"
		// 80점 이상인 경우 "B등급"
		// 70점 이상인 경우 "C등급"
		// 70점 미만인 경우 "D등급"
		// "당신의 점수는 XX점이고, 등급은 X등급입니다." 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세여 : ");
		int score = sc.nextInt();
		sc.nextLine();
		
		
		
		// 점수는 0점~100점
		// 등급을 판별하기 전에 제대로된 점수인지 먼저 검사하기
		if((0 <= score) && (score<= 100)) {
			//제대로 된 점수일 경우
			//본격적인 판별 전 판별된 등급을 담아둘 변수 셋팅
			char grade = ' '; //  char 타입의 경우 일반적으로 공백으로 초기화
			
			//String str = ""; // 문자열인데 내용물이 없는 문자열 (빈문자열)
		
			// > 지역변수 (local variable)
			// 이 grade 라는 변수는 이 if 블럭 안쪽에서만 사용 가능
			// 주로 지역 변수는 초기화 후에 사용하는걸 권장
			if(score >= 90) {// A 등급
				grade = 'A';
			}else if(score >= 80) {// B 등급
				grade = 'B';
				
			}else if(score >= 70) {// C 등급
				grade = 'C';
				
			}else {// D 등급
				grade = 'D';
			}
			// 이 시점 기준으로
			// 각 등급에 대한 판별이 끝난 상태
			// 해당 등급을 출력하는 구문을 단 한번만 작성할것!!
			System.out.printf("당신의 점수는 %d점이고, 등급은 %c등급 입니다.\n",score,grade);
			
		}else {
			// 제대로 점수가 아닐경우
			System.out.println("잘못 입력했습니다.");
		}
		
		
		
		
	}
}
