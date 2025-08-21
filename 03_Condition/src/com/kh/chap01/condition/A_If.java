package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * (����) if��
	 * 
	 * [ ǥ���� ]
	 * 
	 * if(���ǽ�) {
	 * 
	 *     ���ǽ��� true�� ��� �����ϰ��� �ϴ� �ڵ�;
	 *     
	 *     
	 * }    
	 * 
	 * => ���ǽ��� ����� true�� ��� : if�� Scope({})���� �ڵ尡 ����
	 * => ���ǽ��� ����� false�� ��� : if�� Scope({})�� �ǳʶ�!
	 */
	
	public void method1() {
		
		//System.out.println("����ùθ´�~");
		
		if(0 < 1) {
			System.out.println("0�� 1���� �۾ƿ�");
		}
		
		// if���� ���ǽ��ڸ����� ��������� true �ƴϸ� false���� ������ ��������!
		
		if(false) {
			System.out.println("��� �׾�� ������ �ȳ���");
		}
		
		if(true) {
			System.out.println("���ǽ� �ڸ����� ���������� true�� �;���");
		}
		
		
	}
	public void method2() {
		
		boolean loginCheck = false; //�α��� ���¸� �����ص� ����
		
		if(!loginCheck) {
			System.out.println("���̹��� �� �����ϰ� ���ϰ� �̿��غ�����.");
			System.out.println("NAVER �α���");
			System.out.println("���̵� ã�� | ��й�ȣ ã�� | ȸ������");
		}
	
	  if(loginCheck) {
		  System.out.println("ȫ�浿�� ȯ���մϴ� :)");
		  System.out.println("���� | ī�� | ��α� | ���� | ����");
	  }
	}
	
	public void lunchMenu() {
		
		// ������ ������ �Է¹޾Ƽ�
		Scanner sc = new Scanner(System.in);
		
		// ���� / ���� / ���
		System.out.print("������ ������ �����(���� / ���� / ���) > ");
		String weather = sc.nextLine();
		//System.out.println(weather);
		// ���� �޴��� ��õ���ִ� ���α׷�
		// ����� �Է��ߴٸ� ���õ���� ���������
		
		// ����ڰ� �Է��� ���� "���"�̶�� ���ڿ����� ������ؼ� ��ġ�ϴ��� ��
		// weather ����� "���"
		//System.out.println(weather == "���");
		// ���ڿ��� ��
		// ����񱳿�����(==)�� ����� �� ����
		// .equals()�� ȣ���ؾ���
		//System.out.println(weather.equals("���"));
		
		// ����
		// ���࿡ ����ڰ� �Է��� ���ڿ�   �� "���"��    ��ġ�ϴٸ�
		// if      weather           "���"     .equals()
		// = ���õ��
		
		if(weather.equals("���")) {
			System.out.println("���õ������ ��������ĵ弼��~");
		}
		
		// ���࿡ ����ڰ� �Է��� ���ڿ��� "����"�� ��ġ�ϴٸ�
		if(weather.equals("����")) {
			System.out.println("����Ϲ������� �ø�� �弼��~");
		}
		
		if(weather.equals("����")) {
			System.out.println("subway���� ��Ż���� ��Ƽ �弼��~");
		}
		
	}
	
	public void method3() {
		
		// ����ڿ��� �������� �Է¹޾Ƽ� Ȧ / ¦�� �Ǻ� => ���
		// if���� �̿��ؼ� ���!
		// ��, �Է¹��� ������ 0���� Ŭ��쿡�� ���ǹ��� ����!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0���� ū �����ּ��� > ");
		int number = sc.nextInt();
		//System.out.println(number);
		
		//if
		
		// ���ǽ�
		//
		// �񱳿���
		// 1. �Է¹��� ������ 0���� Ŭ��쿡��
		//     number > 0
		
		// 2. Ȧ/¦
		//    �Է¹��� ������ 2�� ���� �������� 0�� ������ؼ�
		//    number %   2      ==     0 ¦��(true �� ��)
		//   !number %   2      ==     0 Ȧ��(true �� ��)
		
		boolean flag = number > 0;
		
		if(flag && number % 2 ==0){ System.out.println("¦��");}
		if(flag && number % 2 !=0) System.out.println("Ȧ��");
		
		//if(number % 2 == 0 && number > 0 ) { System.out.println("¦��");}
		//if(number % 2 != 0 && number > 0 ) System.out.println("Ȧ��");
		
		// if�� ��ø
		if(number > 0) {
			if(number % 2 == 0) System.out.println("¦��");
		    if(number % 2 == 1) System.out.println("Ȧ��");
		}
		
	}
	
	// ���� �ķ��̽�
	public void method4() {
		
		// 1. �޴��� �����ֱ�
		// ��¹� == System.out.println()
		System.out.println("���� �޴���");
		System.out.println("1.���� : 5000");
		System.out.println("2.���� : 3000");
		System.out.print("�޴��� �������ּ��� > ");
		
		// 2. �޴���ȣ�� �޴� �Է¹ޱ�
		// Scanner ����ؼ� nextInt()
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		System.out.println("������ �޴� ��ȣ : " + menuNo);
		
		// 3. ���� �Է¹ޱ�
		// Scanner ����ؼ� nextInt()
		System.out.print("�� �� �ֹ��Ͻǰǰ��� > ");
		int cup = sc.nextInt();
		//System.out.print("�Է��� �� ���� : " + cup);
		
		// 4. ���ǹ�
		// if���� �̿��ؼ� �Է��� �޴���ȣ�� ���� �޴��� �����ϱ�
		// Ȥ�� ���� �޴� ��ȣ�� �Է��ߴٸ� ���� �޴���� �����ϱ�
		// ���࿡ ����ڰ� �Է��� �޴���ȣ�� 1���̶��
		//  if          menuNo == 1
		String menuName = "";
		if(menuNo == 1) menuName = "����";
		if(menuNo == 2) menuName = "����";
		if(!(menuNo ==1) && !(menuNo == 2)) System.out.println("���¸޴��Դϴ�.");
		
		
		
		// 5. xx�޴��� xx�� �ֹ��ϼ̽��ϴ�. ������ֱ� print()
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(menuName + "��(��)" + cup + "�� �ֹ��ϼ̽��ϴ�.");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		// 6. ��¥ �ֹ��Ұ��� �����
		// Y / N �Է¹޾Ƽ� Ȯ���ϱ�
		System.out.print("\n�� �ֹ��������� �ֹ��Ͻðڽ��ϱ� (Y / N) > ");
		sc.nextLine();
		char answer = sc.nextLine().charAt(0);
				
		// 7. 6������ �Է¹��� ���� ���ڰ� 'Y'�Ǵ� 'y'�� ��ġ�ϴٸ�
		// �޴���� ������ ���� ����ϱ� if�� + ��ø if�� + ��¹�
		if(answer == 'Y' || answer == 'y') {
			int price = 0;
			if(menuNo == 1) price = 5000;
			if(menuNo == 2) price = 3000;
			System.out.println("�� ���� �ݾ��� " + (price * cup) + "�� �Դϴ�.");
			
			
		}
	}

}

