package com.jg.assignment.pizza.run;

import java.util.Scanner;

import com.jg.assignment.pizza.vo.Pizza;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pizza pizza = new Pizza();
		
		System.out.print("���� ������ �������ּ��� > ");
		String type = sc.nextLine();
		pizza.setType(type);
		
		System.out.print("����� �Է����ּ��� (S / M / L) > ");
		String size = sc.nextLine();
		pizza.setSize(size);
		
		System.out.print("���� ���� > ");
		int number = sc.nextInt();
		pizza.setNumber(number);
		
		System.out.print("ġ�� ũ����Ʈ �߰� ����(true / false) > ");
		boolean cheeseCrust = sc.nextBoolean();
		pizza.setCheeseCrust(cheeseCrust);
		
		System.out.print("��� ���� (true / false) > ");
		boolean delivery = sc.nextBoolean();
		pizza.setDelivery(delivery);
		
		boolean exit = false;
		while(!exit) {
			System.out.println("======== �ֹ� ���� ========");
			System.out.println(pizza.info());
			
			if(pizza.getNumber() >= 3) {
				System.out.println("���ڰ� ������ ��޷� �����ô°� ��õ�����!");
			}
			
			System.out.println("1. ġ�� ũ����Ʈ �߰� / 2. ��� ��û / 3. ���� > ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : pizza.addCheeseCrust(); break;
			case 2 : pizza.requestDelivery(); break;
			case 3 : exit = true; break;
			default : System.out.println("�ٽ� �Է����ּ���. ");
			}
		}
		
	   System.out.println("���ִ� ���ڸ� �� �غ��ص帮�ڽ��ϴ�!");

	}

}

