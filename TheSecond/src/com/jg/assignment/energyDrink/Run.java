package com.jg.assignment.energyDrink;

import java.util.Scanner;

import com.jg.assignment.energyDrink.EnergyDrink;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EnergyDrink drink = new EnergyDrink();
		
		System.out.println("���� ������ �帵ũ ������ ����ּ���> ");
		
		System.out.print("���? : ");
		String drinkFlavor = sc.nextLine();
		drink.setDrinkFlavor(drinkFlavor);
		
		System.out.print("���� ������(�뷮): ");
		int size = sc.nextInt();
		drink.setSize(size);
		
		System.out.print("���� ���� : ");
		int number = sc.nextInt();
		drink.setNumber(number);
		
		System.out.print("���̽��� ����(true / false) : ");
		boolean iceCup = sc.nextBoolean();
		drink.setIceCup(iceCup);
		
		System.out.print("��к��� ����(true / false) : ");
		boolean plasticBag = sc.nextBoolean();
		drink.setPlasticBag(plasticBag);
		
		boolean exit = false;
		
		while (!exit) {
			System.out.println("\n==== ���� �������� ====");
			System.out.println(drink.info());
			
			if(drink.getNumber() > 3) {
				System.out.println("���� �����ϼ̴µ� ������ ��ư�����.");
			}
			
			System.out.print("\n1.���� ���� / 2. ���̽� �� / 3. ���� > ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch (select) {
			case 1 : drink.bag(); break;
			case 2 : drink.cup(); break;
			case 3 : exit = true; break;
			default : System.out.println("�ٽ� �������ּ���.");
			}
		}
		
		System.out.println("�ȳ���������. KH�������̿����ϴ�.^_____^");
		
	}
}