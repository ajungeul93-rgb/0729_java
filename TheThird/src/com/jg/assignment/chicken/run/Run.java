package com.jg.assignment.chicken.run;

import java.util.Scanner;
import com.jg.assignment.chicken.vo.Chicken;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Chicken ck = new Chicken();
		
		System.out.print("치킨 맛을 선택해주세요 > ");
		String flavor = sc.nextLine();
		ck.setFlavor(flavor);
		
		System.out.print("몇 조각 하시겠어요? > ");
		int pieces =sc.nextInt();
		ck.setPieces(pieces);
		
		System.out.print("사이드 메뉴 추가 하시겠습니까? (true/false): ");
		boolean sideMenu = sc.nextBoolean();
		ck.setSideMenu(sideMenu);
		
		System.out.print("배달 여부(true/false) : ");
		boolean delivery = sc.nextBoolean();
		ck.setDelivery(delivery);
		
		if(ck.getDelivery()) {
		
		System.out.print("배달 받으실 주소를 입력해주세요. : ");
		sc.nextLine();
		String address = sc.nextLine();
		ck.setAddress(address);
		
		ck.requestDelivery();
		
		}
		
		boolean exit = false;
		while (!exit) {
			System.out.println("======== 주문 정보 ========");
			System.out.println(ck.info());
			
			System.out.println("1.사이드 메뉴 추가 / 2.배달 요청 / 3.종료 > ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1 : ck.addSideMenu(); break;
			case 2 : if(!ck.getDelivery()) {
				     sc.nextLine();
				     System.out.print(" 배달 주소 입력:  >");
				     ck.setAddress(sc.nextLine());
			}
			         ck.requestDelivery(); break;
			case 3 : exit = true; break;
			default : System.out.println(" 다시 입력해주세요.");
			}
		}
		
	}

}


