package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	public void method0() {
		
		/*
		System.out.println("�� ������ �������ƿ�~~");
		System.out.println("�� ������ �������ƿ�~~");
		System.out.println("�� ������ �������ƿ�~~");
		*/
		// �ݺ��ؾ��ϴ� Ƚ���� 328765�� �̶��...?
		
		
		for(
			int i = 0; 
			i < 5;
			i++
			) {
			System.out.println("��������~~");
		}
		
	}
	/*
	 * for��
	 * 
	 * for() {
	 * 
	 * }
	 * 
	 * ��ȣ���� �ݺ��� Ƚ���� �����ϴ� �κ�
	 * �ʱ��; ���ǽ�; ������       �� ������ �̷����
	 * ;; �����ݷ����� ������
	 * 
	 * [ ǥ���� ]
	 * 
	 * for(�ʱ��; ���ǽ�; ������) {
	 *      �ݺ������� �����ϰ����ϴ� �ڵ�;
	 * }
	 * 
	 * - �ʱ�� : �ݺ����� ������ �� "�ʱ⿡ �� �ѹ��� ����"�� ����
	 *          �ݺ��� �� �� �ʿ��� ������ �����ϰ� �ʱ�ȭ �ϴ� ����(�����) => int i = 0;
	 *          
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 *          ���ǽ��� ����� true�� ��� �ݺ��� ����
	 *          ���ǽ��� ����� false�� ��� �ݺ����� ���߰� for�� ���� �������� => i < 5;
	 *          
	 * - ������ : "�ݺ����� �����ϴ� ������ ���Ե� ��"�� �����ϴ� ����
	 *          ���� �ʱ�Ŀ��� ����� ������ ������ ������ �ۼ�
	 *          �� ��, ���������� ���������ڸ� �����                        => i++                  
	 */

   public void method1() {
	   // ����~~¥ �ܼ��ϰ�
	   // 1
	   // 2
	   // 3
	   // 4
	   // 5
	  /* System.out.println(1);
	   System.out.println(2);
	   System.out.println(3);
	   System.out.println(4);
	   System.out.println(5); */
	   
	   
	   for(/*1(�ʱ��)*/int i = 1; /*2(���ǽ�)*/i <= 5; /*4*/ i++) {
		   /*3*/System.out.println(i + "�� �ݺ�");
	
	   }
	   
	   // �� �׷��� ¥��¥���̵�
	   // for���� �̿��ؼ� �ݺ��� 3�� �Ѵٰ� ����
	   //   i, j, k
	   for(int i = 0; i < 3; i++) {
		   System.out.print(i);
	   }
	   
	   for(int i = 0; i < 240; i+=3) {
		   System.out.println(i);
	   }
	   
	   System.out.println("=====================");
	   
	   for(int i = 100; i >=1; i--) {
		   System.out.println(i);
	   }
	 
	   
	
   }
   
   public void gugudan() {
	   
	   // ������ ���α׷�
	   //
	   // ����ڿ��� ������ �Է¹޾Ƽ�
	   // ����ڰ� �Է��� ������ �̿��ؼ� �������� ����غ���
	   //System.out.println("����");
	   
	   // �� �������� ���� ��
	   // �� ���� ����Ͻðڽ��ϱ� > 8
	   // 8���� ����ϰڽ��ϴ�.
	   
	   // 8 X 1 = 8
	   // 8 X 2 = 16
	   // 8 X 3 = 24
	   //   ~
	   // 8 X 9 = 72
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("�� ������ ���α׷���");
	   System.out.print("�� ���� ����Ͻðڽ��ϱ�? > ");
	   int dan = sc.nextInt();
	   System.out.println(dan + "���� ����ϰڽ��ϴ�.");
	   
	   
	   
	/*   System.out.println(dan + " X 1 = " + (dan * 1));
	   System.out.println(dan + " X 2 = " + (dan * 2));
	   System.out.println(dan + " X 3 = " + (dan * 3));
	   System.out.println(dan + " X 4 = " + (dan * 4));
	   System.out.println(dan + " X 5 = " + (dan * 5));
	   System.out.println(dan + " X 6 = " + (dan * 6));
	   System.out.println(dan + " X 7 = " + (dan * 7));
	   System.out.println(dan + " X 8 = " + (dan * 8));
	   System.out.println(dan + " X 9 = " + (dan * 9)); */
	  
	   for(int i = 1; i <= 9; i++) {
		   System.out.println(dan + " X " + i + " = " +(dan * i));
	   }
	   
   }
   
   public void method2() {
	   
	   // �١ڡ�
	   // �ڡ١�
	   // �١ڡ�
	   
	   //System.out.println("�١ڡ�");
	   //System.out.println("�ڡ١�");
	   //System.out.println("�١ڡ�");
	   
	   /*
	   System.out.print("��");
	   System.out.print("��");
	   System.out.print("��");
	   System.out.println();
	   System.out.print("��");
	   System.out.print("��");
	   System.out.print("��");
	   System.out.println();
	   System.out.print("��");
	   System.out.print("��");
	   System.out.print("��");
	   */
	   
	   /*for(int i = 0; i < 3; i++) {
		   System.out.print("��");
	   }
	   System.out.println();
	   for(int i = 0; i < 3; i++) {
		   System.out.print("��");
	   }
	   System.out.println();
	   for(int i = 0; i < 3; i++) {
		   System.out.print("��");
	   }
	   System.out.println();
	   */
	   
	   for(int i = 0; i < 3; i++) {
		   for(int j = 0; j < 3; j++) {
			   System.out.print("��");
		   }
		   System.out.println();
	   }
       
	   
	   // ��� : X��° �ݺ��Դϴ�.
	   //      10��° �ݺ����� ���� �ϳ��� ����ֱ�
       for(int i = 0; i < 100; i++) {
    	   
    	   System.out.println((i + 1) + "��° �ݺ��Դϴ�." );
    	   
    	   // (i + 1) == 10 || ( i + 1) == 20 || (i + 1) == 30
    	   // (i + 1) % 10 == 0
    	   if((i + 1) % 10 == 0) {
    		  System.out.println("��"); 
    	   }
       }
   
   }
   
   public void method3() {
	   
	  for(;;) { 
	   System.out.println("������ ���α׷� ~~~");
	   System.out.println("1. ������ ���α׷� �����ϱ�");  
	   System.out.println("2. ������ ���α׷� ������");  
	   System.out.println("3. ���α׷� �����ϱ�");  
	   Scanner sc = new Scanner(System.in);
	   int menuNo = sc.nextInt();
	   sc.nextLine();
	   
	   if(menuNo == 1) {
		   gugudan();
	   } else if(menuNo == 1) {
		   System.out.println("�������� ���۽������");
	   } else if(menuNo == 2) {  
		   System.out.println("�� ��վ��");
	   } else if(menuNo == 3) {
		   System.out.println("���α׷��� �����մϴ�.");
		   return;
	   } else {
		   System.out.println("�̷� �޴��� ����� ~ ");
	   }
	   
	   
   }
   
   
   }  
}
