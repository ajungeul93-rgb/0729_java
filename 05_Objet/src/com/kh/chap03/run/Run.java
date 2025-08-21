package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.Coffee;

public class Run {
	
	public static void main(String[] args) {
		
		// Coffee��� Ŭ����(���赵)�� ������ ��ü ����
		Coffee coffee = new Coffee(); // <- ��ü ����      instanceȭ
		// 1. �����ڷ��� 
		// Ŭ������ ����ٴ� ���� == ����� ���� �ڷ����� ����ڴ�.
		// 2. ���� ���� �ڷ����� ���� ���� ���� ���� + ���
		// 3. �ּ� ���� ����
		
		//System.out.println(coffee.info());
		// �⺻���� �������
		// => ���� : 0, �Ǽ� : 0.0, ������ : null, ���� : '', boolean : false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ŀ�Ǹ��� ������> ");
		String name = sc.nextLine();
		coffee.setName(name);
		//String coffeeName = coffee.getName();
		
		System.out.print("���� ������ �����ΰ���> ");
		String bean = sc.nextLine();
		coffee.setBean(bean);
		
		System.out.print("������� � �������ΰ��� > ");
		String size = sc.nextLine();
		coffee.setSize(size);
		
		System.out.print("������ ���ΰ���> ");
		int price = sc.nextInt();
		coffee.setPrice(price);
		
		String info = coffee.info();
		System.out.println("===============");
		System.out.println(info);
		
		
		
	}

}
