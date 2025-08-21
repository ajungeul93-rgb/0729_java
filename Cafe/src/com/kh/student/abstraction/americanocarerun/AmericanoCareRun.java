package com.kh.student.abstraction.americanocarerun;

import java.util.Scanner;

import com.kh.student.abstraction.vo.Americano;


public class AmericanoCareRun {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Americano coffee = new Americano();
		
		System.out.println("�Ƹ޸�ī�� �ֹ��ϱ� > ");
	
		
		System.out.print("ICE or HOT : ");
		String type = sc.nextLine();
		coffee.setType(type);
		
		System.out.print("������ (S/M/L): ");
		String size = sc.nextLine();
		coffee.setSize(size);
		
		System.out.print("���� �µ�: ");
		int temperature = sc.nextInt();
		coffee.setTemperature(temperature);
		
		sc.nextLine();
		
		System.out.print("�� �߰� ���� (true/false): ");
		boolean hasShot = sc.nextBoolean();
		coffee.setHasShot(hasShot);
		
		sc.nextLine();
		
		System.out.print("Ŀ�� ���ϱ� (1~10): ");
		int strength = sc.nextInt();
		coffee.setStrength(strength);
		
		sc.nextLine();
		
		boolean exit = false;
		
		while (!exit) {
			System.out.println("\n==== �ֹ��� Ŀ�� ====");
			System.out.println(coffee.info());
			
			
			if(coffee.getTemperature() > 60) {
				System.out.println("�ʹ� �߰ſ�� ������ �� ��õ�帳�ϴ�.");
			}
			
			System.out.print("\n1. Ŀ�� ���� ���ϰ� ����� / 2. ������ / 3. ���� > ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1 : coffee.stir(); break;
			case 2 : coffee.coolDown(); break;
			case 3 : exit = true; break;
			default: System.out.println("�ٽ� �������ּ���.");
			}
		}
		
		System.out.println("�̿��� �ּż� �����մϴ�(^///^)");
		
	}

}
