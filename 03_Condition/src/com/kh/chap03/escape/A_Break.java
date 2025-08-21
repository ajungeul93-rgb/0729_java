package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {
	/*
	 *  ** ���ǻ��� ; switch�� ���ο� �ۼ��ϴ� break������ ������ �ؾ��� �ʿ䰡 ����!
	 *             switch�� ���ο� �ִ� break�� swith���� ���������� �뵵�� ���
	 *             
	 *  break : break���� ������ ���� "���� ����� �ݺ���"�� ��������
	 *          break;���� ���� �ִ� �ݺ��� "�� ��"�� ��������            
	 */
	
	public void method1() {
		
		//System.out.println("�ȳ� ���� �޼ҵ� 1�̾�~");
		
		// ���� �ݺ��ϸ鼭 ������ ����(1 ~ 100)�� �����ؼ� ���
		// 50�� �����Ǹ� �ݺ��� �ߴ�!
		
		while(true) {
			
		   int num = (int)(Math.random() * 100) + 1;
		   
		   System.out.println(num);
		   
		   // ������ �������� 50�̸� ����
		   if(num == 50) {
			   System.out.println("Stop");
			   break;
		   }
		}
	}
	
	public void method2() {
		
		// ���� �ݺ��ϸ鼭 ����ڿ��� �� �� ���ڿ��� �Է¹��� ��
		// �ش� ���ڿ��� ���̸� ���
		// ��, ����ڰ� �Է��� ���ڿ��� "exit"�� ���ٸ� �ݺ��� ����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�ƹ��ų� ������(��, ���Ḧ ���ϽŴٸ� 'exit'�� �Է����ּ���.)");
			String keyword = sc.nextLine();
			
			System.out.println(keyword + "��(��)" + keyword.length() + "���� �Դϴ�!");
			
			if(keyword.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
			}
		}
		
	}
	
	// �� �� ����ڷκ��� �������� �Է¹ް�
	// ���࿡ �Է��� ���ڰ� 0���� �۴ٸ� "���α׷��� �����մϴ�."��� ������ ����ϰ� �����Ͻÿ�!
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�������� �Է����ּ���(�����Է½� ����.) > ");
			int num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
	
	/*
	 * ����ڷκ��� �� ���� �������� �Է¹޾Ƽ�
	 * �Է¹��� ���ں��� 1������ ��� ���ڸ� ����غ��ƿ�.
	 * 
	 * ��, �Է¹޴� ������ 1���� Ŀ���մϴ�.
	 * 
	 * ���� 1�̸��� ���ڸ� �Է¹޾Ҵٸ� "1�̻��� ���ڸ� �Է����ּ���"��� ����� ��
	 * �ٽ� ����ڿ��� ���� �Է¹��� �� �ֵ��� �����ƿ�
	 * 
	 * ��� ����)
	 * 1�̻��� ���ڸ� �Է��ϼ��� > 4
	 * 4 3 2 1
	 * 
	 *  1�̻��� ���ڸ� �Է��ϼ��� > -1
	 *  1�̻��� ���ڸ� �Է��ϼ���!
	 *  1�̻��� ���ڸ� �Է��ϼ��� > 6
	 *  6 5 4 3 2 1
	 * 
	 */
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.print("1�̻��� ���ڸ� �Է����ּ���. > ");
		int num = sc.nextInt();
		
		if(num > 1) {
		  
		 for(int i = num; i > 0; i--) {
			 System.out.println(i + " "); }
		     System.out.println(""); 
		  } else {
			 System.out.println("1���� ū ���ڸ� �Է��ϼ���!!");
		  }
		
	  }
		/*int num = 0;
		
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� > ");
			num = sc.nextInt();
			if(num <1) System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}*/
   }
}
