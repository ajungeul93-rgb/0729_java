package com.kh.variable;

// 1��. import���� �ۼ��ؼ� � ��Ű���� �����ϴ� Ŭ������ ����� ������ ����!
import java.util.Scanner;


public class B_keyboardInput {
	/*
	 * Ű���带 �̿��ؼ� ����ڿ��� ���� �Է¹��� ����
	 * �ڹٿ��� �������ִ� Scanner��� Ŭ������ ����սô�!
	 * Scanner Ŭ������ �����ϰ� �ִ� �޼ҵ���� ȣ���ؼ� �Է��� ���� �� ����
	 * 
	 */
	
	
	public void inputTest() {
	
	    // 2��. Ŭ������ ��Ī�� �����ָ鼭 new(����?)�� ����!
		Scanner sc = new Scanner(System.in);
		// System.in : ǥ�� �Է� �������� �Է¹��� ������ �ްڴ�.(����Ʈ ����)
		
		// �����ķ��̽�
		// ����ڿ��� �ֹ��� ���Ḧ �Է¹޾Ƽ� ����غ���~
		
		// �Է¹ް��� �ϴ� ������ �˷��ְų� ���� �������ؼ� �Է��� ����
		System.out.println("�ȳ��ϼ���. �����ķ��̽� �Դϴ�.");
		System.out.println("===========�޴���===========");
		System.out.println("1. �ѱ��� ���������� ����ÿ");
		System.out.println("2. KH���������� A�����忡�� ���� �����");
		System.out.println("3. ��");
		System.out.println("--------------------------");
		System.out.print("�ֹ��Ͻ� �޴��� �������ּ���.=");
		
		//next() : ����ڰ� �Է��� �� �� ������ ���� ��� ���鹮�� ���������� �Է¹���
		String menu = sc.next();
		
		// ����ڰ� �Է��� �޴��� ������ֱ�
		// "���� �ֹ��ϼ̽��ϴ�."
		
		System.out.println(menu + "��(��) �ֹ��ϼ̽��ϴ�.");
		
		// �� �� �̿�?
		System.out.print("�� �� �ֹ��Ͻðڽ��ϱ�?(���ڷ� �Է����ּ���) = ");
		// nextInt()
		// nextDouble()
		// ���� ��� �����?
		// Ÿ�� ������
		int number = sc.nextInt();
		System.out.println(menu + "��(��) " + number + "�� �ֹ��ϼ̽��ϴ�.");
		
		System.out.print("�ּ����� �Է����ּ��� =");
		// nextLine() : ����ڰ� �Է��� ���� ����� �����ϰ�
		//              ���๮�� �������� ��ü�� �� �о��
		// nextLine() : �Է¹��ۿ��� ���๮�� ���������� ��� ���� ������ ��
		//              �Է¹��ۿ� �����ϴ� "���๮��"�� ������
		
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println(menu + " " + number + " ���� " + address + "(��)�� ����մϴ�.");
		
		
		
	
	}
	

}
