package com.kh.chap02.loop;

// while문 , do-while문
public class B_While {
	
	/*
	 * * while문 
	 * 반복 횟수가 다소 명확하지 않을 때 사용하는 반복문
	 * 조건식을 제시하고, 그 조건검사 결과가 매번 true 냐 false 냐
	 * 에 따라서 반복을 더 진행할지 말지를 판별하는 원리임
	 * 
	 * * while문을 이왕이면 for문과 유사한 형태로 써보자
	 * 
	 *  [ 표현법 ]
	 *  초기식 // 필수는 아님
	 *  while(조건식){ // 조건검사가 결과가 true일 경우 해당구문들 실행
	 *  			 // 조건검사가 결과가 false일 경우 해당 구문을 빠져나감 
	 *  			
	 *  	반복적으로 실행할 구문;
	 *  	증감식; // 필수는 아님
	 *  
	 *  }
	 * 	> 초기식과 증감식이 없음 (그래서 횟수가 명확하지 않을 때 주로 사용)
	 * 	> 조건식 부분에 대놓고 true 를 쓰면 무한 반복이 일어난다.
	 * 	  즉, for(;;) 랑 같은뜻임 !!
	 * 
	 * 
	 */
	public void method1() {
		// "안녕하세요" 를 5번 출력
		// for문 버전
		/*
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		*/
		
		//while문 버전
		int i = 0; // 초기식
		
		while(i < 5) {
			System.out.println("안녕하세요");//반복적으로 실행할 구문
			i++;// 증감식
		}
		
	}// method1 메소드 영역 끝
	
	public void method2() {
		
		// "i : 1"
		// "i : 2"
		// "i : 3"
		// ...
		// "i : 10"
		
		/*for(int i = 1; i <= 10; i++) {
			
			System.out.println("i : " + i);
			
			
		}*/
		
		//System.out.println("마지막 i : " + i);// 11 (빠져나감)
		// > 반복 10회
		// > 증감식에 의해 마지막 i는 11이 되는 것이 맞음!!
		//   하지만 초기식에서 셋팅했었던 i 라는 변수는
		//   for문 중괄호 안쪽 에서만 유효하게 쓸 수 있기 때문에
		//   for문 밖에서 마지막 i 값을 출력해볼 수 없다.
		
		
		
		
		
		
		//while문 
		//  i =  1 2 3 4 5 6 7 8 9 10 (반복이 돔) / 11 (빠져나감)
		int i = 1;
		while(i <= 10) {
			
			System.out.println("i : " + i);
			i++; // 증감식
		}
		
		System.out.println("마지막 i : " + i); // 11
		// > 반복 10회
		// > 위의 초기식은 while문 영역 밖에서 선언되었기 때문ㅇ
		//  while문이 끝나더라도 추후에 계쏙 사용 가능하다.
		
	} //method2 영역 끝
	public void method3() {
		
		// "1 2 3 4 5"
		
		// > 규칙 : 시작수 1, 끝수 5 포함, 1씩 증가
		
		// for(int i = 1; i <= 5; i++)
		
		//while문 버전
		
		int i = 1;
		
		while(i <= 5) {
			
			System.out.print((i++) +" ");
			//i++;
			// > 증감식을 생략하는 대신,
			// i 출력 후 1 증가될 수 있게끔 증감 "후위" 연산자 이용
		}
		System.out.println();
		System.out.println("i : " +i);
		
		// "5 4 3 2 1"
		
		// i -=1;로하고 i--;로 해서 감소 먼저해주기
		// 
		
		while(i > 1) {
			
		//i--;
		System.out.print((--i) +" ");	
		// > 이번에는 전위연산자를 이용한 증감식 작성
		
		}
		System.out.println();
		System.out.println("i : " + i);
	}// method 3 영역 끝
	
	public void method4() {
		// "1 3 5 7 9"
		// 홀수만 출력
		
		// 방법1) i 에 홀수만 담기게끔 유도하는 방법
		// for(int i = 1; i<=9; i+=2) 
			
		/*int i = 1;
		while(i<= 9) {
			System.out.print(i + " ");
			i += 2;
		}*/
		
		// > 마지막 이 시점에서의  i : 11
		
		
		// 방법2) 반복을 9회 돌리되, 홀수일 경우에만 출력하는 방법
		// for(int i = 1; i <= 9; i++)
		// 내부에서 if문으로 한번 더 홀수인지 판별했었음!!
		int i = 1;
		while(i <= 9) {
			if(i%2 == 1) {
				System.out.println(i +" ");
				//i++;
			}/*else {
				i++;
			}*/
			i++;
		}
	} // method4 영역 끝
	public void method5() {
		
		// 1 ~ 10 까지의 총합계
		
		// > 규칙 : 시작 수 1, 끝수 10포함, 1씩 증가
		
		// 총합을 담아둘 변수
		int sum = 0;
		
		int i = 1;
		
		while(i <= 10) {
			
			sum = sum + i; // sum += i;
			i++;
		}
		System.out.println("sum : " + sum );
	}// method5 메소드 영역 끝
	
	public void method6() {
		
		// >  규칙 : 시작수 1, 끝수 5 포함, 1씩 증가
		int i = 1;
		while(true) {
			System.out.print(i +" ");
			i++;
		}
		// > 의도적으로 무한반복을 돌리고 싶다면?
		// 조건식 부분에 대놓고 true 를 기술
		
	} // method6 메소드 영역 끝
	
	/*
	 * * do-while문
	 * 별도의 조건 검사 없이 반복 시작 전 무조건 해당 구문을
	 * 한번 미리 시작하고 나서 반복이 진행되는 구문
	 * 
	 * [ 표현법 ]
	 * do {
	 * 		
	 * 		반복적으로 실행하고자 하는 코드;
	 * 
	 * } while(false);
	 * > 별도의 조건 검사 없이 무조건 실행할 코드를 무조건 한번 실행
	 * (즉, 조건 검사 결과가 처음부터 false 여도 적어도 한번 실행)
	 * > 그 이후 조건식을 통해 조건검사 진행 후
	 * 	행당 조건검사 결과가 true 면 실행할 코드를 다시 실행
	 * 					false 면 반복문을 빠져나옴
	 * 
	 * 
	 * 
	 */
		public void method7() {
			
			//while문
			/*
			int num = 1;
			while(num == 0) {
				System.out.println("안녕!");
			}*/

			// > 애초에 조건이 맞지 않을 경우
			// while문은 반복이 단 한번도 실행되지 않음 (0회)
		
			// do-while문
			int num  =1;
			do {
				System.out.println("안녕!");
			}while(num == 0);
			// > 애초에 조건이 맞지 않더라도
			// 		do-while문은 적어도 해당 구문이 한번은 일어나게 되어있음 (1회)
			
			// > do-while문은 개발자가 원하는 반복 횟수 + 1회
			//	 (이런 특징 때문에 실제로 엄청 많이 쓰이지는 않음)
			
		} // method7 메소드 끝 영역
		
		public void method8() {
			
			// "1 2 3 4 5"
			
			int i = 1;
			//while문 버전 : 조건검사가 6번
			
			/*
			while(i <=5) {
				System.out.print(i + " ");
				i++;
			}*/
			// do-while문 버전 
			
			do{
				System.out.print(i + " ");
				i++;
			}while(i <=5);
		
		}//method 8 영역 끝
		
	
}
