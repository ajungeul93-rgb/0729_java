package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class ArrayRun {

	public static void main(String[] args) {

		// �迭�� Ư¡
		
		// �ڳ����� ������ �������� ������ �����ϴ�.��
		// ���� �ڷ��������� ���� �� �ִ� => ���� ����(homogeneous vowels)
		// �ϳ��� �迭�� ���� ���� ���� �� ����
		// �޸𸮻� ����
		// �����ڷ���
		// �ε��������� ������
		// ��Ȯ�� ũ�⸦ ����ؾ��� => ũ�⸦ �ٲٴ� ���� �Ұ�����
		
		//int[] nums = new int[3];
		//String[] strs = new String[5];
		
		// �ڹٿ��� �⺻�ڷ����� ������ ��������
		// ���� ������
		// �����ڷ��� ������ ���Ե� �� �ִ� ���� ������ ���ּҰ���
		
		// ��ü�迭�� ���� �� �Ҵ�!
		// [ ǥ���� ]
		// �����ڷ���[] �迭�ĺ��� = new �����ڷ���[�迭ũ��];
		
		Restaurant[] restaurants = new Restaurant[3];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < restaurants.length; i++) {
			
			System.out.print("��ȣ���� �Է��ϼ��� > ");
			String storeName = sc.nextLine();
			
			System.out.print("�ּҸ� �Է��ϼ��� > ");
			String address = sc.nextLine();
			
			System.out.print("��ǥ �޴��� �Է��ϼ��� > ");
			String mainMenu = sc.nextLine();
			
			restaurants[i] = new Restaurant(storeName, address, mainMenu);
		}
		
		// System.out.println(restaurants[0]);
		// �ּҰ��� Ȯ���ϰ� �;��� ���� �ƴ�
		// System.out.print(restaurants);
		// �迭�� �ּҰ�
		// System.out.println(restaurants[0]);
		// 0�� ��ü�� �ּҰ�
		//System.out.println(restaurants[0].getMainMenu());
		
		/*
		System.out.print(restaurants[0].information());
		System.out.print(restaurants[1].information());
		System.out.print(restaurants[2].information());
        */
		
		for(int i = 0; i < restaurants.length; i++) {
			System.out.println(restaurants[i].information());
		}
		
		System.out.print("��ȣ���� �Է����ּ��� > ");
		String searched = sc.nextLine();
		
		for(int i = 0; i < restaurants.length; i ++) {
			if(searched.equals(restaurants[i].getStoreName())) {
				System.out.println("��ǥ �޴� : " + restaurants[i].getMainMenu());
			}
		}
	}

}
