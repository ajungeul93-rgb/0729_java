package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	// ��������� -> ���⿬����, �켱������ ��������å�̶� �Ȱ���
	// + : ����
	// - : ����
	// * : ����
	// / : ������
	// % : ��ⷯ(Modular) => ������������ �������� ����
	
	public void method() {
		
		int num1 = 10;
		int num2 = 3;
		
		//System.out.println("num1 : " + num1);
		//System.out.println("num2 : " + num2);
		
		// test();
		
		System.out.println("num1 + num2 : " + num1 + num2 ); // 103
		//System.out.println("num1 + num2 : " + (num1 + num2) ); //13
		                  // 1�ܰ� "num1 + num2 : 10"
		                  // 2�ܰ� "num1 + num2 : 103"
		// ������� "num1 + num2 : 103"
		// ���� �켱������ �����ϰ�ʹٸ� ()�� �̿��ؼ� �����־���� �ǵ��� �����
		// ����� �� ����
		
		int sum = num1 + num2;
		System.out.println("�� ���� �հ� : " + sum);
		System.out.printf("num1 + num2 : %d\n" , num1 + num2 );
		
		//System.out.println("num1 - num2 : " + num1 - num2);
		System.out.println("num1 - num2 : " + (num1 - num2));
		                   // 1�ܰ� : "num1 - num2 : 10"
		// ������ ��� ��ȣ�� �������� ������
		// ���ڿ��� num1�� �ϳ��� ��ģ �� ������ ���� ������ ������ �Ұ�����!
		
		System.out.println("num1 X num2 : " + num1 * num2);
		//System.out.println("num1 X num2 : " + (num1 * num2));
		
		// *, /, % �� ģ������ �켱������ +, -���� ���� ������ �������� �ʴ���
		// ���� ������ �����ؼ� ����� ���� �� ����
		// ������ ����� ���� ��ȣ�� ����ϴ� ���� ����
		System.out.println("num1 �� num2 : " + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));
		
		// �����ؾ��� �κ�
		
		
	}
	
	
	public void test() {
		System.out.println("�� ���θ޼��忡�� ȣ���ؾ��ϴ� ���� �ƴ�!");
	}
	
	
	// ���� ���� ���ϱ� ���α׷��� �����Ͻÿ�.
	
	// �޼ҵ� : presentToStudent() <== �޼ҵ� ����
	
	// ����ڿ��� ���� �Է¹ޱ�.        <== Scanner
	// 1. ������ �л��� ��
	// 2. ���� ����
	
	// 1�δ� ���� �� �ִ� ������ ���� : ���� ���� / �л��� ��
	// ���� ������ ���� : ���� ���� % �л��� ��             <== ���������
	
	// �������
	// �л� �� ��� ���� �� �ִ� ������ ���� : X            <== ��¹�
	// ���� ���� ���� : X��                            <== ��¹�
	
	public void presentToStudent() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.�� ���� �л����� ���� �ֽðڽ��ϱ�?=" );
		
		int student = sc.nextInt(); 
		
		System.out.println("�л� �� : " + student);
		System.out.print("2.���������� �Է��ϼ���.");
		
		int candy = sc.nextInt();
		
		System.out.println("���� �� ���� : " + candy);
		System.out.println("1�δ� ���� ����" + (candy / student));
		System.out.println("���� ������ ����" + (candy % student));
		
		
		
		
	}
	
	

}
