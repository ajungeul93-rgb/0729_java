package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args ) {

		// Restaurant r1 = new Restaurant();
		// System.out.println(r1.info());

		// 1��
		// ����ڿ��� �Ĵ��� ������ �Է¹޾Ƽ�
		// �Է¹��� �Ĵ��� ������ ������ִ� ���α׷�
		// 3���� �Ĵ������� �Է¹ްڴٰ� ����
		Scanner sc = new Scanner(System.in);

		Restaurant r0 = null;
		Restaurant r1 = null;
		Restaurant r2 = null;

		for (int i = 0; i < 3; i++) {
			System.out.print("�Ĵ��� ��ȣ�� �Է����ּ��� > ");
			String storeName = sc.nextLine();

			System.out.print("�Ĵ��� �ּҸ� �Է����ּ��� > ");
			String address = sc.nextLine();

			System.out.print("�Ĵ��� �ַ¸޴��� �Է����ּ��� > ");
			String mainMenu = sc.nextLine();
			// �迡 �Է¹��� ���� �����ϴ� ���
			if (i == 0) {
				r0 = new Restaurant(storeName, address, mainMenu);
			} else if (i == 1) {
				r1 = new Restaurant(storeName, address, mainMenu);
			} else if (i == 2) {
				r2 = new Restaurant(storeName, address, mainMenu);
			}
		}
		System.out.println(r0.information());
		System.out.println(r1.information());
		System.out.println(r2.information());
		
		
		
		// 1�� setter ȣ��
		// 2�� ������ �Ű������� ���ڰ��� ����

		/*
		 * System.out.print("�Ĵ��� ��ȣ�� �Է����ּ��� > "); String storeName2 = sc.nextLine();
		 * System.out.print("�Ĵ��� �ּҸ� �Է����ּ��� > "); String address2 = sc.nextLine();
		 * System.out.print("�Ĵ��� �ַ¸޴��� �Է����ּ��� > "); String mainMenu2 = sc.nextLine();
		 * 
		 * Restaurant r2 = new Restaurant(storeName, address, mainMenu);
		 * 
		 * 
		 * System.out.print("�Ĵ��� ��ȣ�� �Է����ּ��� > "); String storeName3 = sc.nextLine();
		 * System.out.print("�Ĵ��� �ּҸ� �Է����ּ��� > "); String address3 = sc.nextLine();
		 * System.out.print("�Ĵ��� �ַ¸޴��� �Է����ּ��� > "); String mainMenu3 = sc.nextLine();
		 * 
		 * Restaurant r3 = new Restaurant(storeName, address, mainMenu);
		 * 
		 * System.out.println(r.information()); System.out.println(r2.information());
		 * System.out.println(r3.information());
		 */

		// 2��
		// ����ڿ��� ��ȣ���� �Է¹޾Ƽ�
		// �Է¹��� ��ȣ�� ��ġ�ϴ� �Ĵ��� ���θ޴��� ������ִ� ���α׷�
        
		
		System.out.print("ã���� ���Ը��� �Է����ּ��� > ");
		String searched = sc.nextLine();
		
		
		if(searched.equals(r0.getStoreName())) {
			System.out.println("��ǥ �޴� : " + r0.getMainMenu());
		} 
		if(searched.equals(r1.getStoreName())) {
			System.out.println("��ǥ �޴� : " + r1.getMainMenu());
		}
	    if(searched.equals(r2.getStoreName())) {
	    	System.out.println("��ǥ �޴� : " + r2.getMainMenu());
	    }
	}

}
