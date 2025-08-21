package com.jg.assignment.chicken.run;

import java.util.Scanner;
import com.jg.assignment.chicken.vo.Chicken;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Chicken ck = new Chicken();
		
		System.out.print("ġŲ ���� �������ּ��� > ");
		String flavor = sc.nextLine();
		ck.setFlavor(flavor);
		
		System.out.print("�� ���� �Ͻðھ��? > ");
		int pieces =sc.nextInt();
		ck.setPieces(pieces);
		
		System.out.print("���̵� �޴� �߰� �Ͻðڽ��ϱ�? (true/false): ");
		boolean sideMenu = sc.nextBoolean();
		ck.setSideMenu(sideMenu);
		
		System.out.print("��� ����(true/false) : ");
		boolean delivery = sc.nextBoolean();
		ck.setDelivery(delivery);
		
		if(ck.getDelivery()) {
		
		System.out.print("��� ������ �ּҸ� �Է����ּ���. : ");
		sc.nextLine();
		String address = sc.nextLine();
		ck.setAddress(address);
		
		ck.requestDelivery();
		
		}
		
		boolean exit = false;
		while (!exit) {
			System.out.println("======== �ֹ� ���� ========");
			System.out.println(ck.info());
			
			System.out.println("1.���̵� �޴� �߰� / 2.��� ��û / 3.���� > ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1 : ck.addSideMenu(); break;
			case 2 : if(!ck.getDelivery()) {
				     sc.nextLine();
				     System.out.print(" ��� �ּ� �Է�:  >");
				     ck.setAddress(sc.nextLine());
			}
			         ck.requestDelivery(); break;
			case 3 : exit = true; break;
			default : System.out.println(" �ٽ� �Է����ּ���.");
			}
		}
		
	}

}


