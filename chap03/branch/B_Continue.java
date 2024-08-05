package com.kh.chap3.branch;

// continue문
public class B_Continue {
	
	/*
	 * * continue문
	 * 반복문 안에서 사용하는 보조문
	 * continue; 를 만나게 되면 그 뒤에 어떤 구문이 있든 간에
	 * 실행하지 않고 해당 반복문의 증감식 또는 조건식으로 바로
	 * 올라가주는 역할을 해줌
	 * 
	 * [ 표현법 ]
	 * for / while (){
	 * 
	 * 
	 * 		반복적으로 실행할코드1;
	 * 		continue; // 밑의 코드들은 무시하고 다음 증감식 또는 조건식으로 올라감
	 * 		반복적으로 실행할코드2;
	 * 		...
	 * 		
	 * 		
	 * }
	 * > for문의 경우 증감식으로, while문의 경우 조건식으로 올라감
	 * 
	 */
	
	public void method1() {
		
		// 1부터 10까지의 정수 중 "홀수" 만을 출력
		
		// 방법1) i 값을 1에서부터 2씩 증가하는 방법(홀수만 담기게끔)
		// 방법2) 반복을 1 ~ 10 까지 매번 돌리면서
		//       조건검사로 "홀수" 인 경우에만 출력문을 실행하는 방법
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 ==1) {
				System.out.print(i + " ");
			}
		}
		
		// > continue문이 없어도 충분히 풀 수 있는 문제 였음!!
		System.out.println(); //줄바꿈
		// 방법3) continue문을 이용하는 방법도 있음
		// 이 방법 또한 반복을 10회 진행해야 함
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0 ) {//짝수일 경우
				continue;// 아래에 코드는 무시하고 바로 다음 증감식으로 향하겠다.
			}
						
			System.out.print(i + " ");
		}
	}// method1 메소드 영역 끝
	public void method2() {
		
		// 1 부터 100 까지의 정수의 총 합계 구하기
		// 단, 6의 배수값은 빼고 더해보자
		
		// 총 합계를 담아둘 변수
		
		int sum = 0;
		
		// > 규칙 : 시작수 1, 끝수 100 포함, 1씩 증가
		// 단, 6의 배수만 건너 뛰고 (6, 12, 18, 24, 30, 36,....)
		// 방법1) continue문을 안쓰는 방법
		// > 6의 배수가 아닐경우에만 덧셈하겟다
		
		/*for(int i = 1; i <= 100; i++) {
			
			if(i % 6 != 0) { // 6의 배수가 "아닐경우"
				sum += i; //sum = sum + i;
				
				
			}
		}*/
		//방법 2) continue문을 사용하는 방법
		// > 6의 배수일 경우에만 덧셈을 하지 않겠다.
	for(int i = 1; i<= 100; i++) {
		if(i % 6 == 0) {//6의 배수일 경우
			continue;
		}
		sum += i;
		
	}
	System.out.println("총 합계 : "+ sum);
	}// metohd2 메소드 영역 끝
	
	public void method3() {
		// 2~9 단 모두 출력하되,
		// 단, 4단의 배수단은 제외하고 출력 (4단, 8단 뺴고 출력)
		
		// 방법 1) continue문이 없는 버전
		for(int i = 2; i <= 9; i++) {
			
			// 해당 단수를 출력하기 전에
			// 4의 배수단이 "아닌지" 먼저 검사
			
		if(i%4 != 0) {//4의 배수가 아닐경우
				
			System.out.printf("--- %d단 ---\n", i);

			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, (i * j));
				}
			}
		}
		
		// 방법 2) continue문이 있음 버전
		for(int i = 2; i <= 9; i++) {
			//단수를 출력하기 전에
			// 4의 배수단인지 먼저 판별해보기
			if(i%4 == 0) {// 4의 배수일 경우
				continue;
			}
			
			System.out.printf("---%d단----\n",i);
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n",i,j,(i * j));
			}
		}
	}
	// > 상황에 따라 continue문을 반드시 사용할 필요는 없다!!
	
}
