package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * ���� ������ : �� �����ڰ� 3�� => �� 3���� 1���� �����ڷ� �̷����(������ �������� ����)
	 * 
	 * ���ǹ� : ���� ���� ������ ó���ϴ� ���
	 *        ������� true�� ��� ù ��° ������ ó��~
	 *        ������� false�� ��� �� ��° ������ ó��~
	 *        
	 * [ ǥ���� ]
	 * ���ǽ� ? ���ǽ��� true�� ��� ����� : ���ǽ��� false�� ��� �����       
	 */
	
	
	// �����ķ��̽�
	public void method1() {
		System.out.println("���� �޴��� : " );
		System.out.println("1. �� ��� ���� �޷� ������ġ��");
		System.out.println("2. �ڸ� ���� ���� ����Ǫġ��");
		System.out.println("3. ī�� ����� ����Ǫġ��");
		
		// Ctrl + Shift + o
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�޴� ��ȣ�� �Է����ּ��� >");
		int menuNo = sc.nextInt();
		
		String selectedMenu = (menuNo == 1) ? "�� ��� ���� ��� ����Ǫġ�븦 �߹��ϼ̽��ϴ�."
				            : (menuNo == 2) ? "�ڸ� ���� ���� ����Ǫġ�븦 �ֹ��ϼ̽��ϴ�."
				            : (menuNo == 3) ? "ī�� ����� ����Ǫġ�븦 �ֹ��ϼ̽��ϴ�."
				            : "���� �޴��� �ֹ��ϼ̽��ϴ�.";		
		
		// ���ǽ� ? ���ǽ��� true�� ��� ��� �� : ���ǽ��� false�� ��� ��� ��
		
		// ������ ��ȣ�� ���� �޴����� ���
		// 1�� �Է� �� == "�� ��� ���� ��� ����Ǫġ�븦 �ֹ��ϼ̽��ϴ�."
		
		System.out.println(selectedMenu);
		
	}
	//Ȧ¦ ���ϱ�
	public void method2() {
		
		// ����ڿ��� ���� ���� �ϳ� �Է¹޾Ƽ�
		// �Է¹��� ������ Ȧ / ¦ �Ǻ��ؼ� ���
		
		// �Էµ��� ��Ī ����
		Scanner sc = new Scanner(System.in);
		
		// �ʿ��� ���� �Է¹��� �� �ֵ��� �޼��� ���
		System.out.print("���ڸ� �Է����ּ��� > ");
		
		// ������ ������ ������ �� ��ĳ���� �޼ҵ带 ȣ���ؼ� �Է� ���ۿ� �ִ� �������� �޾ƿͼ�
		// ������ ���� ������ �ʱ�ȭ
		int num = sc.nextInt();
		//System.out.println("������ ���� > " + num);
		
		// num % 2 != 0
		// num % 2 == 1
		// ((num % 2) == 0) ==> ����(�Ǻ�)�� ��ɷ��ϱ�� ����
		char oddEven = ((num % 2 == 0)) ? '¦' : 'Ȧ';
		
		System.out.println("�Է��Ͻ� " + num + "��(��)" + oddEven + "�� �Դϴ�.");
		
	}
	
	public void think()  {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ĺ� �� ���ڸ� �Է����ּ��� >");
		// ����ڿ��� ���ĺ� �� ���ڸ� �Է¹޾Ƽ�
		char ch = sc.nextLine().charAt(0);
		
		//ch == 'a' ~~ 'z' || 'A' ~~ 'Z'
		//'a' <= ch <= 'z' == "�ҹ���"
		
		char alpa = (('a' <= ch) && (ch <= 'z')) ? '��' : '��';
		
		// �Է¹��� ���ĺ��� �ҹ������� / �빮������ �Ǻ� �� ������ּ���.
				
		System.out.println(ch + "��(��)" + alpa + "���� �Դϴ�.");	
		
		
		// �������
		// XXX(����ڰ� �Է��� ���ĺ�)��(��) �ҹ��� / �빮�� �Դϴ�.
	}

}


      
      
