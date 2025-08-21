package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	/*
	 * ���α׷� ���� �� �߻��ϴ� ���ܵ�
	 * RuntimeException
	 * 
	 * - NullPointerException : �ּҰ� ��ü�� �����ߴ��� null���� ������� ��� �߻��ϴ� ����
	 * - ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� �������� �� �߻��ϴ� ����
	 * - ClassCastException: ����� �� ���� ����ȯ�� ������ ��� �߻��ϴ� ����
	 * - ArithmeticException : ������ ������ 0���� ������ �߻��ϴ� ����
	 * - NegativeArraySizeException : �迭�� �Ҵ��� �� ũ�⸦ ������ �����ϸ� �߻��ϴ� ����
	 * ...............
	 * 
	 * RuntimeException�� ���õ� ���ܵ��� �������� ����
	 * �����ڰ� ������ ������
	 */
	
	// ArithmeticException
	public void method1() {
		// ����ڿ��� �� ���� �������� �Է¹޾Ƽ� �������� �� �� ����� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է����ּ���> ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է����ּ���> ");
		int num2 = sc.nextInt();
		
		// ��� 1. ���ܹ߻� ��ü�� ��õ �����ع���
		/*
		 if(num2 != 0) {
		System.out.println("���� ��� : " + (num1 / num2));
		} else {
			System.out.println("�� ȥ�ٳ� ����;�?");
		}
		*/
		// ��� 2. ����ó���� ����
		// ����ó�� : 
		// ���� ��Ȳ�� �����ϰ� ���ܻ�Ȳ �߻� �� 
		// ���α׷��� ���������� ���ᰡ �Ǵ°��� �����ϰ� ������ ���� ���븦 ���ϴ� ��
		
		/*
		 * try ~ catch��
		 * 
		 * [ ǥ���� ]
		 * 
		 * try {
		 * 
		 *    (num1 / num2) // ���ܰ� �߻��Ҽ��� �ִ� ����
		 *    
		 * } catch(�߻��ҿ���Ŭ������ ������) { => �Ű�����
		 * 
		 *    �ش� ���ܰ� �߻����� �� ������ ����
		 * 
		 * }
		 * 
		 */
		try {
		 
			System.out.println(num1 / num2);
		 
		} catch(ArithmeticException e) {
			
		
			System.out.println("�� ��° ������ 0�� �Ϸ��Ͻø� ���� ���� �����ϴ�.");
		}
		
		System.out.println("���α׷� ����");
	}
	
	public void homeWork() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�޴��� �������ּ���");
			System.out.println("1. �߰��ϱ�");
			System.out.println("2. �˻��ϱ�");
			int menuNo = 0;
			
			try {
			    menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
			    System.out.println("���ڸ� �Է���");

			    // ����ó�� ��  catch���� ������ϴ� ������ ��¹��� �ƴ�
			} 
			sc.nextLine();
			System.out.println(menuNo + "�� �޴��� �����ϼ̽��ϴ�.");
		} 
	}
	
	public void method2() {
		
		//System.out.println("hi");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���(0�� ����) >>");
		
		try {
		int num = sc.nextInt();
		// InputMismatchException
		
		
		System.out.println("100�� �Է°����� ���� ��� : " + (100 / num));
		// ArithmeticException
		} catch(InputMismatchException e) {// 1. ���� �Է¹��� ���� �������� �Ǵ�
			System.out.println("���ڷ� �� �������� �ƴմϴ�.");
		} catch(ArithmeticException e) { // 2. ������ �´ٸ� 0���� �Ǻ�
			System.out.println("0�� �ȵǿ�..");
			
			
		}
		
		System.out.println("���α׷� ����");
	}
	
	public void method3() {
		//�迭
		Scanner sc = new Scanner(System.in);
		
		//����ڿ��� �������� �Է¹޾Ƽ�
		System.out.print("�������� �Է����ּ��� > ");
		
		// InputMismatchException : ��ĳ�� �޼ҵ��� �ڷ����� ��ġ���� ������
		// NegativeArraySizeException : �迭�� ũ�⸦ ������ �����ϸ�
		// ArryIndexOutOfBoundsException : �迭�� ũ�⺸�� ū �ε����� �����ϸ�
		
		try {
		int size = sc.nextInt();
		
		//�Է¹��� ��ŭ�� ũ�⸦ ���� �迭�� ���� �� �Ҵ��ϰ�
		int[] arr = new int[size];
		
		
		//100��° �ε��� ���� ���
		System.out.println(arr[100]);
		
		} catch(InputMismatchException e) {
			e.printStackTrace();
		}
		  catch(RuntimeException e) {
			System.out.println("������ ��, ����x, 100����ūx");
		}/* catch(InputMismatchException e) {
			System.out.println("������ ��");
		} catch(NegativeArraySizeException e) {
			System.out.println("���� xx");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("101���� ū��..");
		}
		*/
	}

}
