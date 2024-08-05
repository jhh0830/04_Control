package com.kh.chap01.condition;

import java.util.Scanner;

// switch��
public class C_Switch {
	/*
	 * 
	 * * switch��
	 * if�� �迭�� ����� "���ǽ�" �� ���� ����Ͽ� �������� �帧��
	 * ����� ���� ���ǹ��̿��ٸ�,
	 * ���� "���ǽ�" �� ������� �ʰ� �������� �帧�� ����� �� ��
	 * �ִ� ���ǹ���
	 * (���������� ���� ������ ���� ����񱳸� ����)
	 * 
	 * 
	 * * switch���� if�� �迭�� ������
	 * if(���ǽ�) : ���ǽ� �����ϰԵ� ��� ����, ���� ���� ����
	 * switch : ���ǽ��� �������� ����, ���������� ���ǰ˻簡 �Ͼ
	 * 				(Ȯ���� ���� ����, �� "�����"�� �Ͼ�� ����)
	 * 
	 * [ ǥ���� ]
	 * switch(����񱳸��Ҵ����){
	 * case ��1 :
	 *  	�������ڵ�1;
	 *  	break;
	 *  case ��2:
	 *  	�������ڵ�2;
	 *  	break;
	 * ...
	 * 
	 * case ��n : 
	 * 		�������ڵ�n;
	 * 		break;
	 * 	default : 
	 * 		�������ڵ�; 
	 * 			���� ��1 ~ ��n ���� ��ġ�ϴ� ���� ã�� ������ ���
	 * 			default ������ ����� (else �� ���Ұ� ����)
	 * 			break;
	 * 			> default : ������ switch ���� ������ �κ��̱⶧����
	 * 				���� break;�� ���� �ʴ´�.
	 * 
	 * 
	 * }	
	 * 
	 */
	public void method1() {// method 1 ���� ����
		// 1 ~ 3 ������ �������� �Է¹޾�
		// 1�� ��� "�������Դϴ�" ���
		// 2�� ��� "�Ķ����Դϴ�" ���
		// 3�� ��� "�ʷϺ��Դϴ�" ���
		// �߸� �Է��� ��� "�߸� �Է��߽��ϴ�." ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 ������ ���� �Է� : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		/*
		 *
		 * if(num == 1) {// 1�� �Է��Ѱ�� System.out.println("�������Դϴ�."); } else if(num == 2)
		 * 
		 * {// 2�� �Է��Ѱ�� System.out.println("�Ķ����Դϴ�."); } else if(num == 3) {// 3�� �Է��Ѱ��
		 * 
		 * System.out.println("�ʷϺ��Դϴ�."); } else {// 1,2,3 �� �ƴҰ��
		 * 
		 * System.out.println("�߸� �Է��߽��ϴ�."); }
		 */
		
		
		/*
		 * switch (num) { 
		 * case 1: // num == 1 
		 * System.out.println("�������Դϴ�."); 
		 * break; case 2:
		 *  // num == 2 
		 *  System.out.println("�Ķ����Դϴ�."); break; 
		 *  case 3: // num == 3
		 * System.out.println("�ʷϺ��Դϴ�."); break;
		 * 
		 * default: System.out.println("�߸� �Է��߽��ϴ�."); break; }
		 */
		// �Ǻ������ ��Ƶ� ���� ���� ����
		String result = "";// String Ÿ���� �⺻������ �� ���ڿ��� ������
		
		
		
		
		switch(num){
			case 1 : 
				result = "������";
				break;
			case 2 : 
				result = "�Ķ���";
				break;
			case 3 : 
				result = "�ʷϺ�";
				break;
				
			default :
				System.out.println("�߸� �Է��߽��ϴ�."); 
				return;
				// > return���� ���� �������� �� �޼ҵ� ��ü�� ���������� ����
				// �� �޼ҵ带 ȣ���ߴ� ���ʸ����� �帧�� ���ư��� ������
		}
		
		// �� �������� �Ǻ� ����� ������ �� �ѹ� ��¹��� �ۼ�
		System.out.println(result +" �Դϴ�.");
	} // method 1 ���� ��
	public void method2() {// method2 �޼ҵ� ���� ����
		// ����ڿ��� ������ ���ϸ��� �Է¹޾�
		// �� ���ϸ����� ������ ���
		// > ��� (1000��), �ٳ���(2000��), ������ (5000��)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- Welcome ���ϰ��� -----");
		System.out.print("������ ����(���, �ٳ���, ������) �Է� : ");
		String fruit = sc.nextLine();
		
		/*
		 * // if �� �迭 ���� if(fruit.equals("���")) { // "���" �� �Է��� ���
		 * System.out.println("1000���Դϴ�.");
		 * 
		 * 
		 * }else if(fruit.equals("�ٳ���")){// "�ٳ���" �� �Է��� ���
		 * System.out.println("2000���Դϴ�.");
		 * 
		 * }else if(fruit.equals("������")) {// "������" �� �Է��� ���
		 * System.out.println("5000���Դϴ�.");
		 * 
		 * } else { // �� �̿��� ������ �Է��� ��� System.out.println("���� ���Կ��� �Ǹ��ϴ� ������ �ƴմϴ�."); }
		 */
		//���ڿ��� ��� "�����ڷ���" �̱� ������
		// == ���� ����񱳸� �� ��� ���ڿ��� ������ �ƴ�
		// "�ּҰ�" �������� ����񱳰� �Ͼ�� �ȴ�.
		// > ���ڿ��� "���빰" �� �������� ����񱳸� ���ִ� ����
		// .equals �޼ҵ带 �̿��ؾ� �ذ� �����ϴ�.
		// [ ǥ���� ]
		// ���ڿ�.equals("������ϰ����ϴ¹��ڿ�")
		// > ���ڿ� ���빰�� ��ġ�Ѵٸ� true / ��ġ���� ������ false
		
		// switch�� ����
		switch(fruit) {
		case "���":
			System.out.println("1000���Դϴ�.");
			break;
		case "�ٳ���":
			System.out.println("2000���Դϴ�.");
			break;
		case "������":
			System.out.println("5000���Դϴ�.");
			break;
		default :
			 System.out.println("���� ���Կ��� �Ǹ��ϴ� ������ �ƴմϴ�.");
			return;
			
		}
		// > switch���� ���ڿ��� ����� ����ڷ� �������� ���
		//   ���������� ���ڿ��� ���빰�� ������ �˾Ƽ� ����񱳸� ����
		// Ư�����̽� - break�� �����ϴ� ���
	}// method2 �޼ҵ� ���� ��
	public void method3() { // method3 �޼ҵ� ���� ����
		
		// ����ڷκ��� Ű����ε���� �Է¹ޱ�
		// �ش� ��޺��� ������ ����ϱ�
		// 1��� : ��������, �������, �б����
		// 2��� : �������, �б����
		// 3��� : �б����
		Scanner sc = new Scanner(System.in);

		System.out.print("����� �Է��ϼ��� : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		switch(grade) {
		case 1 : // grade == 1
			System.out.println("�������� �ο�");
			//System.out.println("�б���� �ο�");
			//System.out.println("������� �ο�");
			//break;
			
		case 2 : // grade == 2
			//System.out.println("�б���� �ο�");
			System.out.println("������� �ο�");
			//break;
		case 3 : // grade == 3
			System.out.println("�б���� �ο�");
			
		}
		// > switch������ break�� �����ϴ� ����
		// ���� break; �� ������ ������ �Ǵ� switch����
		// ������ ���� ��� �Ʒ��� �ڵ尡 ����ȴ�.
		
	}// method3 �޼ҵ� ���� ��
	
	public void method4() {// method4 �޼ҵ� ����
		// �޴��� ����غ���, �޴� ��ȣ�� �Է��ϸ� "xx�޴��Դϴ�."���
		// ���ᰪ�� �Է����� "���α׷��� ����˴ϴ�." ���
		
		System.out.println("1. �Է�"); 
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		// ����ڰ� ��� �޴� ��ȣ�� �Է��ߴ��� �Ǻ� �Ŀ�
		// �˸��� �޴� ������ ����ؾ���
		/*
		switch(menu) {
		case 1: // menu == 1
			System.out.println("�Է� �޴��Դϴ�.");
			break;

		case 2: // menu == 2
			System.out.println("���� �޴��Դϴ�.");
			break;

		case 3: // menu == 3
			System.out.println("��ȸ �޴��Դϴ�.");
			break;

		case 4: // menu == 4
			System.out.println("���� �޴��Դϴ�.");
			break;

		case 9: // menu == 9
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		default: //�� �̿��� menu ��ȣ�� �Է��� ���
			System.out.println("�߸� �Է� �ϼ˽��ϴ�.");
			//break; ���� �Ƚᵵ ���������� �����̶� ������ �Ⱦ�����~
		}*/
		// ���� ������ �������ϰ� ��¹��� �����ϰ� ����
		// > ����� ���� ���� ���� �͵��� Ȱ���ϸ� �ڵ� ���̱� ����
		
		//����� ���� ���� ���� ����
		
		String result = "";
		
		switch (menu) {
		case 1:
			result = "�Է�";
			break;
		case 2:
			result = "����";
			break;

		case 3:
			result = "��ȸ";
			break;

		case 4:
			result = "����";
			break;

		case 9:
			System.out.println("���α׷��� ����˴ϴ�.");
			return;

			
		default:
			System.out.println("�߸� �Է� �ϼ˽��ϴ�.");
			return;
			
		}
		// �� ���� �������� result ��������
		// �Ǻ� ����� �� �������
		System.out.println(result + "�޴��Դϴ�.");
	}// method4 �޼ҵ� ��
	public void method5() {
		// ���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ�
		// �α��� ���� �� "�α��� ����"
		// ���̵� Ʋ���� ��� "���̵� Ʋ�Ƚ��ϴ�."
		// ��й�ȣ�� Ʋ���� ��� "��й�ȣ�� Ʋ�Ƚ��ϴ�." ���
		
		// ���̵� : gahyun
		// ��й�ȣ : 1234
		
		//1. �켱 ���̵�� ��й�ȣ�� ����ڷκ��� �Է¹޾ƾ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String userId = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String userPwd = sc.nextLine();
		
		// ���ǹ� (if�� �迭) �� ����
		// ����ڰ� ����� �� ���̵�� ��й�ȣ�� �Է��ߴ��� �Ǻ�
		
		if(userId.equals("gahyun") && userPwd.equals("1234")) {
			// ù��° ����� �� : ���̵�� ��й�ȣ�� ��� ��ġ�Ұ��
			// >�α��ο� ������ ���
		
			System.out.println("�α��� ����");
			
			
		} else {
			// �ι�° ����� �� : ���̵�� ��й�ȣ ���߿� �ϳ���
			// 					�ٸ����
			// > �α��ο� �����Ұ��
			if(!userId.equals("gahyun")) {
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			}
			// ��й�ȣ�� Ʋ�����
			if(!userPwd.equals("1234")) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
			
		}
		
	}
	
}
