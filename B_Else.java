package com.kh.chap01.condition;

import java.util.Scanner;

// if-else��, if-else if��
public class B_Else {
	
	/*
	 * * if-else��
	 * �ѹ��� �� ���� ����� ���� ��Ÿ�� �� �ִ� ���ù�
	 * 
	 * 
	 * [ ǥ���� ]
	 * if (���ǽ�){
	 * 
	 * 		���ǽ� ����� true �� ��� ������ ����;
	 * } else {
	 * 
	 *  	���ǽ� ����� false �� ��� ������ ����;
	 * }
	 * > ���ǽ��� ����� true �� ��� 
	 * if ��({ ���� }) ���� �ڵ尡 ����� �� if-else�� ��ü�� ��������
	 * > ���ǽ��� ����� false �� ���
	 * 	else �� ({ ���� }) ���� �ڵ尡 ����� �� ��������
	 * 
	 *
	 */
	
	// �ܵ� if�� --> if-else��
	
	public void method1() {//metohd1 �޼ҵ� ���� ����
		
		// ����ڿ��� �������� �Է¹��� ��
		// ¦������ Ȧ�� ���� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		// if-else�� ����
		
		// ù��° ����� �� : ¦���� ���
		/*if(num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
			
		} else {
			// �ι�° ����� �� : ¦���� �ƴҰ��
			
			System.out.println("Ȧ���Դϴ�.");
		}*/
		
		// ���� �ڵ带 �����ؼ�
		// ����̸鼭 ¦���ΰ��, ����̸鼭 Ȧ���ϰ�츦 �Ǻ�
		// > ��ø if�� �̿�
		
		
		// �켱 ������� ���� �Ǻ�
		if(num > 0) {
			//num �� ����� ��쿡��
			// �� �ȿ��� ¦������ Ȧ������ �Ǻ��ϱ�
			if(num%2 ==0) {
				//ù��° ����� �� : ¦���ϰ��
				System.out.println("����̸鼭 ¦���Դϴ�.");
			} else {
				// �ι�° ����� �� : ¦���� �ƴҰ��
				System.out.println("����̸鼭 Ȧ���Դϴ�.");
			}
		}// if �� ��
		else if(num < 0){
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("0 �Դϴ�.");
		}
		
		
	}//metohd1 �޼ҵ� ���� ��
	
	/*
	 * * if-else if��
	 * �ѹ��� ���� �̻��� ����� ���� ��Ÿ���� ���� �� ���� ���ù�
	 * 
	 * 
	 * [ ǥ���� ]
	 * if(���ǽ�1) {
	 * 
	 * 		���ǽ�1 �� true �� ��� ������ �ڵ�;
	 * 		
	 * } else if(���ǽ�2){
	 * 
	 * 		���ǽ�2 �� true �� ��� ������ �ڵ�;
	 * } else if(���ǽ�3) {
	 * 
	 * ...
	 * } else{
	 * 
	 *   �տ� ������ ���ǵ��� ��� false �� ���
	 *   ������ �ڵ�;
	 * }
	 *  
	 */
	
	public void method2() {// mthod2 �޼ҵ� ���� ����
		
		// ����ڷκ��� ������ �Է¹޾�
		// �������, 0����, �������� �Ǻ� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		// if-else if�� ����
		
		if(num > 0) {// ����� ���
			System.out.println("����Դϴ�.");
			
		} else if(num == 0) {// 0�� ���
			System.out.println("0 �Դϴ�.");
		} else{// ����� �ƴϰ� 0�� �ƴҰ��
			System.out.println("�����Դϴ�.");
		}
		
		
	} // mthod2 �޼ҵ� ���� ��
	
	public void method3() {// method3() ���� ����
		
		// ���̸� �Է¹��� ��
		// �������, û�ҳ�����, ���������� �Ǻ� �� ��� ���
		
		// ��� : 13�� ����
		// û�ҳ� : 13�� �ʰ� ~ 19�� ����
		// ���� : 19�� �ʰ�
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		if(age < 13) {
			System.out.println("����Դϴ�.");
	
		} else if( 13 <= age && age <= 19 ) {
			//> ���� if ���� �ǳʶٰ� �̽������� �Դٶ�°���
			// age �� 13 �ʰ��ϴ� �����!!
			System.out.println("û�ҳ� �Դϴ�.");
		} else if(age > 19){
			System.out.println("�����Դϴ�.");
		
		
		} else if (age < 0 ) {
			System.out.println("�����Դϴ�.");
			
		}
		
	} // method 3 �޼ҵ� ���� ��
	public void method4() {
		
		// ����ڿ��� ������ �Է¹��� ��
		// 90�� �̻��� ��� "A���"
		// 80�� �̻��� ��� "B���"
		// 70�� �̻��� ��� "C���"
		// 70�� �̸��� ��� "D���"
		// "����� ������ XX���̰�, ����� X����Դϴ�." ���
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		sc.nextLine();
		
		
		
		// ������ 0��~100��
		// ����� �Ǻ��ϱ� ���� ����ε� �������� ���� �˻��ϱ�
		if((0 <= score) && (score<= 100)) {
			//����� �� ������ ���
			//�������� �Ǻ� �� �Ǻ��� ����� ��Ƶ� ���� ����
			char grade = ' '; //  char Ÿ���� ��� �Ϲ������� �������� �ʱ�ȭ
			
			//String str = ""; // ���ڿ��ε� ���빰�� ���� ���ڿ� (���ڿ�)
		
			// > �������� (local variable)
			// �� grade ��� ������ �� if �� ���ʿ����� ��� ����
			// �ַ� ���� ������ �ʱ�ȭ �Ŀ� ����ϴ°� ����
			if(score >= 90) {// A ���
				grade = 'A';
			}else if(score >= 80) {// B ���
				grade = 'B';
				
			}else if(score >= 70) {// C ���
				grade = 'C';
				
			}else {// D ���
				grade = 'D';
			}
			// �� ���� ��������
			// �� ��޿� ���� �Ǻ��� ���� ����
			// �ش� ����� ����ϴ� ������ �� �ѹ��� �ۼ��Ұ�!!
			System.out.printf("����� ������ %d���̰�, ����� %c��� �Դϴ�.\n",score,grade);
			
		}else {
			// ����� ������ �ƴҰ��
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		
		
		
		
	}
}
